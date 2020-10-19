import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.markortleb"
ThisBuild / organizationName := "markortleb"

lazy val root = (project in file("."))
  .settings(
    name := "ProjectEuler4"
  )


