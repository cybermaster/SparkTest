import spark.SparkContext
import spark.SparkContext._

object Test1 {
  def main(args: Array[String]) {
    val sc = new SparkContext("local", "SparkTest")
    println(sc.parallelize(1 to 10).reduce(_ + _))
    System.exit(0)
  }
}
