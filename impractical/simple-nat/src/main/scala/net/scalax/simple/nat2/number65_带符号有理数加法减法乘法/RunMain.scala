package net.scalax.simple
package nat
package number65

import scala.annotation.tailrec
import number65.Num65._

object RunTest1 {
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
  def countImpl(
    num1: Number,
    num2: Number,
    current1: Long,
    current2: Long,
    current3: Long,
    current4: Long,
    except: BigDecimal,
    wucha: BigDecimal,
    speed: Long
  ): Boolean = {
    val needPrintln: Boolean    = (current1 + current2 + current3 + current4) % speed == 0
    def currentNum: BigDecimal  = BigDecimal(current1) / BigDecimal(current2) - BigDecimal(current3) / BigDecimal(current4)
    val actualWucha: BigDecimal = (currentNum - except).abs
    val finished: Boolean       = actualWucha <= wucha

    if (needPrintln || finished) {
      println(s"current: $currentNum, except: $except, finished: $finished")
    }

    if (finished) {
      finished
    } else {
      val (nextCount1, numType1) = num1.unsafeRun
      val (nextCount2, numType2) = num2.unsafeRun
      countImpl(
        nextCount1(),
        nextCount2(),
        current1 = if (numType1 == Successor1) current1 + 1 else current1,
        current2 = if (numType1 == Successor1) current2 else current2 + 1,
        current3 = if (numType2 == Successor1) current3 + 1 else current3,
        current4 = if (numType2 == Successor1) current4 else current4 + 1,
        except = except,
        wucha = wucha,
        speed = speed
      )
    }
  }

  def count(num: AddNumber, except: BigDecimal, wucha: BigDecimal, speed: Long = 80000): Boolean =
    countImpl(
      num1 = num.left,
      num2 = num.right,
      current1 = 1,
      current2 = 1,
      current3 = 1,
      current4 = 1,
      except = except,
      wucha = wucha.abs,
      speed = speed
    )

  def main(arr: Array[String]): Unit = {
    println("=== start num1 ===")
    val num1: AddNumber     = AddNumber(build(current1 = 2, current2 = 56), build(current1 = 78, current2 = 9))
    val result1: BigDecimal = BigDecimal(2) / BigDecimal(56) - BigDecimal(78) / BigDecimal(9)
    count(
      num1,
      except = result1,
      wucha = BigDecimal(1) / BigDecimal(10000)
    )

    println("=== start num2 ===")
    val num2: AddNumber     = AddNumber(build(current1 = 56, current2 = 2), build(current1 = 32, current2 = 7))
    val result2: BigDecimal = BigDecimal(56) / BigDecimal(2) - BigDecimal(32) / BigDecimal(7)
    count(
      num2,
      except = result2,
      wucha = BigDecimal(1) / BigDecimal(10000)
    )

    println("=== start num3 ===")
    val num3: AddNumber     = num1.加(num2)
    val result3: BigDecimal = result1 + result2
    count(
      num3,
      except = result3,
      wucha = BigDecimal(1) / BigDecimal(10000)
    )

    println("=== start num4 ===")
    val num4: AddNumber     = num1.乘以(num3)
    val result4: BigDecimal = result1 * result3
    count(
      num4,
      speed = 1000000,
      except = result4,
      wucha = BigDecimal(1) / BigDecimal(100)
    )

    println("=== start num5 ===")
    val num5: AddNumber     = num1.乘以(num4)
    val result5: BigDecimal = result1 * result4
    count(
      num5,
      speed = 10000000,
      except = result5,
      wucha = BigDecimal(1) / BigDecimal(10)
    )

    println("=== start num6 ===")
    val num6: AddNumber     = num2.减(num1)
    val result6: BigDecimal = result2 - result1
    count(
      num6,
      except = result6,
      wucha = BigDecimal(1) / BigDecimal(10000)
    )

    println("=== start num7 ===")
    val num7: AddNumber     = num2.乘以(num3.减(num1)).加(num2).乘以(num6)
    val result7: BigDecimal = (result2 * (result3 - result1) + result2) * result6
    count(
      num7,
      except = result7,
      wucha = BigDecimal(1) / BigDecimal(10000)
    )

    println("=== start num8 ===")
    val num8: AddNumber     = num2.除以(build(25, 11))
    val result8: BigDecimal = result2 / (BigDecimal(25) / BigDecimal(11))
    count(
      num8,
      except = result8,
      wucha = BigDecimal(1) / BigDecimal(10000)
    )
  }

}
