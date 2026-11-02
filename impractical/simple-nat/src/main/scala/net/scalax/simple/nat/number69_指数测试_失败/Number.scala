package net.scalax.simple
package nat
package number69

object Num69 { NumSelf =>

  trait Result {
    def size: Int
  }
  case class ResultPos(tail: Result) extends Result {
    override def size: Int = tail.size + 1
  }
  val ResultZero: Result = new Result {
    override def size: Int = 0
  }

  trait Number1 {
    def other1(num1: Number2): Result
    def other2(num1: Number2, num2: Number2): Result
    def other3(num1: Number2, num2: Number2, num3: Number2): Result
    def other4(num1: Number2, num2: Number2, num3: Number2, num4: Number2): Result
  }

  case class Number1_1(tail: Number1) extends Number1 {
    override def other1(num1: Number2): Result                                              = num1.other1(tail)
    override def other2(num1: Number2, num2: Number2): Result                               = num1.other2_1(num2, tail)
    override def other3(num1: Number2, num2: Number2, num3: Number2): Result                = num1.other3_1(num2, num3, tail)
    override def other4(num1: Number2, num2: Number2, num3: Number2, num4: Number2): Result = ???
  }
  case object Number1_2 extends Number1 {
    override def other1(num1: Number2): Result                                              = ResultZero
    override def other2(num1: Number2, num2: Number2): Result                               = ResultZero
    override def other3(num1: Number2, num2: Number2, num3: Number2): Result                = ResultZero
    override def other4(num1: Number2, num2: Number2, num3: Number2, num4: Number2): Result = ResultZero
  }

  trait Number2 {
    def other1(other: Number1): Result
    def other2_1(num1: Number2, other: Number1): Result
    def other2_2(num1: Number2, other: Number1): Result
    def other3_1(num1: Number2, num2: Number2, other: Number1): Result
    def other3_2(num1: Number2, num2: Number2, other: Number1): Result
    def other3_3(num1: Number2, num2: Number2, other: Number1): Result
  }

  // 多
  case class Number2_1(tail: () => Number2) extends Number2 {
    override def other1(other: Number1): Result                                 = ResultPos(tail().other1(other))
    override def other2_1(num1: Number2, other: Number1): Result                = ResultPos(tail().other2_1(num1, other))
    override def other2_2(num1: Number2, other: Number1): Result                = num1.other2_1(tail(), other)
    override def other3_1(num1: Number2, num2: Number2, other: Number1): Result = ResultPos(tail().other3_1(num1, num2, other))
    override def other3_2(num1: Number2, num2: Number2, other: Number1): Result = num2.other3_1(tail(), num1, other)
    override def other3_3(num1: Number2, num2: Number2, other: Number1): Result = num2.other3_2(tail(), num1, other)
  }
  // 一
  case class Number2_2(tail: () => Number2) extends Number2 {
    override def other1(other: Number1): Result                                 = other.other2(tail(), tail())
    override def other2_1(num1: Number2, other: Number1): Result                = num1.other2_2(tail(), other)
    override def other2_2(num1: Number2, other: Number1): Result                = other.other3(tail(), tail(), tail())
    override def other3_1(num1: Number2, num2: Number2, other: Number1): Result = num1.other3_2(num2, tail(), other)
    override def other3_2(num1: Number2, num2: Number2, other: Number1): Result = num1.other3_3(num2, tail(), other)
    override def other3_3(num1: Number2, num2: Number2, other: Number1): Result = other.other4(tail(), tail(), tail(), tail())
  }

  lazy val num2_1: Number2 = Number2_1(() => Number2_1(() => num2_2))
  lazy val num2_2: Number2 = Number2_2(() => num2_1)
}
