import spark.SparkContext
import spark.SparkContext._
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._


  object Test3 {
    def main(args: Array[String]) {
      val now = new Date
	  val df = getDateInstance(LONG, Locale.FRANCE)
	  println(df format now)
      System.exit(0)
    }
  }