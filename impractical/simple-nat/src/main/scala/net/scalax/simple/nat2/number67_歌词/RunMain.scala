package net.scalax.simple
package nat
package number67

import number67.Num67._

object RunTest1 {

  val A: List[String] = List("没有三分爱意在", "怎惹七分伤与害")
  val B: List[String] = List("爱恋一对字拆不开")
  val C: List[String] = List("爱新不爱旧还是爱")
  val D: List[String] = List("鸳鸯似永远不死", "哪管哪段年代", "红男绿女都相信相爱", "可化蝶远飞", "旧戏新做化作传奇", "最易惹乐与悲", "最难判是与非", "又甜又苦全是戏")

  val Sum: List[String] = A ::: B ::: A ::: C ::: A ::: B ::: A ::: C ::: D ::: A ::: B ::: A ::: C ::: A ::: B ::: A ::: C ::: D

  def count(num1: TimeResult, size: Long): List[String] =
    if (size > 0) num1.key :: count(num1.tail(), size - 1)
    else List.empty

  def main(arr: Array[String]): Unit = {
    val List(a1, a2)                         = A
    val List(b1)                             = B
    val List(c1)                             = C
    val List(d1, d2, d3, d4, d5, d6, d7, d8) = D

    lazy val roundA: Time = TimeTop(a1)(() => TimeTop(a2)(() => TimeCount(() => roundA)))
    lazy val roundB: Time = TimeTop(b1)(() => TimeDong(() => TimeCount(() => TimeDong(() => roundB))))
    lazy val roundC: Time = TimeTop(c1)(() => TimeDong(() => roundC))
    lazy val roundD: Time = TimeTop(d1)(() =>
      TimeTop(d2)(() =>
        TimeTop(d3)(() => TimeTop(d4)(() => TimeTop(d5)(() => TimeTop(d6)(() => TimeTop(d7)(() => TimeTop(d8)(() => roundD))))))
      )
    )

    val result: TimeResult       = roundA.other(roundB, roundC, roundD)
    val resultList: List[String] = count(result, 24)
    val takeNum: Int             = 24
    println(resultList.take(takeNum) == Sum.take(takeNum))
    println(resultList.take(takeNum).mkString("\n"))
  }

}
