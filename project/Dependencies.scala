import sbt._

object Dependencies {
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.4"

  val backendDependencies =
    Seq(scalatest % "test")
}
