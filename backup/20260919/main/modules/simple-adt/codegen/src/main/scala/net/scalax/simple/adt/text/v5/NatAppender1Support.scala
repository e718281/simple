package net.scalax.simple.adt.text.v5

class NatAppender1Support(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam2: Seq[String]  = for (i1 <- 1 to index) yield s"N$i1[_]"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"F[N$i1]"
    val typeParam4: Seq[String]  = for (i1 <- 1 to index) yield s"N$i1"
    val typeParam5: Seq[String]  = for (i1 <- 1 to index) yield s"HListLike"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"ExtractProductSelf.extraAbstraction.hlistSimpleCompat.zero"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"simpleFunc1[N$i1]"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"N$i1[Any]"
    val typeParam11: Seq[String] = for (i1 <- 1 to index) yield s"F[N$i1]"
    val typeParam12: Seq[String] = for (i1 <- 1 to index) yield s"AppLike"

    val max: Int                 = 22
    val typeParam13: Seq[String] = for (i1 <- 1 to max) yield s"Any"

    val typeParam14: Seq[String] = for (i1 <- 1 to index) yield s"B$i1"
    val typeParam15: Seq[String] = for (i1 <- 1 to index) yield s"C$i1"
    val typeParam16: Seq[String] = for (i1 <- 1 to index) yield s"abc$i1: net.scalax.simple.adt.nat.support.ABCFunc[N$i1[T], B$i1, C$i1]"
    val typeParam17: Seq[String] = for (i1 <- 1 to index) yield s"b$i1: B$i1"
    val typeParam18: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[T]"
    val typeParam19: Seq[String] = for (i1 <- 1 to index) yield s"func$i1: FromToFunc[N$i1[T], B$i1]"

    val appendHLStr = "({ type AP1[_, T1 <: HListLike] = T1 })#AP1"

    val text: String = s"""
      object Simple$index { SimpleSelf =>
        trait Appender[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}] {
          def append[T, ${typeParam14.mkString(',')}, ${typeParam15.mkString(',')}](
            ${typeParam16.mkString(',')},
            ma: M[${typeParam14.mkString(',')}]
          ): M[${typeParam15.mkString(',')}]
        }

        trait Zero[M[${typeParam1.mkString(',')}]] {
          def zero[${typeParam14.mkString(',')}](${typeParam17.mkString(',')}): M[${typeParam14.mkString(',')}]
        }

        trait Runner[F[_[_]]] {
          def append[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}](
            appender: SimpleSelf.Appender[M, ${typeParam4.mkString(',')}],
            zero: SimpleSelf.Zero[M]
          ): M[${typeParam3.mkString(',')}]
        }

        trait One[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}] {
          def one[T, ${typeParam14.mkString(',')}](${typeParam19.mkString(',')})
          : M[${typeParam14.mkString(',')}]
        }

        trait Release[F[_[_]]] {
          def append[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}](
            appender: SimpleSelf.Appender[M, ${typeParam4.mkString(',')}],
            zero: SimpleSelf.One[M, ${typeParam4.mkString(',')}]
          ): M[${typeParam3.mkString(',')}]
        }
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support
    package v5

    object AppenderSupport1 {
      ${preTextContent.mkString('\n')}
    }
  """

}
