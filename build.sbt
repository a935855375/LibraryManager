
name := "Library Manager"

version := "2.6.6-SNAPSHOT"

scalaVersion := "2.12.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters)


libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += ws
libraryDependencies += ehcache
libraryDependencies += jcache
libraryDependencies += "org.jsr107.ri" % "cache-annotations-ri-guice" % "1.0.0"


libraryDependencies += "com.typesafe.play" %% "anorm" % "2.5.3"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

libraryDependencies += "org.reactivemongo" %% "play2-reactivemongo" % "0.12.7-play26"

libraryDependencies += "com.typesafe.play" %% "play-mailer" % "6.0.1"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "6.0.1"