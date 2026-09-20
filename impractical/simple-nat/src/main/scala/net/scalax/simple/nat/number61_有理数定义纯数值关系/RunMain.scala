package net.scalax.simple
package nat
package number61

import scala.annotation.tailrec
import Num61._

object RunTest1 {

  def main1(arr: Array[String]): Unit = {
    locally {
      val i1: 有理数 = 有理数(86, 57, 25, 32)
      val i2: 有理数 = 有理数(23, 45, 4, 8)
      val i3: 有理数 = i1.加(i2)
      val i4: 有理数 = i1.乘以(i2)
      val i5: 有理数 = i1.除以(i2)

      println(i1.value)
      println(i2.value)
      println("=== finished 1-1 ===")
      println(i1.value + i2.value)
      println(i3.value)
      println("=== finished 1-2 ===")
      println(i1.value * i2.value)
      println(i4.value)
      println("=== finished 1-3 ===")
      println(i1.value / i2.value)
      println(i5.value)
      println("=== finished 1 ===")
    }

    locally {
      val i5: 有理数2 = 有理数2(86, 57, 265)
      val i6: 有理数2 = 有理数2(23, 45, 4)
      val i7: 有理数2 = i5.加(i6)
      println(i5.value)
      println(i6.value)
      println(i5.value + i6.value)
      println(i7.value)
    }

  }

}
