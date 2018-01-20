name := "spark_sample"



version := "0.1"

scalaVersion := "2.10.4"

// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2" % ,
  "com.holdenkarau" %% "spark-testing-base" % "1.5.2_0.6.0" % "test"
  // "org.scalatest" % "scalatest_2.10" % "3.0.1" % "test",
)
