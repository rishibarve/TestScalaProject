# TestScalaProject
A very basic example to use scala classes in pyspark.

start the pyspark with  --driver-class-path <path-to-jar TestScalaProject-1.0-SNAPSHOT-jar-with-dependencies.jar>

crossPlatformUtil = sc._jvm.com.test.scala.project.util.CrossPlatformUtil
crossPlatformUtil.quoteMasterYoda()

Do or do not. There is no try.


list1 = [[1,2,3],[2,3,4]]
cols = ["col1","col2","col3"]
df = spark.createDataFrame(list1, cols)
df.show()

+----+----+----+                                                                
|col1|col2|col3|
+----+----+----+
|   1|   2|   3|
|   2|   3|   4|
+----+----+----+

crossPlatformUtil.quoteMasterYodaInAllRows(df._jdf).show()


+----+----+----+--------------------+
|col1|col2|col3|    master_yoda_says|
+----+----+----+--------------------+
|   1|   2|   3|Do or do not. The...|
|   2|   3|   4|Do or do not. The...|
+----+----+----+--------------------+
 
