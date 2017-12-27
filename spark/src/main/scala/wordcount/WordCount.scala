package wordcount

import org.apache.spark.{SparkContext, _}

/**
  * Created by RojerAlone on 2017-12-26
  */
object WordCount {

    def main(args: Array[String]): Unit = {
        val config = new SparkConf
        config.setAppName("Word Count").setSparkHome("/usr/local/spark").setMaster("local")
        val sc = new SparkContext(config)
        val input = sc.textFile(getClass.getResource("/input.txt").getPath) // 相对路径
        val count = input.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
        count.saveAsTextFile(getClass.getResource("/").getPath + "outfile") // 写到 target 文件夹中
        println("OK")
    }

}
