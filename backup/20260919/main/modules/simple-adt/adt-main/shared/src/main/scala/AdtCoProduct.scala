package net.scalax.simple.adt
package instance

object AdtCoProduct {
  AdtCoProductSelf =>

  object Use {

    sealed trait AdtType
    trait Positive[H1, T1 <: AdtCoProductSelf.Use.AdtType] extends AdtCoProductSelf.Use.AdtType {
      def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU
    }
    trait One[T] extends AdtCoProductSelf.Use.AdtType {
      def value: T
    }

    object Positive {

      object Left {
        def apply[H1, T1 <: AdtCoProductSelf.Use.AdtType](h: H1): AdtCoProductSelf.Use.Positive[H1, T1] =
          new AdtCoProductSelf.Use.Positive[H1, T1] {
            override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
          }

        def unapply[H1](u: AdtCoProductSelf.Use.Positive[H1, _ <: AdtCoProductSelf.Use.AdtType]): Option[H1] =
          u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
      }

      object Right {
        def apply[H1, T1 <: AdtCoProductSelf.Use.AdtType](r: T1): AdtCoProductSelf.Use.Positive[H1, T1] =
          new AdtCoProductSelf.Use.Positive[H1, T1] {
            override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
          }

        def unapply[T1 <: AdtCoProductSelf.Use.AdtType](u: AdtCoProductSelf.Use.Positive[_, T1]): Option[T1] =
          u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
      }

    }

    object One { UseOneSelf =>

      def value[T](t: T): AdtCoProductSelf.Use.One[T] = new AdtCoProductSelf.Use.One[T] {
        override def value: T = t
      }

      def unapply[T](one: AdtCoProductSelf.Use.One[T]): Some[T] = Some(one.value)

    }
  }

}
