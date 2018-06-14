name := "pac4jerr"
 
version := "1.0" 
      
lazy val `pac4jerr` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  jdbc ,
  ehcache ,
  ws ,
  specs2 % Test ,
  guice,
  "org.pac4j" % "play-pac4j" % "4.1.1",
  "org.pac4j" % "pac4j-http" % "2.2.0",
  "org.pac4j" % "pac4j-oauth" % "2.2.0"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      