name := "hostname"

organization := "com.evolutiongaming"

homepage := Some(new URL("https://github.com/evolution-gaming/hostname"))

startYear := Some(2018)

organizationName := "Evolution"

organizationHomepage := Some(url("https://evolution.com"))

publishTo := Some(Resolver.evolutionReleases)

versionPolicyIntention := Compatibility.BinaryCompatible

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.13.16", "2.12.20", "3.3.5")

scalacOptions ++= crossSettings(
  scalaVersion.value,
  if3 = Seq(),
  if2 = Seq(
    "-Xsource:3",
  )
)

Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"          % "3.2.19" % Test,
  "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % Test
)

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

addCommandAlias("check", "all versionPolicyCheck Compile/doc")
addCommandAlias("build", "+all compile test")

def crossSettings[T](scalaVersion: String, if3: Seq[T], if2: Seq[T]): Seq[T] = {
  CrossVersion.partialVersion(scalaVersion) match {
    case Some((3, _)) => if3
    case Some((2, 12 | 13)) => if2
    case _ => Nil
  }
}
