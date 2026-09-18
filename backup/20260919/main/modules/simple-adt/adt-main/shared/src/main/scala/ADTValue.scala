package net.scalax.simple.adt
package instance

trait ADTValue[T <: AdtCoProduct.Use.AdtType] {
  def value: T
}

object ADTValue extends LawTraitImplicit {

  implicit def posImplicit2[Target, I1, Tail <: AdtCoProduct.Use.AdtType](implicit
    t1: AdtFunction[Target, I1]
  ): ADTValue[AdtCoProduct.Use.Positive[AdtFunction[Target, I1], Tail]] =
    new ADTValue[AdtCoProduct.Use.Positive[AdtFunction[Target, I1], Tail]] {
      override def value: AdtCoProduct.Use.Positive[AdtFunction[Target, I1], Tail] =
        AdtCoProduct.Use.Positive.Left[AdtFunction[Target, I1], Tail](t1)
    }

  implicit def oneImplicit3[Target, I1](implicit t1: AdtFunction[Target, I1]): ADTValue[AdtCoProduct.Use.One[AdtFunction[Target, I1]]] =
    new ADTValue[AdtCoProduct.Use.One[AdtFunction[Target, I1]]] {
      override def value: AdtCoProduct.Use.One[AdtFunction[Target, I1]] = AdtCoProduct.Use.One.value[AdtFunction[Target, I1]](t1)
    }

}

trait LawTraitImplicit {

  implicit def posImplicit1[Target, I1, Tail <: AdtCoProduct.Use.AdtType](implicit
    t1: ADTValue[Tail]
  ): ADTValue[AdtCoProduct.Use.Positive[AdtFunction[Target, I1], Tail]] =
    new ADTValue[AdtCoProduct.Use.Positive[AdtFunction[Target, I1], Tail]] {
      override def value: AdtCoProduct.Use.Positive[AdtFunction[Target, I1], Tail] =
        AdtCoProduct.Use.Positive.Right[AdtFunction[Target, I1], Tail](t1.value)
    }

}
