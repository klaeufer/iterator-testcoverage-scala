name := "iterator-testcoverage-scala"

version := "0.1"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"       % "3.0.5"  % Test,
  "org.mockito"   %  "mockito-inline"  % "2.18.3" % Test,
  "com.novocode"  %  "junit-interface" % "0.11"   % Test
)

enablePlugins(JavaAppPackaging)
