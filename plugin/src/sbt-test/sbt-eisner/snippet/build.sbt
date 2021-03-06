scalaVersion := "2.12.13"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-streams" % "2.8.0"
)

enablePlugins(EisnerPlugin)
eisnerTopologiesSnippet := Some("""
  |import snippet._
  |
  |val settings = Settings(source = "topic a", destination = "topic b")
  |
  |List("snippet.EisnerTopology#myTopology" -> EisnerTopology.myTopology(settings))
  |""".stripMargin
)