package net.scalax.simple.adt
package instance
package support

object AppendAdt1 {

  trait AdtSupport[Zero, Pos1 <: AdtCoProduct.Use.AdtType, Pos2 <: AdtCoProduct.Use.AdtType]
      extends SimpleAppenderAlias.AppenderAlias[
        ({
          type M22[
            T1,
            T2
          ] = Either[Zero, T1] => T2
        })#M22,
        AdtCoProduct.Use.AdtType,
        AdtCoProduct.Use.AdtType,
        AdtCoProduct.Use.Positive,
        AdtCoProduct.Use.Positive,
        Pos1,
        Pos2
      ] {
    AdtSupportSelf =>

    override def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
      : AdtSupport[Zero, AdtCoProduct.Use.Positive[T1, Pos1], AdtCoProduct.Use.Positive[T1, Pos2]] =
      new AdtSupport[Zero, AdtCoProduct.Use.Positive[T1, Pos1], AdtCoProduct.Use.Positive[T1, Pos2]] {
        override def current: Either[Zero, AdtCoProduct.Use.Positive[T1, Pos1]] => AdtCoProduct.Use.Positive[T1, Pos2] =
          (param: Either[Zero, AdtCoProduct.Use.Positive[T1, Pos1]]) => {
            val value1: AdtCoProduct.Use.Positive[T1, AdtCoProduct.Use.Positive[Zero, Pos1]] =
              param.fold(
                (zero: Zero) =>
                  AdtCoProduct.Use.Positive
                    .Right[T1, AdtCoProduct.Use.Positive[Zero, Pos1]](AdtCoProduct.Use.Positive.Left[Zero, Pos1](zero)),
                (rightAdt: AdtCoProduct.Use.Positive[T1, Pos1]) =>
                  rightAdt._foldCoProduct(
                    (ua: T1) => AdtCoProduct.Use.Positive.Left[T1, AdtCoProduct.Use.Positive[Zero, Pos1]](ua),
                    (pos1: Pos1) =>
                      AdtCoProduct.Use.Positive.Right[T1, AdtCoProduct.Use.Positive[Zero, Pos1]](
                        AdtCoProduct.Use.Positive.Right[Zero, Pos1](pos1)
                      )
                  )
              )

            def toEither(i: AdtCoProduct.Use.Positive[Zero, Pos1]): Either[Zero, Pos1] =
              i._foldCoProduct((zero: Zero) => Left(zero), (pos1: Pos1) => Right(pos1))

            value1._foldCoProduct(
              (ua: T1) => AdtCoProduct.Use.Positive.Left[T1, Pos2](ua),
              (r1: AdtCoProduct.Use.Positive[Zero, Pos1]) => AdtCoProduct.Use.Positive.Right[T1, Pos2](AdtSupportSelf.current(toEither(r1)))
            )
          }
      }
  }

  def adtSupportZero[Zero, OneValue]
    : AdtSupport[Zero, AdtCoProduct.Use.One[OneValue], AdtCoProduct.Use.Positive[OneValue, AdtCoProduct.Use.One[Zero]]] = {
    val func: Either[Zero, AdtCoProduct.Use.One[OneValue]] => AdtCoProduct.Use.Positive[OneValue, AdtCoProduct.Use.One[Zero]] =
      (zeroEither: Either[Zero, AdtCoProduct.Use.One[OneValue]]) => {
        zeroEither.fold(
          (zero: Zero) => AdtCoProduct.Use.Positive.Right[OneValue, AdtCoProduct.Use.One[Zero]](AdtCoProduct.Use.One.value[Zero](zero)),
          (oneValue: AdtCoProduct.Use.One[OneValue]) => AdtCoProduct.Use.Positive.Left[OneValue, AdtCoProduct.Use.One[Zero]](oneValue.value)
        )
      }

    new AdtSupport[Zero, AdtCoProduct.Use.One[OneValue], AdtCoProduct.Use.Positive[OneValue, AdtCoProduct.Use.One[Zero]]] {
      override val current
        : Either[Zero, AdtCoProduct.Use.One[OneValue]] => AdtCoProduct.Use.Positive[OneValue, AdtCoProduct.Use.One[Zero]] =
        func
    }
  }

}
