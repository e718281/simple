name := "simple-nat"

run / fork := true
run / javaOptions += "-Xss5M"

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-adt`.value
libraryDependencies ++= libScalax.`spire`.value
libraryDependencies ++= libScalax.`breeze`.value
libraryDependencies ++= libScalax.`commons-math3`.value

enableZIOTest := true
