import Commons._
import Dependencies._

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "sbt-template",
    version := "1.0",
    scalaVersion := "2.11.5",
    libraryDependencies ++= backendDependencies
  )