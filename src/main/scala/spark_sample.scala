import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext._

  val conf = new SparkConf().setAppName("SparkSample")
  val sc = new SparkContext(conf);
  sc.setLogLevel("WARN")

object spark_sample {

  def main(args:Array[String])
  {
    val l = List("arun","vishnu","swathi","sachin","aman","pratap")
    val rdd = l.map(x=>(x,1))

  }

}