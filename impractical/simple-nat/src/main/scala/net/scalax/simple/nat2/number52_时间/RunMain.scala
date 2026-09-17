package net.scalax.simple
package nat
package number52

import scala.annotation.tailrec
import number52.Num52._

object RunTest1 {

  def build(current1: Long, tail1: (() => Time) => Time, tail2: (() => Time) => Time): Time = {
    def buildImpl(numLong: Long, zero: () => Time): Time = {
      if (numLong > 0) {
        tail1(() => buildImpl(numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: Time = buildImpl(numLong = current1, zero = () => tail2(() => build_1))

    build_1
  }

  @tailrec
  def countImpl(
    num: () => TimeResult,
    current: Map[String, Long],
    printlnSum: Int,
    speed: Long,
    dealResult: Map[String, Long] => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0

    if (needPrintln) {
      dealResult(current): Unit
    }

    if (printlnSum > 0) {
      val currentNum = num()

      val oldValue: Long = current.getOrElse(currentNum.key, 1L)
      val newMap         = current + (currentNum.key -> (oldValue + 1L))

      countImpl(
        currentNum.tail,
        current = newMap,
        printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
        speed = speed,
        dealResult = dealResult
      )
    }
  }

  def count(
    num: () => TimeResult,
    printlnSum: Int,
    speed: Long = 80000,
    dealResult: Map[String, Long] => Unit
  ): Unit =
    countImpl(
      num = num,
      current = Map.empty,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main1(arr: Array[String]): Unit = {
    val 地支: Time = build(12, TimeCount, TimeTop("dizhi"))
    val 年: Time  = build(12, TimeCount, TimeDong("year"))
    val 月: Time  = build(30, TimeCount, TimeDong("month"))
    val 日: Time  = build(24, TimeCount, TimeDong("day"))
    val 时: Time  = build(60, TimeTop("min"), TimeDong("hour"))

    count(
      () => 地支.other(年, 月, 日, 时),
      printlnSum = 5,
      speed = 100000000,
      dealResult = map => {
        println(map)

        println("min vs hour")
        println(BigDecimal(map.getOrElse("min", 1L)) / BigDecimal(map.getOrElse("hour", 1L)))
        println("hour vs day")
        println(BigDecimal(map.getOrElse("hour", 1L)) / BigDecimal(map.getOrElse("day", 1L)))
        println("day vs month")
        println(BigDecimal(map.getOrElse("day", 1L)) / BigDecimal(map.getOrElse("month", 1L)))
        println("day vs month")
        println(BigDecimal(map.getOrElse("month", 1L)) / BigDecimal(map.getOrElse("year", 1L)))

        println("year vs day")
        println(BigDecimal(map.getOrElse("day", 1L)) / BigDecimal(map.getOrElse("year", 1L)))
        println("day vs second")
        println(BigDecimal(map.getOrElse("min", 1L) * 60) / BigDecimal(map.getOrElse("day", 1L)))

        println("=== finished 1 ===")
      }
    )

  }

}
