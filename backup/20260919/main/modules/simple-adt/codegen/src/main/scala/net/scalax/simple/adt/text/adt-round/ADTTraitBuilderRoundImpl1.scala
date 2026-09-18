package net.scalax.simple.adt.text.v3

class ADTTraitBuilderRoundImpl1(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String                      = list.mkString(c.toString)
    def mkString(c1: Char, c2: Char, c3: Char): String = list.mkString(c1.toString, c2.toString, c3.toString)
  }

  class TraitBody(val index: Int) {
    TraitBodySelf =>

    val typeParam1: Seq[String]  = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam2: Seq[String]  = "Target1" +: (for (i1 <- 2 to index) yield s"Target$i1 >: Target${i1 - 1}")
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"param$i1: T$i1 => Target"
    val typeParam4: Seq[String]  = s"TargetOther$index" +: (for (i1 <- 2 to index) yield s"T$i1")
    val typeParam5: Seq[String]  = for (i1 <- 1 to index) yield s"apply(param$i1)"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"param$i1"
    val typeParam10: Seq[String] = for (i1 <- 1 to index) yield s"implicit val paramImpl$i1 = param$i1"
    val typeParam12: Seq[String] = for (i1 <- 1 to index) yield s".map1(param$i1).tail"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"_ <: T"

    def typeParam7Impl(index: Int): String = if (index <= TraitBodySelf.index) {
      s"""AdtCoProduct.Common.Positive[T$index, ${typeParam7Impl(index + 1)}]"""
    } else {
      s"""Impl1.CoProduct${index - 1}[${typeParam1.mkString(',')}]"""
    }

    val typeParam7: String = typeParam7Impl(1)

    val text: String = s"""
      trait CoProduct$index[${typeParam1.mkString(',')}] extends $typeParam7
    """

  }

  val preTextContent: Seq[String] = for (i <- 2 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support
    package round

    object Impl1 {
      trait CoProduct1[T1] extends AdtCoProduct.Common.Positive[T1, Impl1.CoProduct1[T1]]

      ${preTextContent.mkString('\n')}
    }
  """

}
