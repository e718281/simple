package net.scalax.simple
package nat
package number56

object Num56 { NumSelf =>

  trait Number {
    def plus(other: Number): Number
    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  val Successor1: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor1(() => tail().plus(other))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor1)
    }
  val Successor2: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor2(() => tail().plus(other))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor2)

    }
  val Successor3: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number                         = Successor3(() => other.plus(tail()))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor3)
    }

}
