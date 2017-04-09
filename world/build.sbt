import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.1-SNAPSHOT"
    )),
    name := "World_v17.01",
    libraryDependencies += scalaTest % Test
  )
