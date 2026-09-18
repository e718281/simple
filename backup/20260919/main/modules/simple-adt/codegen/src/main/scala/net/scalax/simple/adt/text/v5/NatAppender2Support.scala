package net.scalax.simple.adt.text.v5

class NatAppender2Support(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"HListLike"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"T$i1[_]"
    val typeParam6: Seq[String] =
      for (i1 <- 1 to index) yield s"({ type XUAPPendEach[X12, Tail <: HListLike] = AppendLike[T$i1[X12], Tail]})#XUAPPendEach"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1 <: HListLike"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"AppendLike[T$i1[XPoint], HCollection$i1]"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"T$i1[XPoint]"
    val typeParam14: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam15: Seq[String] = for (i1 <- 1 to 21) yield s"X$i1"
    val typeParam16: Seq[String] = for (i1 <- 1 to index) yield s"AppenderSupport2Self.abcGen.toABCFunc[T$i1[XPoint], HCollection$i1]"

    val text: String = s"""
      class Support${index}Context[
        M[${typeParam1.mkString(',')}],
        ${typeParam5.mkString(',')}
      ](
        simpleAppender: AppenderSupport1.Simple$index.Appender[M, ${typeParam14.mkString(',')}]
      ) {
        class SupportInstance[
          ${typeParam7.mkString(',')}
        ](override val current: M[${typeParam8.mkString(',')}]) extends NatNext1.Support$index[
          M,
          ${typeParam3.mkString(',')},
          ${typeParam6.mkString(',')},
          ${typeParam8.mkString(',')}
        ] {
          SupportSelf =>
          override def next[XPoint, ${typeParam15.mkString(',')}]: SupportInstance[
            ${typeParam9.mkString(',')}
          ] = new SupportInstance[
            ${typeParam9.mkString(',')}
          ](current = simpleAppender.append(${typeParam16.mkString(',')}, SupportSelf.current))
        }
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String =
    s"""
      package net.scalax.simple.adt
      package nat
      package support
      package v5

      trait AppenderSupport2[HListLike, AppendLike[_, _ <: HListLike] <: HListLike] {
        AppenderSupport2Self =>

        def abcGen: net.scalax.simple.adt.nat.support.HListFunc[HListLike, AppendLike]

        ${preTextContent.mkString('\n')}
      }
    """

}
