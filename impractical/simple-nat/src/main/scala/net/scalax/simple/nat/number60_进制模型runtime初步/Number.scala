package net.scalax.simple
package nat
package number60

object Num60 {

  trait ThreeOut {
    val _1: Three
    val _2: Three
  }

  trait Three {
    val value: Any
    val _0: Three
    val _1: Three
    val _2: Three
  }

  def three: ThreeOut = ???
  three._1.value
  three._2.value
  three._1._0.value
  three._1._1.value
  three._1._2.value
  three._2._0.value
  three._2._1.value
  three._2._2.value
  three._1._0._0.value
  three._1._0._1.value
  three._1._0._2.value
  three._1._1._0.value
  three._1._1._1.value
  three._1._1._2.value
  three._1._2._0.value
  three._1._2._1.value
  three._1._2._2.value
  three._2._0._0.value

}
