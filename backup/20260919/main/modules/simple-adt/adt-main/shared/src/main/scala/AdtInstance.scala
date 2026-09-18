package net.scalax.simple.adt
package instance

trait AdtHList

object AdtHList { AdtHListSelf =>

  val zero: AdtHList = new AdtHList {
    //
  }

  trait Positive[+H, +Tail <: AdtHList] extends AdtHList {
    def head: H
    def tail: Tail
  }
  object Positive {
    def append[H1, T1 <: AdtHList](h: H1, t: T1): AdtHListSelf.Positive[H1, T1] = new AdtHListSelf.Positive[H1, T1] {
      override def head: H1 = h
      override def tail: T1 = t
    }
  }

  trait UsePositive[H1, T1 <: AdtHList] extends Positive[H1, T1]
  object UsePositive {
    def append[H1, T1 <: AdtHList](h: H1, t: T1): AdtHListSelf.UsePositive[H1, T1] = new AdtHListSelf.UsePositive[H1, T1] {
      override def head: H1 = h
      override def tail: T1 = t
    }
  }

}
