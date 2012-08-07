import spark.SparkContext._
import spark._
import scala.tools.nsc


object WordCount {
  def main(args: Array[String]) {

    val spark = new SparkContext("local", "SparkTest")
    val file = spark.textFile("hdfs://localhost:8020/user/billz/gutenberg/*")
    val counts = file.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    counts.saveAsTextFile("hdfs://localhost:8020/user/billz/gutenberg-spark-output")
    sys.exit()
  }
}
