package net.scalax.simple
package nat
package number63

object Num63 { NumSelf =>

  trait Number {
    def minus(other: Number): Number = Successor2(this, other)
    def plus(other: Number): Number  = this.minus(Zero.minus(other))
    def multiply(other: Number): Number
    def unsafeRun: Long
  }

  case class Successor2(value1: Number, value2: Number) extends Number {
    override def multiply(other: Number): Number = Successor2(value1.multiply(other), value2.multiply(other))
    override def unsafeRun: Long                 = value1.unsafeRun + value2.unsafeRun * -1L
  }

  case object One extends Number {
    override def unsafeRun: Long                 = 1
    override def multiply(other: Number): Number = other
  }

  val Zero: Number = Successor2(One, One)

}
