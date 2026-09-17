package net.scalax.simple
package nat
package number46

import scala.annotation.tailrec
import ghdmzsk.ghdmzsk

object RunTest1 {

  def build(current1: Long, current2: Long): ghdmzsk = {
    def buildImpl(appender: ghdmzsk, numLong: Long, zero: () => ghdmzsk): ghdmzsk = {
      if (numLong > 0) {
        appender.inputGHDMZSK(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: ghdmzsk = buildImpl(appender = Num46.Append1.tail1Num, numLong = current1, zero = () => build_2)
    lazy val build_2: ghdmzsk = buildImpl(appender = Num46.Append1.tail2Num, numLong = current2, zero = () => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => ghdmzsk,
    current1: Long,
    current2: Long,
    printlnSum: Int,
    speed: Long,
    dealResult: BigDecimal => Unit
  ): Unit = {
    val needPrintln: Boolean = (current1 + current2) % speed == 0

    if (needPrintln) {
      dealResult(BigDecimal(current2) / BigDecimal(current1)): Unit
    }

    val currentNum = num()

    if (printlnSum > 0) {
      currentNum match {
        case num1: Num46.Num1 =>
          countImpl(
            () => num1.pre1,
            current1 = current1 + 1,
            current2 = current2,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
        case num2: Num46.Num2 =>
          countImpl(
            () => num2.pre2,
            current1 = current1,
            current2 = current2 + 1,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
      }
    }
  }

  def count(
    num: () => ghdmzsk,
    printlnSum: Int,
    speed: Long = 80000,
    dealResult: BigDecimal => Unit
  ): Unit =
    countImpl(
      num = num,
      current1 = 1,
      current2 = 1,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main(arr: Array[String]): Unit = {
    def countIns(a1: Long, a2: Long, b1: Long, b2: Long, c1: Long, c2: Long, d1: Long, d2: Long): Unit = {
      val num1: ghdmzsk       = build(current1 = a1, current2 = a2)
      val result1: BigDecimal = BigDecimal(a2) / BigDecimal(a1)

      val num2: ghdmzsk       = build(current1 = b1, current2 = b2)
      val result2: BigDecimal = BigDecimal(b2) / BigDecimal(b1)

      val num3: ghdmzsk       = build(current1 = c1, current2 = c2)
      val result3: BigDecimal = BigDecimal(c2) / BigDecimal(c1)

      val num4: ghdmzsk       = build(current1 = d1, current2 = d2)
      val result4: BigDecimal = BigDecimal(d2) / BigDecimal(d1)

      count(
        () => num1,
        printlnSum = 3,
        speed = 10000000,
        dealResult = coResult => {
          println(s"rawA: $result1,  limitedA: $coResult")
        }
      )
      println("passed param 1")
      count(
        () => num2,
        printlnSum = 3,
        speed = 10000000,
        dealResult = coResult => {
          println(s"rawB: $result2,  limitedB: $coResult")
        }
      )
      println("passed param 2")
      count(
        () => num3,
        printlnSum = 3,
        speed = 10000000,
        dealResult = coResult => {
          println(s"rawC: $result3,  limitedC: $coResult")
        }
      )
      println("passed param 3")
      count(
        () => num4,
        printlnSum = 3,
        speed = 10000000,
        dealResult = coResult => {
          println(s"rawC: $result4,  limitedC: $coResult")
        }
      )
      println("passed param 4")

      val num5: ghdmzsk = num1
        .inputGHDMZSK(() => Num46.Append1.tail1Num)
        .inputGHDMZSK(() => num2)
        .inputGHDMZSK(() => Num46.Append1.tail2Num)
        .inputGHDMZSK(() => num3)
        .inputGHDMZSK(() => Num46.Append1.tail2Num)
        .inputGHDMZSK(() => num4)
        .inputGHDMZSK(() => Num46.Append1.tail2Num)
      val result5 = (result1 / result2) + (result1 / result3) + (result1 / result4)

      count(
        () => num5,
        printlnSum = 5,
        speed = 1000000,
        dealResult = coResult => {
          println(s"resultSum1: $result5,  limitedSum1: $coResult")
        }
      )
      println("passed result 1")

      val num6: ghdmzsk = num5
        .inputGHDMZSK(() => Num46.Append1.tail1Num)
        .inputGHDMZSK(() => num2)
        .inputGHDMZSK(() => Num46.Append1.tail2Num)
        .inputGHDMZSK(() => num3)
        .inputGHDMZSK(() => Num46.Append1.tail2Num)
        .inputGHDMZSK(() => num3)
        .inputGHDMZSK(() => Num46.Append1.tail2Num)
      val result6 = (result5 / result2) + (result5 / result3) + (result5 / result3)

      count(
        () => num6,
        printlnSum = 5,
        speed = 1000000,
        dealResult = coResult => {
          println(s"resultSum2: $result6,  limitedSum2: $coResult")
        }
      )
    }

    countIns(a1 = 127, a2 = 87, b1 = 79, b2 = 42, c1 = 3, c2 = 46, d1 = 32, d2 = 16)
    println("=== finished 1 ===")
    countIns(a1 = 32, a2 = 23, b1 = 12, b2 = 5, c1 = 7, c2 = 12, d1 = 18, d2 = 36)
    println("=== finished 2 ===")

  }

}
