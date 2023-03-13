ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-assignment-project",
    idePackagePrefix := Some("com.knoldus")
  )

libraryDependencies += "joda-time" % "joda-time" % "2.12.2"

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.32"

updateOptions := updateOptions.value.withCachedResolution(true)
