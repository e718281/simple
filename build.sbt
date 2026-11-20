val `root/file` = file(".").getCanonicalFile

scalaVersion := scalaV.v213
name         := "simple"

val `nat/file` = `root/file` / "impractical" / "simple-nat"
lazy val nat   = crossProject(JSPlatform, JVMPlatform)
  .in(`nat/file`)
  .settings(
    scalaVersion       := scalaV.v213,
    name               := "nat",
    crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3),
    scalafmtOnCompile  := true,
    useKindProjector
  )

val `selfspace/file` = `root/file` / "selfspace"
lazy val selfspace   = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .in(`selfspace/file`)
  .settings(
    scalaVersion       := scalaV.v213,
    name               := "selfspace",
    crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3),
    scalafmtOnCompile  := true
  )
