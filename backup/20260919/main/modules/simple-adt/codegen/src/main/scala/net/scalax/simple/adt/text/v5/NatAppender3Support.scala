package net.scalax.simple.adt.text.v5

class NatAppender3Support(val index: Int) {

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
    val typeParam14: Seq[String] = for (i1 <- 1 to index) yield s"HZero"
    val typeParam15: Seq[String] = for (i1 <- 1 to index) yield s"hZero"
    val typeParam16: Seq[String] = for (i1 <- 1 to index) yield s"AppenderSupport3Self.fromToFunc[N$i1[Any]]"
    val typeParam17: Seq[String] = for (i1 <- 1 to index) yield s"Any"
    val typeParam18: Seq[String] = for (i1 <- 1 to index) yield s"AppLike[N$i1[Any], HZero]"

    val appendHLStr = "({ type AP1[_, T1 <: HListLike] = T1 })#AP1"

    val text: String = s"""
      override final def simpleRunner$index: AppenderSupport1.Simple$index.Runner[F] = new AppenderSupport1.Simple$index.Runner[F] {
        override final def append[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}](
          sAppender: AppenderSupport1.Simple$index.Appender[M, ${typeParam4.mkString(',')}],
          zero: AppenderSupport1.Simple$index.Zero[M]
        ): M[${typeParam3.mkString(',')}] = {
          val ctxPre = AppenderSupport3Self.appSupport2
          val ctx = new ctxPre.Support${index}Context(sAppender)
          val ap1: ctx.SupportInstance[${typeParam14.mkString(',')}] =
            new ctx.SupportInstance[${typeParam14.mkString(',')}](
              current = zero.zero[${typeParam14.mkString(',')}](${typeParam15.mkString(',')})
            )
          val ap2: ctx.SupportInstance[${typeParam5.mkString(',')}] = ap1.asInstanceOf[ctx.SupportInstance[${typeParam5.mkString(',')}]]

          @scala.annotation.tailrec
          def appendImpl1(len: Int, model: ctx.SupportInstance[
            ${typeParam5.mkString(',')}
          ]): ctx.SupportInstance[
            ${typeParam5.mkString(',')}
          ] = {
            if (len > 0) {
              val nextModel = model.next[${typeParam13.mkString(',')}].asInstanceOf[
                ctx.SupportInstance[
                  ${typeParam5.mkString(',')}
                ]
              ]
              appendImpl1(len - 1, nextModel)
            } else
              model
          }

          def simpleFunc1[U[_]]: ABCFunc[U[Any], HListLike, F[U]] = new ABCFunc[U[Any], HListLike, F[U]] {
            override def takeHead(m: F[U]): U[Any] =
              AppenderSupport3Self.appSupport2.abcGen.takeHead[U[Any], HListLike](
                fromModel(m.asInstanceOf[F[({ type AnyF[_] = Any })#AnyF]]).asInstanceOf[AppLike[U[Any], HListLike]]
              )
            override def takeTail(m: F[U]): HListLike =
              AppenderSupport3Self.appSupport2.abcGen.takeTail[Any, HListLike](
                fromModel(m.asInstanceOf[F[({ type AnyF[_] = Any })#AnyF]]).asInstanceOf[AppLike[Any, HListLike]]
              )
            override def append(a: U[Any], b: HListLike): F[U] =
              toModel(AppenderSupport3Self.appSupport2.abcGen.append[Any, HListLike](a, b)).asInstanceOf[F[U]]
          }

          sAppender.append[
            Any,
            ${typeParam5.mkString(',')},
            ${typeParam11.mkString(',')}
          ](
            ${typeParam8.mkString(',')},
            appendImpl1(autalLen, ap2).current
          )
        }
      }
    """

    val text2: String = s"""
      override final def simpleRelease$index: AppenderSupport1.Simple$index.Release[F] = new AppenderSupport1.Simple$index.Release[F] {
        override final def append[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}](
          sAppender: AppenderSupport1.Simple$index.Appender[M, ${typeParam4.mkString(',')}],
          one: AppenderSupport1.Simple$index.One[M, ${typeParam4.mkString(',')}]
        ): M[${typeParam3.mkString(',')}] = {
          val ctxPre = AppenderSupport3Self.appSupport2
          val ctx = new ctxPre.Support${index}Context(sAppender)
          val ap1: ctx.SupportInstance[${typeParam18.mkString(',')}] =
            new ctx.SupportInstance[${typeParam18.mkString(',')}](
              current = one.one[Any, ${typeParam18.mkString(',')}](${typeParam16.mkString(',')})
            )
          val ap2: ctx.SupportInstance[${typeParam5.mkString(',')}] = ap1.asInstanceOf[ctx.SupportInstance[${typeParam5.mkString(',')}]]

          @scala.annotation.tailrec
          def appendImpl1(len: Int, model: ctx.SupportInstance[
            ${typeParam5.mkString(',')}
          ]): ctx.SupportInstance[
            ${typeParam5.mkString(',')}
          ] = {
            if (len > 0) {
              val nextModel = model.next[${typeParam13.mkString(',')}].asInstanceOf[
                ctx.SupportInstance[
                  ${typeParam5.mkString(',')}
                ]
              ]
              appendImpl1(len - 1, nextModel)
            } else
              model
          }

          def simpleFunc1[U[_]]: ABCFunc[U[Any], HListLike, F[U]] = new ABCFunc[U[Any], HListLike, F[U]] {
            override def takeHead(m: F[U]): U[Any] =
              AppenderSupport3Self.appSupport2.abcGen.takeHead[U[Any], HListLike](
                fromModel(m.asInstanceOf[F[({ type AnyF[_] = Any })#AnyF]]).asInstanceOf[AppLike[U[Any], HListLike]]
              )
            override def takeTail(m: F[U]): HListLike =
              AppenderSupport3Self.appSupport2.abcGen.takeTail[Any, HListLike](
                fromModel(m.asInstanceOf[F[({ type AnyF[_] = Any })#AnyF]]).asInstanceOf[AppLike[Any, HListLike]]
              )
            override def append(a: U[Any], b: HListLike): F[U] =
              toModel(AppenderSupport3Self.appSupport2.abcGen.append[Any, HListLike](a, b)).asInstanceOf[F[U]]
          }

          sAppender.append[
            Any,
            ${typeParam5.mkString(',')},
            ${typeParam11.mkString(',')}
          ](
            ${typeParam8.mkString(',')},
            appendImpl1(autalLen - 1, ap2).current
          )
        }
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text + '\n' + new TraitBody(i).text2

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support
    package v5

    trait AppenderSupport3[HListLike, AppLike[_, _ <: HListLike] <: HListLike, HZero <: HListLike] {
      AppenderSupport3Self =>

      def appSupport2: AppenderSupport2[HListLike, AppLike]
      def hZero: HZero
      def fromToFunc[X1]: FromToFunc[X1, AppLike[X1, HZero]]

      final def genSimpleProduct[F[_[_]]](
        length: Int,
        toModel: HListLike => F[({ type AnyF[_] = Any })#AnyF],
        fromModel: F[({ type AnyF[_] = Any })#AnyF] => HListLike
      ): AppenderSupport4[F] = {
        val autalLen: Int = length - 1

        new AppenderSupport4[F] {
          ${preTextContent.mkString('\n')}
        }
      }
    }
  """

}
