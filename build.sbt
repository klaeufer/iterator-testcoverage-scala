name := "iterator-testcoverage-scala"

version := "0.1"

scalaVersion := "2.12.9"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"       % "3.0.5"  % Test,
  "org.mockito"   %  "mockito-inline"  % "2.21.0" % Test,
  "com.novocode"  %  "junit-interface" % "0.11"   % Test
)

enablePlugins(JavaAppPackaging)
