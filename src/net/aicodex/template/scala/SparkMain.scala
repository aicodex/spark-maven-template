package net.aicodex.template.scala

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object SparkMain {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("yarn-client").setAppName("Template")
    val sc = new SparkContext(conf)
    val sparkSession = SparkSession.builder.config(conf).getOrCreate()
  }
}
