package net.scalax.simple
package nat
package number63

import number63.Num63._

import scala.util.Random

object RunTest1 {
  def build: Number = {
    val gen: Long = Random.nextLong()
    if (gen % 3 == 0 || gen % 3 == 1) One else Successor2(build, build)
  }

  def main(arr: Array[String]): Unit = {
    val num1: Number =
      Successor2(Successor2(Successor2(Successor2(Successor2(One, One), One), One), One), Successor2(One, Successor2(One, One)))
    val result1: Long = num1.unsafeRun
    println(s"result1: $result1")

    val num2: Number  = build
    val result2: Long = num2.unsafeRun
    println(s"result2: $result2")

    val num3: Number  = num1.multiply(num2)
    val result3: Long = result1 * result2
    println(s"result3: $result3, actual3: ${num3.unsafeRun}")

    val num4: Number  = num3.plus(num2)
    val result4: Long = result3 + result2
    println(s"result4: $result4, actual4: ${num4.unsafeRun}")

    val num5: Number  = num1.multiply(num1).multiply(num1)
    val result5: Long = result1 * result1 * result1
    println(s"result5: $result5, actua5: ${num5.unsafeRun}")

    val num6: Number  = num5.multiply(num1)
    val result6: Long = result5 * result1
    println(s"result6: $result6, actua6: ${num6.unsafeRun}")

    val num7: Number  = num4.multiply(num5)
    val result7: Long = result4 * result5
    println(s"result7: $result7, actual7: ${num7.unsafeRun}")

    val num8: Number  = num4.multiply(num6)
    val result8: Long = result4 * result6
    println(s"result8: $result8, actual8: ${num8.unsafeRun}")
  }

}
