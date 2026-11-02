package net.scalax.simple
package nat
package number69

import number69.Num69._

object RunTest1 {

  def main1(arr: Array[String]): Unit = {

    val num1: Number1 = Number1_2
    val num2: Number1 = Number1_1(num1)
    val num3: Number1 = Number1_1(num2)
    val num4: Number1 = Number1_1(num3)

    println(num1.other1(num2_1).size)
    println(num2.other1(num2_1).size)
    println(num3.other1(num2_1).size)
    println(num4.other1(num2_1).size)
  }

}
