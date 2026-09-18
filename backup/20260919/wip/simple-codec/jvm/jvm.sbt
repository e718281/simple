name := "simple-codec"

enableZIOTest := true

libraryDependencies ++= libScalax.shapeless.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`scala-reflect`.value
libraryDependencies ++= libScalax.`scala-compiler`.value
libraryDependencies ++= libScalax.`magnolia1.scala3`.value
libraryDependencies ++= libScalax.`magnolia1.scala2`.value

scalacOptions ++= {
  if (scalaVersion.value.startsWith("3.")) {
    List("-Yretain-trees")
  } else List.empty
}