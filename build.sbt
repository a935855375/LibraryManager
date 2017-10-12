name := "Library Manager"

version := "2.6.0-SNAPSHOT"

scalaVersion := "2.12.3"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += jdbc

libraryDependencies += "com.typesafe.play" %% "anorm" % "2.5.3"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
