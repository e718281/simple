package net.scalax.simple.adt.codegen

import net.scalax.simple.adt.text.v3.{ADTTraitBuilderRound, ADTTraitBuilderRoundImpl1, ADTTraitBuilderRoundImpl2}

import java.net.URI

object ScalaAdtInstanceSupportCodegenExecRound {

  def main(arr: Array[String]): Unit = {

    val List(rootString) = arr.to(List)
    val rootPath         = os.Path(URI.create(rootString))
    val writePath        = rootPath / "net" / "scalax" / "simple" / "adt" / "instance" / "support" / "round"

    val parameterSize: Int = 22

    /*locally {
      val filePath             = writePath / "ADTTraitBuilderRound.scala"
      val linerContent: String = ADTTraitBuilderRound(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ADTTraitBuilderRoundImpl1.scala"
      val linerContent: String = ADTTraitBuilderRoundImpl1(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }

    locally {
      val filePath             = writePath / "ADTTraitBuilderRoundImpl2.scala"
      val linerContent: String = ADTTraitBuilderRoundImpl2(index = parameterSize).text
      os.write.over(filePath, linerContent, createFolders = true)
    }*/

  }

}
