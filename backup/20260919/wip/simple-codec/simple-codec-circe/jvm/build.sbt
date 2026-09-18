name := "simple-codec-circe"

enableZIOTest := true

libraryDependencies ++= libScalax.shapeless.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`circe`.value
libraryDependencies ++= libScalax.`play-json`.value
libraryDependencies ++= libScalax.`circe-extras`.value

scalafmtOnCompile := true
