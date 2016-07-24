name := "[STUB]"

version := "SNAPSHOT"

organization := "name.dmitrym"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.4" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.8.4" % "test"
)

scalacOptions ++= Seq(
  "-deprecation", "-feature", "-optimise", "-unchecked", "-Xlint:_", "-Ydead-code", "-Yopt:_", "-Ywarn-dead-code",
  "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard"
  )

scalacOptions in Test ++= Seq(
  "-Yrangepos"
  )

javacOptions ++= Seq(
  "-deprecation", "-Xlint"
  )

incOptions := incOptions.value.withNameHashing(true)
