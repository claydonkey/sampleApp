name := """sampleApp"""

version := "1.0-SNAPSHOT"

autoScalaLibrary := false

scalaVersion := "2.11.4"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)
