package net.scalax.simple
package nat
package number66

object Num66 { NumSelf =>

  sealed trait Color
  case object Red extends Color {
    override def toString: String = "红灯"
  }
  case object Yellow extends Color {
    override def toString: String = "黄灯"
  }
  case object Green extends Color {
    override def toString: String = "绿灯"
  }

  case class RedYellow(value: List[(String, (Color, Long))], tail: () => RedYellow)

  trait Number {
    def other(num1: Number, num2: Number, num3: Number, num4: Number): RedYellow
  }

  val oneSecond: (String, Color, Long) => (() => Number) => Number = (name1, name2, name3) =>
    tail =>
      new Number {
        override def other(num1: Number, num2: Number, num3: Number, num4: Number): RedYellow = {
          val redYellTail = num1.other(num2, num3, num4, tail())
          redYellTail.copy(value = (name1, (name2, name3)) :: redYellTail.value)
        }
      }

  val click: Number = new Number {
    override def other(num1: Number, num2: Number, num3: Number, num4: Number): RedYellow = {
      RedYellow(List.empty, () => num1.other(num2, num3, num4, click))
    }
  }

}
