name := "simple-codec-pure-config"

enableZIOTest := true

libraryDependencies ++= libScalax.`shapeless`.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`pureconfig`.value

scalafmtOnCompile := true
