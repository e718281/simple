package net.scalax.simple
package nat
package number67

import number67.Num67._

object `天涯-任贤齐` {

  val A: List[String] = List("昏天又暗地忍不住的流星", "烫不伤被冷藏一颗死心", "苦苦的追寻 茫茫然失去", "可爱的 可恨的 多可惜")
  val B: List[String] = List("何必想何必问何处是我家", "爱也罢 恨也罢 算了吧", "问天涯 望断了天涯", "赢得了天下 输了她")

  val Sum: List[String]    = (A ::: A ::: B ::: A ::: B) ::: (A ::: A ::: B ::: A ::: B) ::: (A ::: B ::: A ::: A ::: A ::: A)
  val subSum: List[String] = (A ::: A ::: B ::: A ::: B) ::: (A ::: A ::: B ::: A ::: B)

  def execute(): Unit = {
    val List(a1, a2, a3, a4) = A
    val List(b1, b2, b3, b4) = B

    lazy val roundA: Time3 = TimeTop3(a1)(() => TimeTop3(a2)(() => TimeTop3(a3)(() => TimeTop3(a4)(() => TimeCount3(() => roundA)))))
    lazy val roundB: Time3 = TimeDong3(() => TimeDong3(() => TimeCount3(() => TimeDong3(() => TimeCount3(() => roundB)))))
    lazy val roundC: Time3 = TimeTop3(b1)(() => TimeTop3(b2)(() => TimeTop3(b3)(() => TimeTop3(b4)(() => TimeDong3(() => roundC)))))

    val result: TimeResult       = roundB.other(roundC, roundA)
    val resultList: List[String] = TimeResult.count(result, subSum.size)
    println(resultList == subSum)
    assert(resultList == subSum)
  }

}
