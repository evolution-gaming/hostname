name := "hostname"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/hostname"))

startYear := Some(2018)

organizationName := "Evolution"

organizationHomepage := Some(url("http://evolution.com"))

publishTo := Some(Resolver.evolutionReleases)

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.13.6", "2.12.14")

Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"          % "3.2.9" % Test,
  "org.scalatest" %% "scalatest-funsuite" % "3.2.9" % Test
)

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true

//addCommandAlias("check", "all versionPolicyCheck Compile/doc")
addCommandAlias("check", "show version")
addCommandAlias("build", "+all compile test")
