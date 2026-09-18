val `root/file` = file(".").getCanonicalFile

val `nat/file` = `root/file` / "impractical" / "simple-nat"
lazy val nat   = crossProject(JSPlatform, JVMPlatform).in(`nat/file`)

// ===
scalaVersion := scalaV.v213
name         := "simple"

// ===
nat.jvm / scalaVersion       := scalaV.v213
nat.js / scalaVersion        := scalaV.v213
nat.jvm / crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
nat.js / crossScalaVersions  := Seq(scalaV.v212, scalaV.v213, scalaV.v3)
