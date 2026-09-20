package net.scalax.simple
package nat
package number62

object Num62 { NumSelf =>

  trait Number {
    def plus(other: Number): Number
    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  val Successor1: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor1(() => tail().plus(other)) // TODO
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor1)
    }
  val Successor2: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor2(() => tail().plus(other)) // TODO
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor2)
    }
  val Successor3: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor3(() => other.plus(tail())) // TODO
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor3)
    }
  val Successor4: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor4(() => other.plus(tail())) // TODO
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor4)
    }

}
