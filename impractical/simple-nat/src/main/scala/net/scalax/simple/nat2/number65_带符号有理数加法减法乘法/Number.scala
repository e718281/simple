package net.scalax.simple
package nat
package number65

object Num65 { NumSelf =>

  case class AddNumber(left: Number, right: Number)

  object AddNumber {
    def 加(t: AddNumber, other: AddNumber): AddNumber  = AddNumber(Number.加(t.left, other.left), Number.加(t.right, other.right))
    def 减(t: AddNumber, other: AddNumber): AddNumber  = AddNumber(Number.加(t.left, other.right), Number.加(t.right, other.left))
    def 乘以(t: AddNumber, other: AddNumber): AddNumber = AddNumber(
      Number.加(Number.乘以(t.left, other.left), Number.乘以(t.right, other.right)),
      Number.加(Number.乘以(t.left, other.right), Number.乘以(t.right, other.left))
    )
    def 除以正数(t: AddNumber, other: Number): AddNumber = AddNumber(Number.除以(t.left, other), Number.除以(t.right, other))
    def 除以负数(t: AddNumber, other: Number): AddNumber = AddNumber(Number.除以(t.right, other), Number.除以(t.left, other))
  }

  // 无符号有理数加法乘法除法
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

  object Number {
    def 加(t: Number, other: Number): Number  = t.plus(other, Successor2, Successor3, Successor1)
    def 除以(t: Number, other: Number): Number = t.divide(other, Successor1, Successor2, Successor3)
    def 乘以(t: Number, other: Number): Number = 除以(t, 除以(One, other))
    val One: Number                          = {
      val `22/7`: Number = RunTest1.build(22, 7)
      除以(`22/7`, `22/7`)
    }
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

}
