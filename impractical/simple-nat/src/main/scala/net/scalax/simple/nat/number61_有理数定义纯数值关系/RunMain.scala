package net.scalax.simple
package nat
package number61

import scala.annotation.tailrec
import Num61._

object RunTest1 {

  def main(arr: Array[String]): Unit = {
    val i1: 有理数 = 有理数(86, 57, 25, 32)
    val i2: 有理数 = 有理数(23, 45, 4, 8)
    val i3: 有理数 = i1.加(i2)
    val i4: 有理数 = i1.乘以(i2)

    println(i1.value)
    println(i2.value)
    println(i1.value + i2.value)
    println(i3.value)
    println(i1.value * i2.value)
    println(i4.value)

    val i5: 有理数2 = 有理数2(86, 57, 25)
    val i6: 有理数2 = 有理数2(23, 45, 4)
    val i7: 有理数2 = i5.加(i6)
    println(i5.value)
    println(i6.value)
    println(i5.value + i6.value)
    println(i7.value)

  }

}
