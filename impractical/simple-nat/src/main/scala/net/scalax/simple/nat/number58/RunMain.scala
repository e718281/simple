package net.scalax.simple
package nat
package number58

import scala.annotation.tailrec
import number58.Num58._

object RunTest1 {
  def build(current1: Long, current2: Long): Number = {
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
  def countImpl(
    num: Number,
    current: Map[(() => Number) => Number, Long],
    printlnSum: Int,
    speed: Long,
    dealResult: (Long, Long) => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0
    val printSum: Int        =
      if (needPrintln) {
        dealResult(current.getOrElse(Successor1, 1), current.getOrElse(Successor2, 1)): Unit
        printlnSum - 1
      } else printlnSum

    if (printlnSum > 0) {
      val (nextCount, numType) = num.unsafeRun
      countImpl(
        nextCount(),
        current = current + (numType -> (current.getOrElse(numType, 1L) + 1L)),
        printlnSum = printSum,
        speed = speed,
        dealResult = dealResult
      )
    }
  }

  def count(
    num: Number,
    printlnSum: Int,
    speed: Long = 80000,
    dealResult: (Long, Long) => Unit
  ): Unit =
    countImpl(
      num = num,
      current = Map.empty,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main(arr: Array[String]): Unit = {
    val num1: Number        = build(current1 = 2, current2 = 56)
    val result1: BigDecimal = BigDecimal(2) / BigDecimal(56)
    count(
      num1,
      printlnSum = 5,
      dealResult = (l1, l2) => println(s"except1:$result1 autal1: ${BigDecimal(l1) / BigDecimal(l2)}")
    )

    val num2: Number        = build(current1 = 78, current2 = 9)
    val result2: BigDecimal = BigDecimal(78) / BigDecimal(9)
    count(
      num2,
      printlnSum = 5,
      dealResult = (l1, l2) => println(s"except2:$result2 autal2: ${BigDecimal(l1) / BigDecimal(l2)}")
    )

    val num3: Number        = num1.加(num2)
    val result3: BigDecimal = result1 + result2
    count(
      num3,
      printlnSum = 5,
      dealResult = (l1, l2) => println(s"except3:$result3 autal3: ${BigDecimal(l1) / BigDecimal(l2)}")
    )

    val num4: Number        = build(current1 = 5, current2 = 65)
    val result4: BigDecimal = BigDecimal(5) / BigDecimal(65)
    count(
      num4,
      printlnSum = 5,
      dealResult = (l1, l2) => println(s"except4:$result4 autal4: ${BigDecimal(l1) / BigDecimal(l2)}")
    )

    val num5: Number        = num3.除以(num4)
    val result5: BigDecimal = result3 / result4
    count(
      num5,
      printlnSum = 5,
      speed = 400000,
      dealResult = (l1, l2) => println(s"except5:$result5 autal5: ${BigDecimal(l1) / BigDecimal(l2)}")
    )

    val num6: Number        = num4.乘以(num5)
    val result6: BigDecimal = result4 * result5
    count(
      num6,
      printlnSum = 5,
      speed = 400000,
      dealResult = (l1, l2) => println(s"except6:$result6 autal6: ${BigDecimal(l1) / BigDecimal(l2)}")
    )

    val num7: Number        = num2.除以(num4.乘以(num5).加(num3)).加(num2).乘以(num6)
    val result7: BigDecimal = (result2 / (result4 * result5 + result3) + result2) * result6
    count(
      num7,
      printlnSum = 5,
      speed = 800000,
      dealResult = (l1, l2) => println(s"except7:$result7 autal7: ${BigDecimal(l1) / BigDecimal(l2)}")
    )
  }

}
