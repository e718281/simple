package net.scalax.simple
package nat
package number50

import ghdmzsk._

object Num50 { NumSelf =>

  trait Num1 {
    def pre1: ghdmzsk
  }

  trait Num2 {
    def pre2: ghdmzsk
  }

  object Append1 {
    val tail1Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail1: () => ghdmzsk): ghdmzsk = new ghdmzsk with NumSelf.Num1 {
        override def pre1: ghdmzsk                               = tail1()
        override def inputGHDMZSK(tail2: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(appender1: () => ghdmzsk): ghdmzsk = new ghdmzsk {
            override def inputGHDMZSK(appender2: () => ghdmzsk): ghdmzsk =
              appender1().inputGHDMZSK(() => tail1().inputGHDMZSK(tail2).inputGHDMZSK(appender1).inputGHDMZSK(appender2))
          }
        }
      }
    }

    val tail2Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail1: () => ghdmzsk): ghdmzsk = new ghdmzsk with NumSelf.Num2 {
        override def pre2: ghdmzsk                               = tail1()
        override def inputGHDMZSK(tail2: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(appender1: () => ghdmzsk): ghdmzsk = new ghdmzsk {
            override def inputGHDMZSK(appender2: () => ghdmzsk): ghdmzsk =
              tail2().inputGHDMZSK(tail1).inputGHDMZSK(appender2).inputGHDMZSK(appender1)
          }
        }
      }
    }
  }

}
