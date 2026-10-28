package net.scalax.simple
package nat
package number68

import number68.Num68._

object RunTest1 {

  def main1(arr: Array[String]): Unit = {

    val listInput: Seq[(Int, Int, Int, Int, Int)] = for {
      s1 <- 1 to 5
      b1 <- 1 to 2
      s2 <- 1 to 5
      b2 <- 1 to 2
      c1 <- 1 to 6
    } yield (s1, b1, s2, b2, c1)

    def listInput2: Seq[(Int, Int, Int, Int, Int, Boolean)] = Vector((1, 2, 4, 2, 1, true), (1, 2, 5, 2, 2, true))
    def listInput3: Seq[(Int, Int, Int, Int, Int)]          = listInput2.map(t => (t._1, t._2, t._3, t._4, t._5))

    val l: Seq[(Int, Int, Int, Int, Int, Boolean)] = for ((s1, b1, s2, b2, c1) <- listInput3) yield {
      val ctx: Ctx = new Ctx(succ1 = s1, body1 = b1, succ2 = s2, body2 = b2)

      val num1: Number        = ctx.build(13, 1)
      val result1: BigDecimal = BigDecimal(13) / BigDecimal(1)
      def count1: BigDecimal  = ctx.count(num1, 1000000)

      val num2: Number        = ctx.build(5, 1)
      val result2: BigDecimal = BigDecimal(5) / BigDecimal(1)
      def count2: BigDecimal  = ctx.count(num2, 1000000)

      val result3: BigDecimal = (result1 - result2).abs
      println(s"===($s1,$b1,$s2,$b2,$c1)===")

      val (succ1, succ2) = c1 match {
        case 1 => (ctx.Successor1, ctx.Successor2)
        case 2 => (ctx.Successor2, ctx.Successor1)
        case 3 => (ctx.Successor1, Successor3)
        case 4 => (Successor3, ctx.Successor1)
        case 5 => (ctx.Successor2, Successor3)
        case 6 => (Successor3, ctx.Successor2)
      }

      val num3: Option[Number] = try {
        Some(num1.pingfang(num2, succ1, succ2))
      } catch {
        case _: StackOverflowError => None
      }

      val count3: Option[BigDecimal] = for (num <- num3) yield ctx.count(num, 10000000)
      println(result3)
      println(count3)

      val confirm1: Option[Boolean] = for (c <- count3) yield (c - result3).abs < BigDecimal("0.01")

      (s1, b1, s2, b2, c1, confirm1.getOrElse(false))
    }

    println(l.filter(_._6))

  }

}
