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
    val needPrintln: Boolean    = (current1 + current2) % speed == 0 && (current1 + current2) > 1000000
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

      if (numType1 == Successor1) {
        countImpl(
          nextCount1(),
          current1 = current1 + 1,
          current2 = current2,
          except = except,
          wucha = wucha,
          speed = speed
        )
      } else {
        countImpl(
          nextCount1(),
          current1 = current1,
          current2 = current2 + 1,
          except = except,
          wucha = wucha,
          speed = speed
        )
      }
    }
  }

  def count(num: Number, except: BigDecimal, wucha: BigDecimal, speed: Long = 1000000): Boolean =
    countImpl(
      num1 = num,
      current1 = 20,
      current2 = 1,
      except = except,
      wucha = wucha.abs,
      speed = speed
    )

  def main1(arr: Array[String]): Unit = {
    println("=== start num1 ===")
    val num1: Number        = build(current1 = 15, current2 = 13)
    val result1: BigDecimal = BigDecimal(15) / BigDecimal(13)
    count(
      num1,
      except = result1,
      wucha = result1 / BigDecimal(100000)
    )

    println("=== start num2 ===")
    val num2: Number        = build(current1 = 17, current2 = 4)
    val result2: BigDecimal = BigDecimal(17) / BigDecimal(4)
    count(
      num2,
      except = result2,
      wucha = result2 / BigDecimal(100000)
    )

    println("=== start num3 ===")
    val num3: Number        = Number.加(num1, num2)
    val result3: BigDecimal = result1 + result2
    count(
      num3,
      except = result3,
      wucha = result3 / BigDecimal(100000)
    )

    println("=== start num4 ===")
    val num4: Number        = Number.除以(num1, num3)
    val result4: BigDecimal = result1 / result3
    count(
      num4,
      except = result4,
      wucha = result4 / BigDecimal(100000)
    )

    println("=== start num5 ===")
    val num5: Number        = Number.除以(num4, Number.加(num1, num2))
    val result5: BigDecimal = result4 / (result1 + result2)
    count(
      num5,
      except = result5,
      wucha = result5 / BigDecimal(100000)
    )

    locally {
      println("=== start num6 ===")
      val num6: Number        = Number.运算1_1(num1, num2)
      val result6: BigDecimal = 1
      count(
        num6,
        except = result6,
        wucha = result6 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num7 ===")
      val num7: Number        = Number.运算1_2(num1, num2)
      val result7: BigDecimal = 1
      count(
        num7,
        except = result7,
        wucha = result7 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num8 ===")
      val num8: Number        = Number.运算1_3(num1, num2)
      val result8: BigDecimal = 1
      count(
        num8,
        except = result8,
        wucha = result8 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num9 ===")
      val num9: Number        = Number.运算1_4(num1, num2)
      val result9: BigDecimal = result1 + result2
      count(
        num9,
        except = result9,
        wucha = result9 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num10 ===")
      val num10: Number        = Number.运算1_5(num1, num2)
      val result10: BigDecimal = 1 / (result1 + result2)
      count(
        num10,
        except = result10,
        wucha = result10 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num11 ===")
      val num11: Number        = Number.运算1_6(num1, num2)
      val result11: BigDecimal = result1 + result2
      count(
        num11,
        except = result11,
        wucha = result11 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num12 ===")
      val num12: Number        = Number.运算2_1(num1, num2)
      val result12: BigDecimal = result1 / result2
      count(
        num12,
        except = result12,
        wucha = result12 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num13 ===")
      val num13: Number        = Number.运算2_2(num1, num2)
      val result13: BigDecimal = result1 / 2
      count(
        num13,
        except = result13,
        wucha = result13 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num14 ===")
      val num14: Number        = Number.运算2_3(num1, num2)
      val result14: BigDecimal = result2 / result1
      count(
        num14,
        except = result14,
        wucha = result14 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num15 ===")
      val num15: Number        = Number.运算2_4(num1, num2)
      val result15: BigDecimal = 2 / result1
      count(
        num15,
        except = result15,
        wucha = result15 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num16 ===")
      val num16: Number        = Number.运算2_5(num1, num2)
      val result16: BigDecimal = result2 / 2
      count(
        num16,
        except = result16,
        wucha = result16 / BigDecimal(100000)
      )
    }

    locally {
      println("=== start num16 ===")
      val num17: Number        = Number.运算2_6(num1, num2)
      val result17: BigDecimal = 2 / result2
      count(
        num17,
        except = result17,
        wucha = result17 / BigDecimal(100000)
      )
    }
  }

}
