package net.scalax.simple
package nat
package number53

import scala.annotation.tailrec
import number53.Num53._

object RunTest1 {

  def build(current1: Long, current2: Long, tail1: (() => Days) => Days, tail2: (() => Days) => Days): Days = {
    def buildImpl(numLong: Long, successor: (() => Days) => Days, zero: () => Days): Days = {
      if (numLong > 0) {
        successor(() => buildImpl(numLong - 1, successor, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: Days = buildImpl(numLong = current1, tail1, zero = () => build_2)
    lazy val build_2: Days = buildImpl(numLong = current2, tail2, zero = () => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => Habit,
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
    num: () => Habit,
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
    val 日出: Days    = build(1, 1, TimeDong("richu"), TimeCount)
    val 刷牙: Days    = build(1, 1, TimeDong("shuaya"), TimeCount)
    val 吃饭: Days    = build(2, 1, TimeDong("chifan"), TimeCount)
    val 更换漱口瓶: Days = build(1, 7, TimeDong("shukouping"), TimeCount)
    val 剃胡子: Days   = build(2, 3, TimeDong("tihuzi"), TimeCount)

    count(
      () => 日出.other(刷牙, 吃饭, 更换漱口瓶, 剃胡子),
      printlnSum = 5,
      speed = 100000000,
      dealResult = map => {
        println(map)

        println("richu vs shuaya except 1:1")
        println(BigDecimal(map.getOrElse("shuaya", 1L)) / BigDecimal(map.getOrElse("richu", 1L)))
        println("richu vs chifan except 2:1")
        println(BigDecimal(map.getOrElse("chifan", 1L)) / BigDecimal(map.getOrElse("richu", 1L)))
        println(s"richu vs shukouping except 1:7(${BigDecimal(1) / BigDecimal(7)})")
        println(BigDecimal(map.getOrElse("shukouping", 1L)) / BigDecimal(map.getOrElse("richu", 1L)))
        println(s"richu vs tihuzi except 2:3(${BigDecimal(2) / BigDecimal(3)})")
        println(BigDecimal(map.getOrElse("tihuzi", 1L)) / BigDecimal(map.getOrElse("richu", 1L)))

        println("=== finished 1 ===")
      }
    )

  }

}
