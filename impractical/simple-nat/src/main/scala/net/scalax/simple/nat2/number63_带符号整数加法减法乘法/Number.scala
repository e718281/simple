package net.scalax.simple
package nat
package number63

object Num63 { NumSelf =>

  trait Number {
    def minus(other: Number): Number
    def multiply(other: Number): Number
    def plus(other: Number): Number = this.minus(Zero.minus(other))
    def unsafeRun: Long
  }

  val Successor: (Number, Number) => Number = (value1, value2) =>
    new Number {
      override def minus(other: Number): Number    = Successor(Successor(value1, value2), other)
      override def multiply(other: Number): Number = Successor(value1.multiply(other), value2.multiply(other))
      override def unsafeRun: Long                 = value1.unsafeRun + value2.unsafeRun * -1L
    }

  val One: Number = new Number {
    override def minus(other: Number): Number    = Successor(One, other)
    override def unsafeRun: Long                 = 1
    override def multiply(other: Number): Number = other
  }

  val Zero: Number = Successor(One, One)

}
