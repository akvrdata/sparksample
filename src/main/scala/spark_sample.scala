import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext._

 

object spark_sample {

  def main(args:Array[String])
  {

 val conf = new SparkConf().setAppName("spark_sample").setMaster("local[2]").set("spark.executor.memory","1g");
  val sc = new SparkContext(conf);
  sc.setLogLevel("WARN")

    val l = List("arun","vishnu","swathi","sachin","aman","pratap")
    val rdd = l.map(x=>(x,1))

  }

}
