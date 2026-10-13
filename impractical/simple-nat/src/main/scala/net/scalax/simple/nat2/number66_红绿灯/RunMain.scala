package net.scalax.simple
package nat
package number66

import scala.annotation.tailrec
import number66.Num66._

object RunTest1 {
  def build(current: Long, name: String, color: Color, zero: () => Number): Number = {
    if (current > 0) {
      oneSecond(name, color, current)(() => build(current - 1, name, color, zero))
    } else {
      zero()
    }
  }

  case class RedYellowConfirm(路灯1: (Color, Long), 人行道1: (Color, Long), 路灯2: (Color, Long), 人行道2: (Color, Long)) {
    override def toString: String =
      s"路灯1: ${路灯1._1}${路灯1._2}秒，人行道1: ${人行道1._1}${人行道1._2}秒，路灯2: ${路灯2._1}${路灯2._2}秒，人行道2: ${人行道2._1}${人行道2._2}秒"
  }

  @tailrec
  def count(
    num1: RedYellow,
    printlnSum: Long
  ): Unit = {
    val RedYellow(l, tail) = num1
    assert(l.size == 4)
    val map: Map[String, (Color, Long)] = l.toMap
    val confirmModel: RedYellowConfirm  = RedYellowConfirm(路灯1 = map("路灯1"), 人行道1 = map("人行道1"), 路灯2 = map("路灯2"), 人行道2 = map("人行道2"))
    assert(confirmModel.路灯1._1 match {
      case Red    => confirmModel.人行道1._1 == Green
      case Yellow => confirmModel.人行道1._1 == Red
      case Green  => confirmModel.人行道1._1 == Red
    })
    assert(confirmModel.路灯2._1 match {
      case Red    => confirmModel.人行道2._1 == Green
      case Yellow => confirmModel.人行道2._1 == Red
      case Green  => confirmModel.人行道2._1 == Red
    })
    assert(confirmModel.路灯1._1 match {
      case Red    => confirmModel.路灯2._1 == Green || confirmModel.路灯2._1 == Yellow
      case Yellow => confirmModel.路灯2._1 == Red
      case Green  => confirmModel.路灯2._1 == Red
    })
    assert(confirmModel.路灯2._1 match {
      case Red    => confirmModel.路灯1._1 == Green || confirmModel.路灯1._1 == Yellow
      case Yellow => confirmModel.路灯1._1 == Red
      case Green  => confirmModel.路灯1._1 == Red
    })

    println(s"$confirmModel，assert成功")

    if (printlnSum > 0) {
      count(tail(), printlnSum = printlnSum - 1)
    }
  }

  def main(arr: Array[String]): Unit = {
    lazy val 路灯1_1: Number = build(17, "路灯1", Green, zero = () => 路灯1_2)
    lazy val 路灯1_2: Number = build(3, "路灯1", Yellow, zero = () => 路灯1_3)
    lazy val 路灯1_3: Number = build(40, "路灯1", Red, zero = () => 路灯1_1)

    lazy val 人行道1_1: Number = build(20, "人行道1", Red, zero = () => 人行道1_2)
    lazy val 人行道1_2: Number = build(40, "人行道1", Green, zero = () => 人行道1_1)

    lazy val 路灯2_1: Number = build(20, "路灯2", Red, zero = () => 路灯2_2)
    lazy val 路灯2_2: Number = build(37, "路灯2", Green, zero = () => 路灯2_3)
    lazy val 路灯2_3: Number = build(3, "路灯2", Yellow, zero = () => 路灯2_1)

    lazy val 人行道2_1: Number = build(20, "人行道2", Green, zero = () => 人行道2_2)
    lazy val 人行道2_2: Number = build(40, "人行道2", Red, zero = () => 人行道2_1)

    count(路灯1_1.other(人行道1_1, 路灯2_1, 人行道2_1, click), 500)
  }

}
