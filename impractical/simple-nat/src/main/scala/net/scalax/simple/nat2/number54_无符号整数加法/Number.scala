package net.scalax.simple
package nat
package number54

object Num54 { NumSelf =>

  trait Number {
    def plus(other: Number): Number
    def unsafeRun: Int
  }

  val Successor: Number => Number = tail =>
    new Number {
      override def plus(other: Number): Number = Successor(tail.plus(other))
      override def unsafeRun: Int              = tail.unsafeRun + 1
    }
  val Zero = new Number {
    override def plus(other: Number): Number = other
    override def unsafeRun: Int              = 0
  }

}
