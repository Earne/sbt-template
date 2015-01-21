import sbt._

object Dependencies {
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.1"

  val backendDependencies =
    Seq(scalatest % "test")
}