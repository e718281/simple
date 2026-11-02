package net.scalax.simple
package nat
package number67

import number67.Num67._

object `新鸳鸯蝴蝶梦-亮声open` {

  val A: List[String] = List("没有三分爱意在", "怎惹七分伤与害")
  val B: List[String] = List("爱恋一对字拆不开")
  val C: List[String] = List("爱新不爱旧还是爱")
  val D: List[String] = List("鸳鸯似永远不死", "哪管哪段年代", "红男绿女都相信相爱", "可化蝶远飞", "旧戏新做化作传奇", "最易惹乐与悲", "最难判是与非", "又甜又苦全是戏")

  val Sum: List[String] = A ::: B ::: A ::: C ::: A ::: B ::: A ::: C ::: D ::: A ::: B ::: A ::: C ::: A ::: B ::: A ::: C ::: D

  def execute(): Unit = {
    val List(a1, a2)                         = A
    val List(b1)                             = B
    val List(c1)                             = C
    val List(d1, d2, d3, d4, d5, d6, d7, d8) = D

    lazy val roundA: Time4 = TimeDong4(() => TimeTop4(a1)(() => TimeTop4(a2)(() => TimeCount4(() => roundA))))
    lazy val roundB: Time4 = TimeTop4(b1)(() => TimeDong4(() => TimeCount4(() => TimeDong4(() => roundB))))
    lazy val roundC: Time4 = TimeTop4(c1)(() => TimeDong4(() => roundC))
    lazy val roundD: Time4 = TimeCount4(() =>
      TimeCount4(() =>
        TimeCount4(() =>
          TimeCount4(() =>
            TimeTop4(d1)(() =>
              TimeTop4(d2)(() =>
                TimeTop4(d3)(() =>
                  TimeTop4(d4)(() => TimeTop4(d5)(() => TimeTop4(d6)(() => TimeTop4(d7)(() => TimeTop4(d8)(() => roundD)))))
                )
              )
            )
          )
        )
      )
    )

    val result: TimeResult       = roundA.other(roundB, roundC, roundD)
    val resultList: List[String] = TimeResult.count(result, 40)
    println(resultList == Sum)
    assert(resultList == Sum)
  }

}
