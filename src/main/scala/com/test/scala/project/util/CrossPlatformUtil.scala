package com.test.scala.project.util

import org.apache.spark.api.java.JavaSparkContext
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.lit

object CrossPlatformUtil {

  def quoteMasterYoda(): Unit = println("Do or do not. There is no try.")

  def quoteMasterYodaInAllRows(df: DataFrame): DataFrame ={
    df.withColumn("master_yoda_says", lit("Do or do not. There is no try."))
  }

}

