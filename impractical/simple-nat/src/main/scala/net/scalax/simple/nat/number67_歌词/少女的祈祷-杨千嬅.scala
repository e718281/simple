package net.scalax.simple
package nat
package number67

import number67.Num67._

object `少女的祈祷-杨千嬅` {

  val A: List[String] = List("沿途与他车厢中私奔般恋爱", "再挤逼都不放开", "祈求在路上没任何的阻碍", "令愉快旅程变悲哀")
  val B: List[String] = List("祈求天地放过一双恋人")
  val C: List[String] = List("怕发生的永远别发生", "从来未顺利遇上好景降临", "如何能重拾信心")
  val D: List[String] = List("赐我他的吻", "如怜悯罪人", "我爱主", "同时亦爱一位世人", "祈求沿途未变心", "请给我护荫")
  val E: List[String] = List("为了他", "不懂祷告", "都敢祷告", "谁愿眷顾", "这种信徒", "用两手遮掩双眼专心倾诉", "宁愿答案", "望不到")

  val Sum: List[String]    = (A ::: B ::: C ::: B ::: D ::: E) ::: (A ::: B ::: C ::: B ::: D ::: E) ::: (B ::: D)
  val subSum: List[String] = (A ::: B ::: C ::: B ::: D ::: E) ::: (A ::: B ::: C ::: B ::: D ::: E)

  def execute(): Unit = {
    val List(a1, a2, a3, a4)                 = A
    val List(b1)                             = B
    val List(c1, c2, c3)                     = C
    val List(d1, d2, d3, d4, d5, d6)         = D
    val List(e1, e2, e3, e4, e5, e6, e7, e8) = E

    lazy val roundA: Time5 =
      TimeTop5(a1)(() =>
        TimeTop5(a2)(() => TimeTop5(a3)(() => TimeTop5(a4)(() => TimeCount5(() => TimeCount5(() => TimeDong5(() => roundA))))))
      )
    lazy val roundB: Time5 = TimeTop5(b1)(() => TimeCount5(() => TimeDong5(() => roundB)))
    lazy val roundC: Time5 =
      TimeTop5(c1)(() => TimeTop5(c2)(() => TimeTop5(c3)(() => TimeDong5(() => TimeCount5(() => TimeDong5(() => roundC))))))
    lazy val roundD: Time5 =
      TimeTop5(d1)(() =>
        TimeTop5(d2)(() => TimeTop5(d3)(() => TimeTop5(d4)(() => TimeTop5(d5)(() => TimeTop5(d6)(() => TimeDong5(() => roundD))))))
      )
    lazy val roundE: Time5 =
      TimeTop5(e1)(() =>
        TimeTop5(e2)(() =>
          TimeTop5(e3)(() =>
            TimeTop5(e4)(() => TimeTop5(e5)(() => TimeTop5(e6)(() => TimeTop5(e7)(() => TimeTop5(e8)(() => TimeCount5(() => roundE))))))
          )
        )
      )

    val result: TimeResult       = roundA.other(roundB, roundC, roundD, roundE)
    val resultList: List[String] = TimeResult.count(result, subSum.size)
    println(resultList == subSum)
    assert(resultList == subSum)
  }

}
