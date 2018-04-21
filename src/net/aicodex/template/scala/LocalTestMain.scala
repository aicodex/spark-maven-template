package net.aicodex.template.scala

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object LocalTestMain {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("mySpark")
    conf.setMaster("local")
    val sc = new SparkContext(conf)
    val sparkSession = SparkSession.builder.config(conf).getOrCreate()
  }
}
