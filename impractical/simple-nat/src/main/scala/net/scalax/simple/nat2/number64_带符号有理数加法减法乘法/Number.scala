package net.scalax.simple
package nat
package number64

object Num64 { NumSelf =>

  object Node {
    trait Number {
      def minus(other: Node.Number): Node.Number
      def multiply(other: Node.Number): Node.Number
      def plus(other: Node.Number): Node.Number = this.minus(Zero.minus(other))
      def inputLeaf(l1: Leaf.Number, inputDecimal: BigDecimal): Node.Number

      def unsafeRun: List[(Boolean, Leaf.Number)]
      def except: BigDecimal
    }

    val Successor: (Node.Number, Node.Number) => Node.Number = (value1, value2) =>
      new Number {
        override def minus(other: Node.Number): Node.Number    = Successor(Successor(value1, value2), other)
        override def multiply(other: Node.Number): Node.Number = Successor(value1.multiply(other), value2.multiply(other))
        override def inputLeaf(l1: Leaf.Number, inputDecimal: BigDecimal): Node.Number =
          Successor(value1.inputLeaf(l1, inputDecimal), value2.inputLeaf(l1, inputDecimal))

        override def unsafeRun: List[(Boolean, Leaf.Number)] = value1.unsafeRun ::: (for (v2 <- value2.unsafeRun) yield (!v2._1, v2._2))
        override def except: BigDecimal                      = value1.except - value2.except
      }

    val One: (Leaf.Number, BigDecimal) => Node.Number = (leaf, bigDecimal) =>
      new Node.Number {
        override def minus(other: Node.Number): Node.Number                            = Successor(One(leaf, bigDecimal), other)
        override def multiply(other: Node.Number): Node.Number                         = other.inputLeaf(leaf, bigDecimal)
        override def inputLeaf(l1: Leaf.Number, inputDecimal: BigDecimal): Node.Number = One(leaf.乘以(l1), bigDecimal * inputDecimal)

        override def unsafeRun: List[(Boolean, Leaf.Number)] = List((true, leaf))
        override def except: BigDecimal                      = bigDecimal
      }

    val Zero: Node.Number = Successor(Node.One(Leaf.One, BigDecimal(1)), Node.One(Leaf.One, BigDecimal(1)))
  }

  object Leaf {
    trait Number {
      def divide(
        other: Leaf.Number,
        appender1: (() => Leaf.Number) => Leaf.Number,
        appender2: (() => Leaf.Number) => Leaf.Number
      ): Leaf.Number

      def 除以(other: Leaf.Number): Leaf.Number = divide(other, Successor2, Successor1)
      def 乘以(other: Leaf.Number): Leaf.Number = 除以(One.除以(other))
      def unsafeRun: (() => Leaf.Number, (() => Leaf.Number) => Leaf.Number)
    }

    val Successor1: (() => Leaf.Number) => Leaf.Number = tail =>
      new Number {
        override def divide(
          other: Leaf.Number,
          appender1: (() => Leaf.Number) => Leaf.Number,
          appender2: (() => Leaf.Number) => Leaf.Number
        ): Leaf.Number =
          other.divide(tail(), appender2, appender1)
        override def unsafeRun: (() => Leaf.Number, (() => Leaf.Number) => Leaf.Number) = (tail, Successor1)
      }

    val Successor2: (() => Leaf.Number) => Leaf.Number = tail =>
      new Number {
        override def divide(
          other: Leaf.Number,
          appender1: (() => Leaf.Number) => Leaf.Number,
          appender2: (() => Leaf.Number) => Leaf.Number
        ): Leaf.Number =
          appender1(() => tail().divide(other, appender1, appender2))
        override def unsafeRun: (() => Leaf.Number, (() => Leaf.Number) => Leaf.Number) = (tail, Successor2)
      }

    val One: Leaf.Number = Successor1(() => Successor2(() => One))
  }

}
