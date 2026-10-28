package net.scalax.simple
package nat
package number68

import scala.annotation.tailrec

object Num68 { NumSelf =>
  trait Number {
    def pingfang(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number
    def unsafeRun: (() => Number, (() => Number) => Number)
  }

  val Successor3: (() => Number) => Number = numP => numP()

  class Ctx(succ1: Int, body1: Int, succ2: Int, body2: Int) {
    val Successor1: (() => Number) => Number = tail =>
      new Number {
        override def pingfang(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number = {
          val appenderS: (() => Number) => Number = succ1 match {
            case 1 => Successor1
            case 2 => Successor2
            case 3 => Successor3
            case 4 => appender1
            case 5 => appender2
          }

          val bodyS: () => Number = body1 match {
            case 1 => () => tail().pingfang(other, appender1, appender2)
            case 2 => () => other.pingfang(tail(), appender2, appender1)
          }

          appenderS(bodyS)
        }
        override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor1)
      }

    val Successor2: (() => Number) => Number = tail =>
      new Number {
        override def pingfang(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number = {
          val appenderS: (() => Number) => Number = succ2 match {
            case 1 => Successor1
            case 2 => Successor2
            case 3 => Successor3
            case 4 => appender1
            case 5 => appender2
          }

          val bodyS: () => Number = body2 match {
            case 1 => () => tail().pingfang(other, appender1, appender2)
            case 2 => () => other.pingfang(tail(), appender2, appender1)
          }

          appenderS(bodyS)
        }
        override def unsafeRun: (() => Number, (() => Number) => Number) = (tail, Successor2)
      }

    val One: Number = Successor1(() => Successor2(() => One))

    def build(current1: Long, current2: Long): Number = {
      assert(current1 > 0)
      assert(current2 > 0)

      def buildImpl(appender: (() => Number) => Number, numLong: Long, zero: () => Number): Number = {
        if (numLong > 0) {
          appender(() => buildImpl(appender, numLong - 1, zero))
        } else {
          zero()
        }
      }

      lazy val build_1: Number = buildImpl(appender = Successor1, numLong = current1, zero = () => build_2)
      lazy val build_2: Number = buildImpl(appender = Successor2, numLong = current2, zero = () => build_1)

      build_1
    }

    @tailrec
    private def countImpl(num: Number, current1: Long, current2: Long, speed: Long): BigDecimal = {
      val finished: Boolean = (current1 + current2) > speed

      if (finished) {
        BigDecimal(current1) / BigDecimal(current2)
      } else {
        val (nextCount1, numType1) = num.unsafeRun
        if (numType1 == Successor1) {
          countImpl(nextCount1(), current1 + 1, current2, speed)
        } else {
          countImpl(nextCount1(), current1, current2 + 1, speed)
        }
      }
    }

    def count(num: Number, speed: Long = 80000): BigDecimal = countImpl(num = num, current1 = 1, current2 = 1, speed = speed)
  }

}
