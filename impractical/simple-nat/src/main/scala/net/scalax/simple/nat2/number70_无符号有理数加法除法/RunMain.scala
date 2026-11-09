package net.scalax.simple
package nat
package number70

import scala.annotation.tailrec
import number70.Num70._

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
    current1: Long,
    current2: Long,
    except: BigDecimal,
    wucha: BigDecimal,
    speed: Long
  ): Boolean = {
    val needPrintln: Boolean    = (current1 + current2) % speed == 0
    def currentNum: BigDecimal  = BigDecimal(current1) / BigDecimal(current2)
    val actualWucha: BigDecimal = (currentNum - except).abs
    val finished: Boolean       = actualWucha <= wucha

    if (needPrintln || finished) {
      println(s"current: $currentNum, except: $except, finished: $finished")
    }

    if (finished) {
      finished
    } else {
      val (nextCount1, numType1) = num1.unsafeRun
      countImpl(
        nextCount1(),
        current1 = if (numType1 == Successor1) current1 + 1 else current1,
        current2 = if (numType1 == Successor1) current2 else current2 + 1,
        except = except,
        wucha = wucha,
        speed = speed
      )
    }
  }

  def count(num: Number, except: BigDecimal, wucha: BigDecimal, speed: Long = 80000): Boolean =
    countImpl(
      num1 = num,
      current1 = 1,
      current2 = 1,
      except = except,
      wucha = wucha.abs,
      speed = speed
    )

  def main(arr: Array[String]): Unit = {
    println("=== start num1 ===")
    val num1: Number        = build(current1 = 22, current2 = 7)
    val result1: BigDecimal = BigDecimal(22) / BigDecimal(7)
    count(
      num1,
      except = result1,
      wucha = BigDecimal(1) / BigDecimal(1000000)
    )

    println("=== start num2 ===")
    val num2: Number        = build(current1 = 15, current2 = 4)
    val result2: BigDecimal = BigDecimal(15) / BigDecimal(4)
    count(
      num2,
      except = result2,
      wucha = BigDecimal(1) / BigDecimal(1000000)
    )

    println("=== start num3 ===")
    val num3: Number        = Number.加(num1, num2)
    val result3: BigDecimal = result1 + result2
    count(
      num3,
      except = result3,
      wucha = BigDecimal(1) / BigDecimal(1000000)
    )

    println("=== start num4 ===")
    val num4: Number        = Number.除以(num1, num3)
    val result4: BigDecimal = result1 / result3
    count(
      num4,
      speed = 1000000,
      except = result4,
      wucha = BigDecimal(1) / BigDecimal(100000000)
    )

    println("=== start num5 ===")
    val num5: Number        = Number.除以(num4, Number.加(num1, num2))
    val result5: BigDecimal = result4 / (result1 + result2)
    count(
      num5,
      speed = 10000000,
      except = result5,
      wucha = BigDecimal(1) / BigDecimal(100000000000L)
    )
  }

}
