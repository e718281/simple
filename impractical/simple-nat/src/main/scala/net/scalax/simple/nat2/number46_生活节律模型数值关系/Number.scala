package net.scalax.simple
package nat
package number46

import ghdmzsk._

object Num46 { NumSelf =>

  trait Number {
    def other(
      appender1: (() => Number) => Number,
      tail2: Number,
      appender2: (() => Number) => Number,
      tail3: Number,
      appender3: (() => Number) => Number,
      tail4: Number,
      appender4: (() => Number) => Number
    ): Number
    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  trait Num1 {
    def pre1: ghdmzsk
  }

  trait Num2 {
    def pre2: ghdmzsk
  }

  val tail1Num: (() => Number) => Number = tail1 =>
    new Number {
      override def other(
        appender1: (() => Number) => Number,
        tail2: Number,
        appender2: (() => Number) => Number,
        tail3: Number,
        appender3: (() => Number) => Number,
        tail4: Number,
        appender4: (() => Number) => Number
      ): Number = appender1(() => tail1().other(appender1, tail2, appender2, tail3, appender3, tail4, appender4))
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail1, tail1Num)

    }

  val tail2Num: (() => Number) => Number = tail1 =>
    new Number {
      override def other(
        appender1: (() => Number) => Number,
        tail2: Number,
        appender2: (() => Number) => Number,
        tail3: Number,
        appender3: (() => Number) => Number,
        tail4: Number,
        appender4: (() => Number) => Number
      ): Number = tail2.other(appender2, tail3, appender3, tail4, appender4, tail1(), appender1)
      override def unsafeRun: (() => Number, (() => Number) => Number) = (tail1, tail2Num)

    }

}
