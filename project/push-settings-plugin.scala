object PushSettingsPlugin extends _root_.sbt.AutoPlugin {

  import sbt.*
  import sbt.Keys.*

  override def requires: Plugins = net.scalax.simple.nat.sbt.ProjectKeys

  lazy val developer1 = Developer(
    id = "Mars Liu",
    name = "Liu Xin",
    email = "mars.liu@outlook.com",
    url = uri("https://marchliu.github.io/")
  )

  lazy val developer2 = Developer(
    id = "djx314",
    name = "djx314",
    email = "djx314@sina.cn",
    url = uri("https://github.com/djx314")
  )

  override lazy val projectSettings: Seq[Setting[?]] = List(
    organization         := "net.scalax.simple",
    organizationName     := "Scala Workers",
    organizationHomepage := Some(uri("https://github.com/scala-workers")),
    scmInfo              := Some(
      ScmInfo(
        uri("https://github.com/scalax/simple"),
        "scm:git@github.com:scalax/simple.git"
      )
    ),
    developers           := List(developer1, developer2),
    description          := "Simple, and scalable. Use it to subvert the author's imagination.",
    licenses             := List(License("MIT License", uri("https://github.com/scalax/simple/blob/main/LICENSE"))),
    homepage             := Some(uri("https://github.com/scalax/simple")),
    pomIncludeRepository := { _ => false },
    publishMavenStyle    := true,
    versionScheme        := Some("early-semver")
  )

}

object ScalajsCommonPlugin extends _root_.sbt.AutoPlugin {

  import sbt.*
  import sbt.Keys.*
  import net.scalax.simple.nat.sbt.ProjectKeys.autoImport.*

  override def requires: Plugins = net.scalax.simple.nat.sbt.ProjectKeys

  override lazy val projectSettings: Seq[Setting[?]] = List(baseFilesToCross := {
    val tryValue = baseFilesToCross.?.value
    val newFile  = baseDirectory.value / ".."
    newFile +: tryValue.toList.flatten
  })

}

object ScalajsJsPlugin extends _root_.sbt.AutoPlugin {

  import sbt.*
  import sbt.Keys.*

  private var preSettings: Seq[Setting[?]] = Seq.empty

  def addSetting(set: Setting[_]): Unit = preSettings = set +: preSettings

  /*addSetting {
    {
      import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
      jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()
    }
  }*/

  override lazy val projectSettings: Seq[Setting[?]] = preSettings

}

object SettingsGlobalPlugin extends _root_.sbt.AutoPlugin {

  import sbt.*
  import sbt.Keys.*

  override def requires: Plugins = net.scalax.simple.nat.sbt.ProjectKeys && org.scalafmt.sbt.ScalafmtPlugin

  object autoImport {
    val enableZIOTest = settingKey[Boolean]("enable zio test.")
  }

  import autoImport.*
  import net.scalax.simple.nat.sbt.ProjectKeys.autoImport.*
  import org.scalafmt.sbt.ScalafmtPlugin.autoImport.*

  override lazy val projectSettings: Seq[Setting[?]] = List(
    enableZIOTest := false,
    testFrameworks ++= {
      if (enableZIOTest.value) Seq(new TestFramework("zio.test.sbt.ZTestFramework")) else Seq.empty
    },
    baseCrossFile           := (f => Seq(f / "src" / "codegen")),
    Compile / baseCrossFile := {
      val t = baseCrossFile.value
      f => f / "src" / "main" +: t(f)
    },
    Test / baseCrossFile := {
      val t = (Compile / baseCrossFile).value
      f => (f / "src" / "test") +: (f / "src" / "test-codegen") +: t(f)
    },
    baseFilesToCross := {
      val tryValue = baseFilesToCross.?.value
      val newFile  = baseDirectory.value
      newFile +: tryValue.toList.flatten
    },
    Compile / unmanagedSourceDirectories := {
      import net.scalax.simple.nat.sbt.ProjectKeys.autoImport._
      import djx.sbt.depts.output.Djx314DeptsPlugin.autoImport._
      import inner.CommonUtils._
      import scala.collection.compat._
      val t1    = (Compile / baseFilesToCross).value
      val t2    = (Compile / baseCrossFile).value
      val base  = (Compile / unmanagedSourceDirectories).value
      val sv    = scalaVersion.value
      val files = for (n1 <- t1; n2 <- t2(n1)) yield n2
      val toAdd = for (f1 <- files; f2 <- genDirectory(f1, sv)) yield f2
      val all   = base.map(_.getCanonicalFile).to(Set) ++ toAdd.map(_.getCanonicalFile).to(Set)
      all.to(Seq)
    },
    Test / unmanagedSourceDirectories ++= {
      import net.scalax.simple.nat.sbt.ProjectKeys.autoImport._
      import djx.sbt.depts.output.Djx314DeptsPlugin.autoImport._
      import inner.CommonUtils._
      import scala.collection.compat._
      val t1    = (Test / baseFilesToCross).value
      val t2    = (Test / baseCrossFile).value
      val base  = (Test / unmanagedSourceDirectories).value
      val sv    = scalaVersion.value
      val files = for (n1 <- t1; n2 <- t2(n1)) yield n2
      val toAdd = for (f1 <- files; f2 <- genDirectory(f1, sv)) yield f2
      val all   = base.map(_.getCanonicalFile).to(Set) ++ toAdd.map(_.getCanonicalFile).to(Set)
      all.to(Seq)
    },
    scalacOptions ++= Seq("-feature", "-deprecation", "-encoding", "UTF-8"),
    scalafmtOnCompile := true
  )

}
