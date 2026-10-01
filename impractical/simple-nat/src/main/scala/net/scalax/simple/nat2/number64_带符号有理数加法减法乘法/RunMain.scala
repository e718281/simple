package net.scalax.simple
package nat
package number64

import number64.Num64._

import scala.annotation.tailrec

object RunTest1 {
  def build(current1: Long, current2: Long): (Leaf.Number, BigDecimal) = {
    def buildImpl(appender: (() => Leaf.Number) => Leaf.Number, numLong: Long, zero: () => Leaf.Number): Leaf.Number = {
      if (numLong > 0) {
        appender(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: Leaf.Number = buildImpl(appender = Leaf.Successor1, numLong = current1, zero = () => build_2)
    lazy val build_2: Leaf.Number = buildImpl(appender = Leaf.Successor2, numLong = current2, zero = () => build_1)

    (build_1, BigDecimal(current1) / BigDecimal(current2))
  }

  trait CountContent { self =>
    def sum: Long
    def list: List[(Boolean, Leaf.Number, Long, Long)]
    def next: CountContent = new CountContent {
      override val sum: Long                                      = self.sum + 1
      override val list: List[(Boolean, Leaf.Number, Long, Long)] = for ((trueFalse, num, l1, l2) <- self.list) yield {
        val (nextNum, successor) = num.unsafeRun
        val (newl1, newl2)       = if (successor == Leaf.Successor1) (l1 + 1, l2) else (l1, l2 + 1)
        (trueFalse, nextNum(), newl1, newl2)
      }
    }
    def decimal: BigDecimal = {
      val listForSum = for ((i1, _, i3, i4) <- list) yield {
        val num: BigDecimal = BigDecimal(i3) / BigDecimal(i4)
        if (i1) num else -num
      }
      listForSum.sum
    }
  }
  object CountContent {
    def apply(l: List[(Boolean, Leaf.Number)]): CountContent = new CountContent {
      override def sum: Long                                      = 2
      override def list: List[(Boolean, Leaf.Number, Long, Long)] = for (u1 <- l) yield (u1._1, u1._2, 1, 1)
    }
  }

  @tailrec
  def count(content: CountContent, speed: Long, printlnSum: Int, exec: BigDecimal => Unit): Unit = {
    val needPrintln: Boolean = content.sum % speed == 0
    val printSum: Int        = if (needPrintln) {
      exec(content.decimal): Unit
      printlnSum - 1
    } else printlnSum

    if (printlnSum > 0) {
      count(content.next, printlnSum = printSum, speed = speed, exec = exec)
    }
  }

  def main(arr: Array[String]): Unit = {
    def NodeOne(value: (Leaf.Number, BigDecimal)): Node.Number = Node.One(value._1, value._2)

    val num1: Node.Number = Node.Successor(
      Node.Successor(
        Node.Successor(
          Node.Successor(Node.Successor(NodeOne(build(23, 25)), NodeOne(build(5, 72))), NodeOne(build(3, 12))),
          NodeOne(build(10, 12))
        ),
        NodeOne(build(23, 22))
      ),
      Node.Successor(NodeOne(build(23, 4)), Node.Successor(NodeOne(build(12, 50)), NodeOne(build(2, 16))))
    )

    val result1: BigDecimal = num1.except
    count(
      CountContent(num1.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result1: $result1, auctal: $decimal")
      }
    )

    val num2: Node.Number = Node.Successor(
      Node.Zero,
      Node.Successor(
        Node.Successor(NodeOne(build(22, 33)._1, build(22, 33)._2), NodeOne(build(12, 15)._1, build(12, 15)._2)),
        NodeOne(build(12, 2)._1, build(12, 2)._2)
      )
    )
    val result2: BigDecimal = num2.except
    count(
      CountContent(num2.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result2: $result2, auctal: $decimal")
      }
    )

    val num3: Node.Number   = num1.minus(num2)
    val result3: BigDecimal = result1 - result2
    count(
      CountContent(num3.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result3: $result3, auctal: $decimal")
      }
    )

    val num4: Node.Number   = num1.multiply(num3)
    val result4: BigDecimal = result1 * result3
    count(
      CountContent(num4.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result4: $result4, auctal: $decimal")
      }
    )

    val num5: Node.Number   = num2.plus(num3)
    val result5: BigDecimal = result2 + result3
    count(
      CountContent(num5.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result5: $result5, auctal: $decimal")
      }
    )

    val num6: Node.Number   = num5.multiply(num3).multiply(num1.minus(num2)).plus(num1)
    val result6: BigDecimal = result5 * result3 * (result1 - result2) + result1
    count(
      CountContent(num6.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result6: $result6, auctal: $decimal")
      }
    )

    val num7: Node.Number   = num3.divideLeaf(build(7, 22)._1, build(7, 22)._2)
    val result7: BigDecimal = result3 / build(7, 22)._2
    count(
      CountContent(num7.unsafeRun),
      speed = 20000,
      printlnSum = 5,
      exec = decimal => {
        println(s"result5: $result7, auctal: $decimal")
      }
    )

  }

}
