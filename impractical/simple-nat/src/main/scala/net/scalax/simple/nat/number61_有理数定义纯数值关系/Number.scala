package net.scalax.simple
package nat
package number61

object Num61 {

  case class 有理数(分母1: Long, 分母2: Long, 分子1: Long, 分子2: Long) {
    assert(分母1 > 0)
    assert(分母2 > 0)
    assert(分子1 > 0)
    assert(分子2 > 0)

    def value: BigDecimal  = (BigDecimal(分子1) - BigDecimal(分子2)) / (BigDecimal(分母1) - BigDecimal(分母2))
    def 加(other: 有理数): 有理数 =
      有理数(
        分母1 = this.分母1 * other.分母1 + this.分母2 * other.分母2,
        分母2 = this.分母1 * other.分母2 + this.分母2 * other.分母1,
        分子1 = this.分子1 * other.分母1 + this.分子2 * other.分母2 + this.分母1 * other.分子1 + this.分母2 * other.分子2,
        分子2 = this.分子1 * other.分母2 + this.分子2 * other.分母1 + this.分母2 * other.分子1 + this.分母1 * other.分子2
      )
    def 乘以(other: 有理数): 有理数 =
      有理数(
        分母1 = this.分母1 * other.分母1 + this.分母2 * other.分母2,
        分母2 = this.分母1 * other.分母2 + this.分母2 * other.分母1,
        分子1 = this.分子1 * other.分子1 + this.分子2 * other.分子2,
        分子2 = this.分子1 * other.分子2 + this.分子2 * other.分子1
      )
  }

  case class 有理数2(分母: Long, 分子1: Long, 分子2: Long) {
    assert(分母 > 0)
    assert(分子1 > 0)
    assert(分子2 > 0)

    def value: BigDecimal    = (BigDecimal(分子1) - BigDecimal(分子2)) / BigDecimal(分母)
    def 加(other: 有理数2): 有理数2 =
      有理数2(
        分母 = this.分母 * other.分母,
        分子1 = this.分子1 * other.分母 + this.分母 * other.分子1,
        分子2 = this.分子2 * other.分母 + this.分母 * other.分子2
      )
  }

}
