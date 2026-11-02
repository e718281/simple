package net.scalax.simple
package nat
package number67

object Num67 { NumSelf =>

  class TimeResult(val key: String, val tail: () => TimeResult)
  object TimeResult {
    def count(num1: TimeResult, size: Long): List[String] =
      if (size > 0) num1.key :: count(num1.tail(), size - 1)
      else List.empty
  }

  trait Time4 {
    def other(t2: Time4, t3: Time4, t4: Time4): TimeResult
  }

  val TimeDong4: (() => Time4) => Time4 = t1 =>
    new Time4 {
      override def other(t2: Time4, t3: Time4, t4: Time4): TimeResult = t4.other(t1(), t2, t3)
    }

  val TimeCount4: (() => Time4) => Time4 = t1 =>
    new Time4 {
      override def other(t2: Time4, t3: Time4, t4: Time4): TimeResult = t2.other(t3, t4, t1())
    }

  val TimeTop4: String => (() => Time4) => Time4 = key =>
    t1 =>
      new Time4 {
        override def other(t2: Time4, t3: Time4, t4: Time4): TimeResult =
          new TimeResult(key = key, tail = () => t1().other(t2, t3, t4))
      }

  trait Time3 {
    def other(t2: Time3, t3: Time3): TimeResult
  }

  val TimeDong3: (() => Time3) => Time3 = t1 =>
    new Time3 {
      override def other(t2: Time3, t3: Time3): TimeResult = t3.other(t1(), t2)
    }

  val TimeCount3: (() => Time3) => Time3 = t1 =>
    new Time3 {
      override def other(t2: Time3, t3: Time3): TimeResult = t2.other(t3, t1())
    }

  val TimeTop3: String => (() => Time3) => Time3 = key =>
    t1 =>
      new Time3 {
        override def other(t2: Time3, t3: Time3): TimeResult =
          new TimeResult(key = key, tail = () => t1().other(t2, t3))
      }

  trait Time5 {
    def other(t2: Time5, t3: Time5, t4: Time5, t5: Time5): TimeResult
  }

  val TimeDong5: (() => Time5) => Time5 = t1 =>
    new Time5 {
      override def other(t2: Time5, t3: Time5, t4: Time5, t5: Time5): TimeResult = t5.other(t1(), t2, t3, t4)
    }

  val TimeCount5: (() => Time5) => Time5 = t1 =>
    new Time5 {
      override def other(t2: Time5, t3: Time5, t4: Time5, t5: Time5): TimeResult = t2.other(t3, t4, t5, t1())
    }

  val TimeTop5: String => (() => Time5) => Time5 = key =>
    t1 =>
      new Time5 {
        override def other(t2: Time5, t3: Time5, t4: Time5, t5: Time5): TimeResult =
          new TimeResult(key = key, tail = () => t1().other(t2, t3, t4, t5))
      }

}
