import Commons._
import Dependencies._

git.baseVersion := "0.1"

lazy val root = (project in file(".")).
  enablePlugins(GitVersioning).
  settings(commonSettings: _*).
  settings(
    name := "sbt-template",
    scalaVersion := "2.11.6",
    libraryDependencies ++= backendDependencies
  )
