name := "simple-adt"

libraryDependencies ++= libScalax.`scala-collection-compat`.value
libraryDependencies ++= libScalax.`simple-induction`.value

enableZIOTest := true
useKindProjector
