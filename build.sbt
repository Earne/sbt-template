import Commons._
import Dependencies._

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "sbt-template",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.11.5",
    libraryDependencies ++= backendDependencies
  )
