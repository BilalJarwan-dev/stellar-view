name := "SparkPoC"

version := "0.1"

scalaVersion := "2.13.8" // This matches Spark's Scala version

// Spark Dependencies
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.5",
  "org.apache.spark" %% "spark-sql" % "3.5.5",
  "org.apache.spark" %% "spark-streaming" % "3.5.5",
  "org.apache.logging.log4j" % "log4j-api" % "2.17.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.17.1"
)

// SBT Assembly Settings
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.10.6")
//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.2.0") // Example version
// Sbr stuff
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case "reference.conf" => MergeStrategy.concat
  case x => MergeStrategy.first
}

// Enable Forking
fork in run := true
