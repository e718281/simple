package net.scalax.simple
package nat
package number66

object Num66 { NumSelf =>

  case class RedYellow(value: List[(String, Boolean)], tail: () => RedYellow)

  trait Number {
    def other(num1: Number, num2: Number, num3: Number, num4: Number): RedYellow
  }

  val oneSecond: (String, Boolean) => (() => Number) => Number = (name1, name2) =>
    tail =>
      new Number {
        override def other(num1: Number, num2: Number, num3: Number, num4: Number): RedYellow = {
          val redYellTail = num1.other(num2, num3, num4, tail())
          redYellTail.copy(value = (name1, name2) :: redYellTail.value)
        }
      }

  val click: Number = new Number {
    override def other(num1: Number, num2: Number, num3: Number, num4: Number): RedYellow = {
      RedYellow(List.empty, () => num1.other(num2, num3, num4, click))
    }
  }

}
