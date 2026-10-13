package net.scalax.simple
package nat
package number66

import scala.annotation.tailrec
import number66.Num66._

object RunTest1 {
  def build(current1: Long, appender: (() => Number) => Number, zero: () => Number): Number = {
    if (current1 > 0) {
      appender(() => build(current1 - 1, appender, zero))
    } else {
      zero()
    }
  }

  case class RedYellowConfirm(路灯1: Boolean, 人行道1: Boolean, 路灯2: Boolean, 人行道2: Boolean)

  @tailrec
  def count(
    num1: RedYellow,
    currentCount: Long,
    speed: Long,
    printlnSum: Int
  ): Unit = {
    val needPrintln: Boolean = currentCount % speed == 0
    val newPrintlnSum: Int   = if (needPrintln) {
      println(s"${currentCount}秒，红绿灯约束判定仍然成功")
      printlnSum - 1
    } else printlnSum

    val RedYellow(l, tail) = num1
    assert(l.size == 4)
    val map: Map[String, Boolean]      = l.toMap
    val confirmModel: RedYellowConfirm = RedYellowConfirm(路灯1 = map("路灯1"), 人行道1 = map("人行道1"), 路灯2 = map("路灯2"), 人行道2 = map("人行道2"))
    assert(confirmModel.路灯1 == !confirmModel.人行道1)
    assert(confirmModel.路灯2 == !confirmModel.人行道2)
    assert(confirmModel.路灯1 == !confirmModel.路灯2)

    if (newPrintlnSum > 0) {
      count(tail(), currentCount = currentCount + 1, speed = speed, printlnSum = newPrintlnSum)
    }
  }

  def main(arr: Array[String]): Unit = {
    lazy val 路灯1_1: Number = build(20, appender = oneSecond("路灯1", true), zero = () => 路灯1_2)
    lazy val 路灯1_2: Number = build(40, appender = oneSecond("路灯1", false), zero = () => 路灯1_1)

    lazy val 人行道1_1: Number = build(20, appender = oneSecond("人行道1", false), zero = () => 人行道1_2)
    lazy val 人行道1_2: Number = build(40, appender = oneSecond("人行道1", true), zero = () => 人行道1_1)

    lazy val 路灯2_1: Number = build(20, appender = oneSecond("路灯2", false), zero = () => 路灯2_2)
    lazy val 路灯2_2: Number = build(40, appender = oneSecond("路灯2", true), zero = () => 路灯2_1)

    lazy val 人行道2_1: Number = build(20, appender = oneSecond("人行道2", true), zero = () => 人行道2_2)
    lazy val 人行道2_2: Number = build(40, appender = oneSecond("人行道2", false), zero = () => 人行道2_1)

    count(路灯1_1.other(人行道1_1, 路灯2_1, 人行道2_1, click), 0, 1000000, 5)
  }

}
