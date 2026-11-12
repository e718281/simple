package net.scalax.simple
package nat
package number70

object Num70 { NumSelf =>

  // 无符号有理数加法除法
  trait Number {
    def plus(
      other: Number,
      appender1: (() => Number) => Number,
      appender2: (() => Number) => Number,
      appender3: (() => Number) => Number
    ): Number
    def divide(
      other: Number,
      appender1: (() => Number) => Number,
      appender2: (() => Number) => Number,
      appender3: (() => Number) => Number
    ): Number

    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  val Successor1: (() => Number) => Number = tail =>
    new Number {
      override def plus(
        other: Number,
        appender1: (() => Number) => Number,
        appender2: (() => Number) => Number,
        appender3: (() => Number) => Number
      ): Number =
        appender3(() => tail().plus(other, appender1, appender2, appender3))
      override def divide(
        other: Number,
        appender1: (() => Number) => Number,
        appender2: (() => Number) => Number,
        appender3: (() => Number) => Number
      ): Number =
        appender1(() => tail().divide(other, appender1, appender2, appender3))

      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor1)
    }

  val Successor2: (() => Number) => Number = tail =>
    new Number {
      override def plus(
        other: Number,
        appender1: (() => Number) => Number,
        appender2: (() => Number) => Number,
        appender3: (() => Number) => Number
      ): Number =
        appender1(() => other.plus(tail(), appender2, appender1, appender3))
      override def divide(
        other: Number,
        appender1: (() => Number) => Number,
        appender2: (() => Number) => Number,
        appender3: (() => Number) => Number
      ): Number =
        appender3(() => other.divide(tail(), appender2, appender1, appender3))

      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor2)
    }

  val Successor3: (() => Number) => Number = num => num()

  val One: Number = Successor1(() => Successor2(() => One))

  object Number {
    def 加(t: Number, other: Number): Number  = t.plus(other, Successor2, Successor3, Successor1)
    def 除以(t: Number, other: Number): Number = t.divide(other, Successor1, Successor2, Successor3)
    def 乘以(t: Number, other: Number): Number = 除以(t, 除以(One, other))

    def 运算1_1(t: Number, other: Number): Number = t.plus(other, Successor1, Successor2, Successor3)
    def 运算1_2(t: Number, other: Number): Number = t.plus(other, Successor1, Successor3, Successor2)
    def 运算1_3(t: Number, other: Number): Number = t.plus(other, Successor2, Successor1, Successor3)
    def 运算1_4(t: Number, other: Number): Number = t.plus(other, Successor2, Successor3, Successor1)
    def 运算1_5(t: Number, other: Number): Number = t.plus(other, Successor3, Successor1, Successor2)
    def 运算1_6(t: Number, other: Number): Number = t.plus(other, Successor3, Successor2, Successor1)

    def 运算2_1(t: Number, other: Number): Number = t.divide(other, Successor1, Successor2, Successor3)
    def 运算2_2(t: Number, other: Number): Number = t.divide(other, Successor1, Successor3, Successor2)
    def 运算2_3(t: Number, other: Number): Number = t.divide(other, Successor2, Successor1, Successor3)
    def 运算2_4(t: Number, other: Number): Number = t.divide(other, Successor2, Successor3, Successor1)
    def 运算2_5(t: Number, other: Number): Number = t.divide(other, Successor3, Successor1, Successor2)
    def 运算2_6(t: Number, other: Number): Number = t.divide(other, Successor3, Successor2, Successor1)
  }

}
