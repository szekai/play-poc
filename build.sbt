name := """play-mongo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.google.inject" % "guice" % "4.0-beta5",
  "javax.inject" % "javax.inject" % "1",
  "org.reactivemongo" %% "reactivemongo" % "0.10.5.0.akka23",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23",
  "org.mockito" % "mockito-core" % "1.10.8" % "test",
"org.webjars" %% "webjars-play" % "2.3.0-2",
"org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "angularjs" % "1.3.0",
  "org.webjars" % "angular-ui-bootstrap" % "0.11.2"
)
