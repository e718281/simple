package net.scalax.simple
package nat
package number67

object Num67 { NumSelf =>

  class TimeResult(val key: String, val tail: () => TimeResult)

  trait Time {
    def other(t2: Time, t3: Time, t4: Time): TimeResult
  }

  val TimeDong: (() => Time) => Time = t1 =>
    new Time {
      override def other(t2: Time, t3: Time, t4: Time): TimeResult = t4.other(t1(), t2, t3)
    }

  val TimeCount: (() => Time) => Time = t1 =>
    new Time {
      override def other(t2: Time, t3: Time, t4: Time): TimeResult = t2.other(t3, t4, t1())
    }

  val TimeTop: String => (() => Time) => Time = key =>
    t1 =>
      new Time {
        override def other(t2: Time, t3: Time, t4: Time): TimeResult =
          new TimeResult(key = key, tail = () => t1().other(t2, t3, t4))
      }

}
