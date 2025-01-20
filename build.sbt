ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Exercises"
  )
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  "org.scala-lang" % "scala-reflect" % scalaVersion.value, // For TypeTag
  "com.github.mifmif" % "generex" % "1.0.2"

)
