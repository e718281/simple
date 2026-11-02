package net.scalax.simple
package nat
package number60

object Num60 {

  trait ThreeOut {
    lazy val _1: Three = new Three {}
    lazy val _2: Three = new Three {}
  }

  trait Three {
    var value: Any     = null
    lazy val _0: Three = new Three {}
    lazy val _1: Three = new Three {}
    lazy val _2: Three = new Three {}
  }

}
