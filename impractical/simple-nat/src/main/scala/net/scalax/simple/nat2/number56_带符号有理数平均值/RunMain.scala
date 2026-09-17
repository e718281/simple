package net.scalax.simple
package nat
package number56

import scala.annotation.tailrec
import number56.Num56._

object RunTest1 {
  def build(current1: Long, current2: Long, current3: Long): Number = {
    def buildImpl(appender: (() => Number) => Number, numLong: Long, zero: () => Number): Number = {
      if (numLong > 0) {
        appender(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: Number = buildImpl(appender = Successor1, numLong = current1, zero = () => build_2)
    lazy val build_2: Number = buildImpl(appender = Successor2, numLong = current2, zero = () => build_3)
    lazy val build_3: Number = buildImpl(appender = Successor3, numLong = current3, zero = () => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: Number,
    current: Map[(() => Number) => Number, Long],
    printlnSum: Int,
    speed: Long,
    dealResult: (Long, Long, Long) => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0
    val printSum: Int        = if (needPrintln) {
      dealResult(current.getOrElse(Successor1, 1L), current.getOrElse(Successor2, 1L), current.getOrElse(Successor3, 1L)): Unit
      printlnSum - 1
    } else printlnSum

    if (printSum > 0) {
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
    dealResult: (Long, Long, Long) => Unit
  ): Unit =
    countImpl(
      num = num,
      current = Map.empty,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main1(arr: Array[String]): Unit = {
    val num1: Number        = build(current1 = 2, current2 = 56, current3 = 7)
    val result1: BigDecimal = (BigDecimal(2) - BigDecimal(56)) / BigDecimal(7)
    count(
      num1,
      printlnSum = 5,
      dealResult = (l1, l2, l3) => println(s"except:$result1 autal: ${(BigDecimal(l1) - BigDecimal(l2)) / BigDecimal(l3)}")
    )

    val num2: Number        = build(current1 = 78, current2 = 9, current3 = 6)
    val result2: BigDecimal = (BigDecimal(78) - BigDecimal(9)) / BigDecimal(6)
    count(
      num2,
      printlnSum = 5,
      dealResult = (l1, l2, l3) => println(s"except:$result2 autal: ${(BigDecimal(l1) - BigDecimal(l2)) / BigDecimal(l3)}")
    )

    val num3: Number        = num1.plus(num2)
    val result3: BigDecimal = (result1 + result2) / 2
    count(
      num3,
      printlnSum = 5,
      dealResult = (l1, l2, l3) => println(s"except:$result3 autal: ${(BigDecimal(l1) - BigDecimal(l2)) / BigDecimal(l3)}")
    )

    val num4: Number        = build(current1 = 5, current2 = 65, current3 = 7)
    val result4: BigDecimal = (BigDecimal(5) - BigDecimal(65)) / BigDecimal(7)
    count(
      num4,
      printlnSum = 5,
      dealResult = (l1, l2, l3) => println(s"except:$result4 autal: ${(BigDecimal(l1) - BigDecimal(l2)) / BigDecimal(l3)}")
    )

    val num5: Number        = num3.plus(num4)
    val result5: BigDecimal = (result3 + result4) / 2
    count(
      num5,
      printlnSum = 5,
      speed = 400000,
      dealResult = (l1, l2, l3) => println(s"except:$result5 autal: ${(BigDecimal(l1) - BigDecimal(l2)) / BigDecimal(l3)}")
    )

  }

}
