package javas.test.dataframes;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;

public class dataframes {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("SparkDemo").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);
        System.out.println("Spark version: " + sc.version());
        sc.stop();
    }
}