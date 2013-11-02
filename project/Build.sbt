import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "TodoList"
  val appVersion      = "1.0"

  val appDependencies = Seq(
    // Add your project dependencies here,
  )

  val main = PlayProject(
    appName, appVersion, appDependencies, mainLang = JAVA
  ).settings(
    // Add your own project settings here      
  )

  libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "postgresql" % "postgresql" % "8.4-702.jdbc4"
)

}
