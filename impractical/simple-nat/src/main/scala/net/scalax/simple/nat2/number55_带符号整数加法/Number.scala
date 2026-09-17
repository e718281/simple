package net.scalax.simple
package nat
package number55

object Num55 { NumSelf =>

  // 整数list
  trait Number {
    def plus(other: Number): Number
    def unsafeRun: Int
  }

  val Successor1: Number => Number = tail =>
    new Number {
      override def plus(other: Number): Number = Successor1(tail.plus(other))
      override def unsafeRun: Int              = tail.unsafeRun + 1
    }
  val Successor2: Number => Number = tail =>
    new Number {
      override def plus(other: Number): Number = Successor2(tail.plus(other))
      override def unsafeRun: Int              = tail.unsafeRun - 1
    }
  val Zero = new Number {
    override def plus(other: Number): Number = other
    override def unsafeRun: Int              = 0
  }

}
