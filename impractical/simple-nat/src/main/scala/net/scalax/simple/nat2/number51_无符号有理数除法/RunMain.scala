package net.scalax.simple
package nat
package number51

import scala.annotation.tailrec

object RunTest1 {

  def build(current1: Long, current2: Long): Num51.Number51 = {
    def buildImpl(appender: (() => Num51.Number51) => Num51.Number51, numLong: Long, zero: () => Num51.Number51): Num51.Number51 = {
      if (numLong > 0) {
        appender(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: Num51.Number51 = buildImpl(appender = Num51.appender1, numLong = current1, zero = () => build_2)
    lazy val build_2: Num51.Number51 = buildImpl(appender = Num51.appender2, numLong = current2, zero = () => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: Num51.Number51,
    current: Map[(() => Num51.Number51) => Num51.Number51, Long],
    printlnSum: Int,
    speed: Long,
    dealResult: BigDecimal => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0

    if (needPrintln) {
      dealResult(BigDecimal(current.getOrElse(Num51.appender2, 1L)) / BigDecimal(current.getOrElse(Num51.appender1, 1L))): Unit
    }

    if (printlnSum > 0) {
      val (nextCount, numType) = num.unsafeRun
      countImpl(
        nextCount(),
        current = current + (numType -> (current.getOrElse(numType, 1L) + 1L)),
        printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
        speed = speed,
        dealResult = dealResult
      )
    }
  }

  def count(
    num: Num51.Number51,
    printlnSum: Int,
    speed: Long = 80000,
    dealResult: BigDecimal => Unit
  ): Unit =
    countImpl(
      num = num,
      current = Map.empty,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main1(arr: Array[String]): Unit = {
    def countIns(a1: Long, a2: Long, b1: Long, b2: Long): Unit = {
      val num1: Num51.Number51 = build(current1 = a1, current2 = a2)
      val result1: BigDecimal  = BigDecimal(a2) / BigDecimal(a1)

      val num2: Num51.Number51 = build(current1 = b1, current2 = b2)
      val result2: BigDecimal  = BigDecimal(b2) / BigDecimal(b1)

      count(
        num1,
        printlnSum = 3,
        speed = 10000000,
        dealResult = coResult => {
          println(s"rawA: $result1,  limitedA: $coResult")
        }
      )
      println("passed param 1")
      count(
        num2,
        printlnSum = 3,
        speed = 10000000,
        dealResult = coResult => {
          println(s"rawB: $result2,  limitedB: $coResult")
        }
      )
      println("passed param 2")

      val num5: Num51.Number51 = num1.other(num2, Num51.appender1, Num51.appender2)
      val result5              = result1 / result2

      count(
        num5,
        printlnSum = 5,
        speed = 1000000,
        dealResult = coResult => {
          println(s"resultSum1: $result5,  limitedSum1: $coResult")
        }
      )
      println("passed result 1")

      val num6: Num51.Number51 = num5.other(num2, Num51.appender1, Num51.appender2)
      val result6              = result5 / result2

      count(
        num6,
        printlnSum = 5,
        speed = 1000000,
        dealResult = coResult => {
          println(s"resultSum2: $result6,  limitedSum2: $coResult")
        }
      )

      val one                  = build(1, 1)
      val num7: Num51.Number51 = num5.other(one.other(num6, Num51.appender1, Num51.appender2), Num51.appender1, Num51.appender2)
      val result7              = result5 * result6

      count(
        num7,
        printlnSum = 5,
        speed = 1000000,
        dealResult = coResult => {
          println(s"except7: $result7,  current7: $coResult")
        }
      )
    }

    countIns(a1 = 127, a2 = 87, b1 = 79, b2 = 42)
    println("=== finished 1 ===")
    countIns(a1 = 32, a2 = 23, b1 = 12, b2 = 5)
    println("=== finished 2 ===")
    countIns(a1 = 7, a2 = 1, b1 = 22, b2 = 1)
    println("=== finished 2 ===")

  }

}
