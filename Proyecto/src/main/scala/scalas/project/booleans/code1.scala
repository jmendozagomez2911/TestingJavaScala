package scalas.project.booleans


object code1 {
  def main(args: Array[String]) = {
    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder.master("local[1]").appName("SparkByExample").getOrCreate

    val data = Seq((1, "John"), (2, "Jane"), (3, "Bob"))
    val df = spark.createDataFrame(data).toDF("id", "name")
    df.show()
    spark.stop()
  }
}
