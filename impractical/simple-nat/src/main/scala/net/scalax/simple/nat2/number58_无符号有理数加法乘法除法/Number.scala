package net.scalax.simple
package nat
package number58

object Num58 { NumSelf =>

  // 无符号有理数加法乘法除法
  trait Number {
    def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number
    def divide(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number

    def 加(other: Number): Number  = plus(other, Successor2, Successor3)
    def 除以(other: Number): Number = divide(other, Successor2, Successor1)
    def 乘以(other: Number): Number = 除以(One.除以(other))
    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  val Successor1: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        Successor1(() => tail().plus(other, appender1, appender2))
      override def divide(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        other.divide(tail(), appender2, appender1)
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor1)
    }

  val Successor2: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        appender1(() => other.plus(tail(), appender2, appender1))
      override def divide(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
        appender1(() => tail().divide(other, appender1, appender2))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor2)
    }

  val Successor3: (() => Number) => Number = numP => numP()
  val One: Number                          = Successor1(() => Successor2(() => One))

}
