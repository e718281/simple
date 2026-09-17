package net.scalax.simple
package nat
package number51

object Num51 { NumSelf =>

  abstract class Number51 {
    def other(otherNum: Number51, appender1: (() => Number51) => Number51, appender2: (() => Number51) => Number51): Number51
    def unsafeRun: (() => Number51, (() => Number51) => Number51)
  }

  val appender1: (() => Number51) => Number51 = num1 =>
    new Number51 {
      override def other(num2: Number51, app1: (() => Number51) => Number51, app2: (() => Number51) => Number51): Number51 =
        app1(() => num1().other(num2, app1, app2))
      override def unsafeRun: (() => Number51, (() => Number51) => Number51) = (num1, appender1)
    }

  val appender2: (() => Number51) => Number51 = num1 =>
    new Number51 {
      override def other(num2: Number51, app1: (() => Number51) => Number51, app2: (() => Number51) => Number51): Number51 =
        num2.other(num1(), app2, app1)
      override def unsafeRun: (() => Number51, (() => Number51) => Number51) = (num1, appender2)
    }

}
