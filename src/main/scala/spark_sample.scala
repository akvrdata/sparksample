import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext._

 

object spark_sample {

  def main(args:Array[String])
  {

     val conf = new SparkConf().setAppName("soark_sample")
    val sc = new SparkContext(conf);
    sc.setLogLevel("WARN")

    val l = List("arun","vishnu","swathi","sachin","aman","pratap")
    val rdd = l.map(x=>(x,1))
rdd.take(5)

  }

}
