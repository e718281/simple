package net.scalax.simple
package nat
package number52

object Num52 { NumSelf =>

  class TimeResult(val key: String, val tail: () => TimeResult)

  trait Time {
    def other(t2: Time, t3: Time, t4: Time, t5: Time): TimeResult
  }

  val TimeDong: String => (() => Time) => Time = key =>
    t1 =>
      new Time {
        override def other(t2: Time, t3: Time, t4: Time, t5: Time): TimeResult =
          new TimeResult(key = key, tail = () => t5.other(t1(), t2, t3, t4))
      }

  val TimeCount: (() => Time) => Time = t1 =>
    new Time {
      override def other(t2: Time, t3: Time, t4: Time, t5: Time): TimeResult = t2.other(t3, t4, t5, t1())
    }

  val TimeTop: String => (() => Time) => Time = key =>
    t1 =>
      new Time {
        override def other(t2: Time, t3: Time, t4: Time, t5: Time): TimeResult =
          new TimeResult(key = key, tail = () => t1().other(t2, t3, t4, t5))
      }

}
