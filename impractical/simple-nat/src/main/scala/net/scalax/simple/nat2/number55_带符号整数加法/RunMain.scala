package net.scalax.simple
package nat
package number55

import number55.Num55._

object RunTest1 {

  def build(current1: Int, current2: Int): Number = {
    if (current1 > 0) {
      Successor1(build(current1 - 1, current2))
    } else if (current2 > 0) {
      Successor2(build(current1, current2 - 1))
    } else Zero
  }

  def main1(arr: Array[String]): Unit = {

    val result1: Number = build(3, 5)
    val result2: Number = build(4, 8)
    val result3: Number = result1.plus(result2)

    println(s"result1: ${result1.unsafeRun}, except: -2")
    println(s"result2: ${result2.unsafeRun}, except: -4")
    println(s"result3: ${result3.unsafeRun}, except: -6")

    val result4: Number = build(4, 5)
    val result5: Number = build(18, 2)
    val result6: Number = result4.plus(result5)

    println(s"result4: ${result4.unsafeRun}, except: -1")
    println(s"result5: ${result5.unsafeRun}, except: 16")
    println(s"result6: ${result6.unsafeRun}, except: 15")

    val result7: Number = result3.plus(result6)
    println(s"result7: ${result7.unsafeRun}, except: 9")

  }

}
