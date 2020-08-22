name := "iterator-testcoverage-scala"

version := "0.1"

scalaVersion := "2.13.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"       % "3.2.1"  % Test,
  "org.mockito"   %  "mockito-inline"  % "3.5.2" % Test,
  "com.novocode"  %  "junit-interface" % "0.11"   % Test
)

enablePlugins(JavaAppPackaging)
