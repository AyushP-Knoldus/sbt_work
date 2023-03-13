ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "multi-build-project",
    idePackagePrefix := Some("com.knoldus")
  )
lazy val core = (project in file("core"))
  .settings(
    name := "core",
   libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.15" % Test ,
      "com.knoldus" %% "sbt-assignment-project" % "0.1.0-SNAPSHOT")
  )
  .dependsOn(util)


lazy val util = (project in file("util"))
  .settings(
    name := "util"
  )
