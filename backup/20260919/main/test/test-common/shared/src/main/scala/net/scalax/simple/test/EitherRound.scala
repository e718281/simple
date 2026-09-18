package net.scalax.simple
package test

class TailSame[T](val head: T, val tail: () => TailSame[T]) {
  def liftToLeft[R1]: LiftLeftMid[T, R1] =
    new LiftLeftMid[T, R1](tail = () => new LiftLeft(left = head, tail = () => tail().liftToLeft[R1]))
  def liftToRight[R1]: LiftRightMid[R1, T] =
    new LiftRightMid[R1, T](tail = () => new LiftRight[R1, T](right = head, tail = () => tail().liftToRight[R1]))
}

class LeftRound[L, R](val left: L, val tail: () => RightRound[L, R])
class RightRound[L, R](val right: R, val tail: () => LeftRound[L, R])

class LiftLeft[L, R](val left: L, val tail: () => LiftLeftMid[L, R]) {
  def other1(r: LiftRight[L, R]): LeftRound[L, R] = new LeftRound[L, R](left = left, tail = () => tail().other2(r))
}
class LiftLeftMid[L, R](val tail: () => LiftLeft[L, R]) {
  def other2(r: LiftRight[L, R]): RightRound[L, R] = r.other3(tail())
}

class LiftRight[L, R](val right: R, val tail: () => LiftRightMid[L, R]) {
  def other3(r: LiftLeft[L, R]): RightRound[L, R] = new RightRound[L, R](right = right, tail = () => tail().other4(r))
}
class LiftRightMid[L, R](val tail: () => LiftRight[L, R]) {
  def other4(r: LiftLeft[L, R]): LeftRound[L, R] = r.other1(tail())
}
