package net.scalax.simple.adt.text.v3

class ADTTraitBuilderRoundImpl2(val index: Int) {

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
    // val typeParam11: Seq[String] = for (i1 <- index to (1, -1)) yield s".append[T$i1]"
    val typeParam12: Seq[String] = for (i1 <- 1 to index) yield s".map1(param$i1).tail"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"_ <: T"

    def typeParam6Impl(index: Int): String = if (index > 1) {
      val typeParam7: Seq[String] =
        s"TargetOther${index + 1}" +: (for (i1 <- (TraitBodySelf.index - index) + 1 to TraitBodySelf.index) yield s"T$i1")
      val typeParam8: Seq[String] =
        s"TargetOther$index" +: (for i1 <- (TraitBodySelf.index - index) + 2 to TraitBodySelf.index yield s"T$i1")

      s"""
        new ADTFoldApplyImpl$index[${typeParam7.mkString(',')}] {
          override def fold$index[TargetOther$index >: TargetOther${index + 1}](
            param${(TraitBodySelf.index - index) + 1}: T${(TraitBodySelf.index - index) + 1} => TargetOther$index
          ): ADTFoldApplyImpl${index - 1}[${typeParam8.mkString(',')}] = ${typeParam6Impl(index - 1)}
        }
      """
    } else {
      s"""
        new ADTFoldApplyImpl1[TargetOther2, T${TraitBodySelf.index}] {
          override def fold1[TargetOther1 >: TargetOther2](param${TraitBodySelf.index}: T${TraitBodySelf.index} => TargetOther1): TargetOther1 = {
            FoldApplySelf.fold(${typeParam9.mkString(',')})
          }
        }
      """
    }

    val typeParam6: String = typeParam6Impl(index - 1)

    def typeParam7Impl(index: Int): String = if (index <= TraitBodySelf.index) {
      s"""AdtCoProduct.Common.Positive[T$index, ${typeParam7Impl(index + 1)}]"""
    } else {
      s"""Impl2.CoProduct${index - 1}[${typeParam1.mkString(',')}]"""
    }

    val typeParam7: String       = typeParam7Impl(1)
    val typeParam14: String      = typeParam7Impl(2)
    val typeParam15: Seq[String] = for (i1 <- 2 to index) yield s"T$i1"

    def typeParam16Impl(index: Int, varName: String): String = if (index <= TraitBodySelf.index) {
      s"""$varName._foldCoProduct[Target](param$index, s$index => ${typeParam16Impl(index + 1, "s" + index.toString)})"""
    } else {
      s"""$varName.fold[Target](${typeParam9.mkString(',')})"""
    }
    val typeParam16: String = typeParam16Impl(1, "CoProductSelf")

    val typeParam18: Seq[String] = for (i1 <- 2 to index) yield s"(T$i1 => TxU)"
    val typeParam19: Seq[String] = for (i1 <- 2 to index) yield s"param$i1"

    class ToCoProduct(index: Int) {
      ToCoProductSelf =>
      val typeParam20: Seq[String] = for (i1 <- 3 to ToCoProductSelf.index) yield s"AdtCoProduct.Common.Positive.Right("
      val typeParam21: Seq[String] = for (i1 <- 3 to ToCoProductSelf.index) yield s")"

      val text: String = s"""
        val param$index: T$index => Target = ux => tail(
          ${typeParam20.mkString(' ')}
          AdtCoProduct.Common.Positive.Left(ux)
          ${typeParam21.mkString(' ')}
        )
      """
    }

    val typeParam22: Seq[String] = for i1 <- 2 to TraitBodySelf.index yield ToCoProduct(i1).text

    val text: String = s"""
      trait CoProduct$index[${typeParam1.mkString(',')}]
        extends Impl1.CoProduct$index[${typeParam1.mkString(',')}]
        with $typeParam7 { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: $typeParam14 => Target): Target = {
          ${typeParam22.mkString('\n')}
          CoProductSelf.fold[Target](${typeParam9.mkString(',')})
        }
        @inline def fold[Target](
          ${typeParam3.mkString(',')}
        ): Target = $typeParam16
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 2 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support
    package round

    object Impl2 {

      trait CoProduct1[T1] extends Impl1.CoProduct1[T1] with AdtCoProduct.Common.Positive[T1, Impl2.CoProduct1[T1]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: Impl2.CoProduct1[T1] => Target): Target = {
          CoProductSelf.fold[Target](param1)
        }
        @inline def fold[Target](param1: T1 => Target): Target =
          CoProductSelf._foldCoProduct[Target](param1, s1 => s1.fold[Target](param1))
      }

      ${preTextContent.mkString('\n')}
    }
  """

}
