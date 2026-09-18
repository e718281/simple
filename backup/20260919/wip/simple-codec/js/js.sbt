name := "simple-codec"

enableZIOTest := true

libraryDependencies ++= libScalax.shapeless.value
libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`magnolia1.scala3`.value
libraryDependencies ++= libScalax.`magnolia1.scala2`.value

Test / scalaJSUseMainModuleInitializer := true
Test / scalaJSUseTestModuleInitializer := false
