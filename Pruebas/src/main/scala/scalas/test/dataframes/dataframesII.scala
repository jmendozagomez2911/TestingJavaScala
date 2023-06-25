package scalas.test.dataframes

import org.apache.spark.sql
case class PersonsCountry(Name: String, Country: String)

object dataframesII {
  def main(args: Array[String]) = {
    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder.master("local[1]").appName("SparkByExample").getOrCreate()
    import spark.implicits._





    spark.stop()
  }
}