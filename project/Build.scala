import sbt._
import Keys._

object ApplicationBuild extends Build {

    val appName = "todolist"
    val appVersion = "1.0-SNAPSHOT"
    
    libraryDependencies ++= Seq(
  	"postgresql" % "postgresql" % "8.4-702.jdbc4"
    )

}
