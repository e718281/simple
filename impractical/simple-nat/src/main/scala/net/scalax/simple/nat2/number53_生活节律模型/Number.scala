package net.scalax.simple
package nat
package number53

object Num53 { NumSelf =>

  class Habit(val key: String, val tail: () => Habit)

  trait Days {
    def other(t2: Days, t3: Days, t4: Days, t5: Days): Habit
  }

  val TimeDong: String => (() => Days) => Days = key =>
    t1 =>
      new Days {
        override def other(t2: Days, t3: Days, t4: Days, t5: Days): Habit =
          new Habit(key = key, tail = () => t1().other(t2, t3, t4, t5))
      }

  val TimeCount: (() => Days) => Days = t1 =>
    new Days {
      override def other(t2: Days, t3: Days, t4: Days, t5: Days): Habit = t2.other(t3, t4, t5, t1())
    }

}
