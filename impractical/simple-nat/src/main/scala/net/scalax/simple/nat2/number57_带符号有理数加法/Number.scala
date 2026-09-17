package net.scalax.simple
package nat
package number57

object Num57 { NumSelf =>

  // 整数list
  trait Number {
    def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number
    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  val Successor1: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        Successor1(() => tail().plus(other, appender1, appender2))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor1)
    }

  val Successor2: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        Successor2(() => tail().plus(other, appender1, appender2))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor2)
    }

  val Successor3: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        appender1(() => other.plus(tail(), appender2, appender1))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor3)
    }

  val Successor4: (() => Number) => Number = numP => numP()

}
