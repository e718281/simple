package net.scalax.simple
package nat
package number60

import Num60._

object RunTest1 {

  def main(arr: Array[String]): Unit = {
    val three: ThreeOut = new ThreeOut {}
    three._1.value = "1"
    three._2.value = "2"
    three._1._0.value = "10"
    three._1._1.value = "11"
    three._1._2.value = "12"
    three._2._0.value = "20"
    three._2._1.value = "21"
    three._2._2.value = "22"
    three._1._0._0.value = "100"
    three._1._0._1.value = "101"
    three._1._0._2.value = "102"
    three._1._1._0.value = "110"
    three._1._1._1.value = "111"
    three._1._1._2.value = "112"
    three._1._2._0.value = "120"
    three._1._2._1.value = "121"
    three._1._2._2.value = "122"
    three._2._0._0.value = "200"

    println(three._1.value)
    println(three._2.value)
    println(three._1._0.value)
    println(three._1._1.value)
    println(three._1._2.value)
    println(three._2._0.value)
    println(three._2._1.value)
    println(three._2._2.value)
    println(three._1._0._0.value)
    println(three._1._0._1.value)
    println(three._1._0._2.value)
    println(three._1._1._0.value)
    println(three._1._1._1.value)
    println(three._1._1._2.value)
    println(three._1._2._0.value)
    println(three._1._2._1.value)
    println(three._1._2._2.value)
    println(three._2._0._0.value)
    println(three._2._0._1.value) // null
  }

}
