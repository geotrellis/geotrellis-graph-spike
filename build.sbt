val deps = Seq(
  "com.azavea.geotrellis" %% "geotrellis-spark" % Version.geotrellis,
  "com.azavea.geotrellis" %% "geotrellis-spark-testkit" % Version.geotrellis,
  "org.scalatest" %% "scalatest" % Version.scalatest % "test",
  "org.apache.spark" %% "spark-core" % Version.spark % "provided",
  "org.apache.hadoop" % "hadoop-client" % Version.hadoop % "provided"
)

val commonSettings = Seq(
  organization := "com.azavea.geotrellis",
  licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html")),
  version := "0.10",
  scalaVersion := "2.11.4",
  shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
)

lazy val resolutionRepos = Seq(
  Resolver.bintrayRepo("azavea", "geotrellis"),
  "OpenGeo" at "https://boundless.artifactoryonline.com/boundless/main"
)

lazy val graph = Project("graph", file("graph")).
  settings(commonSettings: _*).
  settings(
    test in assembly := {},
    assemblyMergeStrategy in assembly := {
      case "reference.conf" => MergeStrategy.concat
      case "application.conf" => MergeStrategy.concat
      case "META-INF/MANIFEST.MF" => MergeStrategy.discard
      case "META-INF\\MANIFEST.MF" => MergeStrategy.discard
      case _ => MergeStrategy.first
    },
    scalaVersion := Version.scala,
    libraryDependencies ++= deps,
    resolvers ++= resolutionRepos
  )
