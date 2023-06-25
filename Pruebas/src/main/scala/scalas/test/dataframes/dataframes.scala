package scalas.test.dataframes

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

object dataframes {
  def main(args: Array[String]) = {
    val conf = new SparkConf().set("spark.ui.killEnabled", "false")

    val spark = SparkSession.builder.master("local[1]").appName("SparkByExample").
      getOrCreate()
    import spark.implicits._
    println(
      """
        |diferencias entre dataframe[row] y dataset[T]
        |Datasets can be strongly typed using case classes, which can provide additional type safety and better integration with Scala's type system.
        |In contrast, Dataframes are untyped and rely on stringly-typed column names for column references,
        |which can make them less safe and less easy to refactor.
        |
        |In summary, a DataFrame is just an alias for an untyped Dataset[Row], and both can be used interchangeably for many operations.
        |However, Datasets can provide additional type safety and better integration with Scala's type system.
        |""".stripMargin)


    println("creando dataframe[row]")
    // Create a Dataframe from Row
    val rows = Seq(("Matei Zaharia", "CA"), ("Reynold Xin", "CA"))
    val authorsDF = rows.toDF("Author", "State")
    //checkear si es un dataframe (Dataset[Row])
    println(authorsDF.isInstanceOf[DataFrame]) //true, es un Dataframe o Dataset[Row]
    authorsDF.show()

    //create Dataframe with rows and CASECLASS (TYPE SAFETY)
    // Create a Row
    println("convirtiendo dataframe[row] a dataset[caseClass] mediante .as[caseClass]")

    //doing this, we are converting dataFrame to dataset, because .as[case class] force to DF (dataFrame[Row]) to be type-safety (dataset[PersonCountry])
    //In java, for create a dataset[case class] you need to create a javaBean and encoders to get it. pagina 158 de learning spark,second edition
    val authorsDFII = rows.toDF("Name","Country").as[PersonsCountry]
    println(authorsDFII.getClass) //class org.apache.spark.sql.Dataset
    authorsDFII.show()

    //create Dataframe with read.csv()
    //DDL Syntax
    //schema="date STRING, delay INT, distance INT, origin STRING, destination STRING"
    //flights_df = spark.read.csv(csv_file, schema=schema)



    // Create a Dataframe from path
    val fireSchema = StructType(Array(StructField("CallNumber", IntegerType, true),
      StructField("UnitID", StringType, true),
      StructField("IncidentNumber", IntegerType, true),
      StructField("CallType", StringType, true),
      StructField("CallDate", StringType, true),
      StructField("WatchDate", StringType, true),
      StructField("CallFinalDisposition", StringType, true),
      StructField("AvailableDtTm", StringType, true),
      StructField("Address", StringType, true),
      StructField("City", StringType, true),
      StructField("Zipcode", IntegerType, true),
      StructField("Battalion", StringType, true),
      StructField("StationArea", StringType, true),
      StructField("Box", StringType, true),
      StructField("OriginalPriority", StringType, true),
      StructField("Priority", StringType, true),
      StructField("FinalPriority", IntegerType, true),
      StructField("ALSUnit", BooleanType, true),
      StructField("CallTypeGroup", StringType, true),
      StructField("NumAlarms", IntegerType, true),
      StructField("UnitType", StringType, true),
      StructField("UnitSequenceInCallDispatch", IntegerType, true),
      StructField("FirePreventionDistrict", StringType, true),
      StructField("SupervisorDistrict", StringType, true),
      StructField("Neighborhood", StringType, true),
      StructField("Location", StringType, true),
      StructField("RowID", StringType, true),
      StructField("Delay", FloatType, true)))


    val sfFireFile = "D:/Ficheros/csvs/sf-fire-calls.csv"
    val fireDF = spark.read.schema(fireSchema)
      .option("header", "true")
      .option("delimiter", ",")
      .csv(sfFireFile)


    println(
      """
        |Difference between .as[case class] and .schema(schema) to specify the schema of a DataFrame
        |
        |.as[case class] is a type-safe way to define a schema for a DataFrame.
        |It allows you to map the columns of a DataFrame to the fields of a case class. This is a compile-time check,
        |so you will get an error if the fields of the case class don't match the columns of the DataFrame.
        |
        |.schema(schema) is a way to specify a schema for a DataFrame using a StructType object.
        |This method is less type-safe than .as[case class],
        | as there is no compile-time check to ensure that the schema you define matches the data in the DataFrame
        | types are dynamically assigned during execution.
        |
        |In summary, .as[case class] is a type-safe way to define a schema for a DataFrame,
        |while .schema(schema) is a less type-safe way to define a schema using a StructType object.
        |""".stripMargin)

//-------------------------------------------------------------------------------------------------------------------------------------------------
    //Data‐Frame API query
    //FILTERS
    //PERFECT TO DO IN COD
  //Filter by value
  fireDF.printSchema()
    val fewFireDF = fireDF
      .select("IncidentNumber", "AvailableDtTm", "CallType")
      .where($"CallType" =!= "Medical Incident")
    fewFireDF.show(5, false)

    //Count
    fireDF
      .select("CallType")
      .where(col("CallType").isNotNull)
      .agg(countDistinct(Symbol("CallType")) as "DistinctCallTypes")
      .show()

    //OrderBy
    fireDF
      .select(year($"CallType"))
      .distinct()
      .orderBy(year($"CallType"))
      .show()


    //spark.sql API query
    //Another way using SPARK.SQL
    //PERFECT TO TEST IN SPARK SHELL

    //val fireDF = spark.read.format("parquet").load( """/databricks-datasets/learning-spark-v2/flights/summary-data/parquet/2010-summary.parquet/""")
    fireDF.createOrReplaceTempView("fire_df_tbl")
    spark.sql("""SELECT CallType
    FROM fire_df_tbl WHERE CallType = 'Medical Incident' """).show(10)

//-------------------------------------------------------------------------------------------------------------------------------------------------


    //MANAGED AND UNMANAGED TABLES

    //MANAGED TABLES

/*    For a managed table, Spark manages both the metadata and the data in the file store. This could
      be a local filesystem, HDFS, or an object store such as Amazon S3 or Azure Blob.
      With a managed table, because Spark manages everything, a SQL command such as
      DROP TABLE table_name deletes both the metadata and the data.
      .saveastable()*/


    //UNMANAGED TABLES

/*    For an unmanaged table, Spark only manages the metadata, while you manage the data
      yourself in an external data source such as Cassandra or HBASE.
      With an unmanaged table, command such as DROP TABLE will delete only the metadata, not the actual data.
      .createExternalTable()*/

//-------------------------------------------------------------------------------------------------------------------------------------------------
//TEMP_VIEWS
    //TempViews in Apache Spark are temporary views of dataframes that are used to
    // store the intermediate results of data transformations or to query data directly

    // The difference between a view and a
    //table is that views don’t actually hold the data; tables persist after your Spark application
    //terminates, but views disappear.


//-------------------------------------------------------------------------------------------------------------------------------------------------



    spark.stop()
  }
}