package net.scalax.simple
package nat
package number44

import ghdmzsk._

object Num44 { Num44Self =>

  trait Num1 {
    def pre1: ghdmzsk
  }

  trait Num2 {
    def pre2: ghdmzsk
  }

  trait Num3 {
    def pre3: ghdmzsk
  }

  trait Num4 {
    def pre4: ghdmzsk
  }

  object Append1 {
    val tail1Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num44Self.Num1 {
        override def pre1: ghdmzsk                                = tail()
        override def inputGHDMZSK(inject: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(other: () => ghdmzsk): ghdmzsk =
            tail1Num.inputGHDMZSK(() => tail().inputGHDMZSK(inject).inputGHDMZSK(other))
        }
      }
    }

    val tail2Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num44Self.Num2 {
        override def pre2: ghdmzsk                                = tail()
        override def inputGHDMZSK(inject: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(other: () => ghdmzsk): ghdmzsk =
            tail2Num.inputGHDMZSK(() => other().inputGHDMZSK(() => tail().inputGHDMZSK(inject)))
        }
      }
    }

    val tail3Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num44Self.Num3 {
        override def pre3: ghdmzsk                                = tail()
        override def inputGHDMZSK(inject: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(other: () => ghdmzsk): ghdmzsk =
            inject().inputGHDMZSK(() => tail().inputGHDMZSK(inject).inputGHDMZSK(other))
        }
      }
    }

    val tail4Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num44Self.Num4 {
        override def pre4: ghdmzsk                                = tail()
        override def inputGHDMZSK(inject: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(other: () => ghdmzsk): ghdmzsk = other().inputGHDMZSK(() => tail().inputGHDMZSK(inject))
        }
      }
    }
  }

}
