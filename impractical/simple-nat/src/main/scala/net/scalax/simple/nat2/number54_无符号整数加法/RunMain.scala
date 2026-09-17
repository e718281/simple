package net.scalax.simple
package nat
package number54

import scala.annotation.tailrec
import number54.Num54._

object RunTest1 {

  def build(current1: Int): Number = {
    if (current1 > 0) {
      Successor(build(current1 - 1))
    } else {
      Zero
    }
  }

  def main1(arr: Array[String]): Unit = {

    val result1: Number = build(3)
    val result2: Number = build(4)
    val result3: Number = result1.plus(result2)

    println(s"result1: ${result1.unsafeRun}, except: 3")
    println(s"result2: ${result2.unsafeRun}, except: 4")
    println(s"result3: ${result3.unsafeRun}, except: 7")

    val result4: Number = build(4)
    val result5: Number = build(5)
    val result6: Number = result4.plus(result5)

    println(s"result4: ${result4.unsafeRun}, except: 4")
    println(s"result5: ${result5.unsafeRun}, except: 5")
    println(s"result6: ${result6.unsafeRun}, except: 9")

    val result7: Number = result3.plus(result6)
    println(s"result7: ${result7.unsafeRun}, except: 16")

  }

}
