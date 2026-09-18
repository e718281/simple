package net.scalax.simple
package nat
package number60

object Num60 {

  trait Add {
    type add[Item] <: Add
    def add[Item](item: Item): add[Item]
  }
  trait Upper {
    type createRight[T <: Down] <: Upper
    type keep[T <: Down] <: Upper
    def createRight[T <: Down](t: T): createRight[T]
    def keep[T <: Down](t: T): keep[T]
  }
  trait Down {
    type toDown[T <: Upper, Item] <: Add
    def toDown[T <: Upper, Item](t: T, item: Item): toDown[T, Item]
  }

  object 零 extends Add {
    override type add[Item] = 一[Item]
    override def add[Item](item: Item): 一[Item] = 一(item)
  }
  case class 一[I1](_1: I1) extends Add {
    override type add[Item] = 二[I1, Item]
    override def add[Item](item: Item): 二[I1, Item] = 二(_1, item)
  }
  case class 二[I1, I2](_1: I1, _2: I2) extends Add {
    override type add[Item] = 上一[下一[I1, I2], 下零[Item]]
    override def add[Item](item: Item): 上一[下一[I1, I2], 下零[Item]] = 上一(下一(_1, _2), 下零(item))
  }
  case class 上一[T0 <: Down, T1 <: Down](_0: T0, _1: T1) extends Upper with Add {
    override type createRight[T <: Down] = 上二[T0, T1, T]
    override type keep[T <: Down]        = 上一[T0, T]
    override def createRight[T <: Down](t: T): 上二[T0, T1, T] = 上二(_0, _1, t)
    override def keep[T <: Down](t: T): 上一[T0, T]            = 上一(_0, t)
    override type add[Item] = T1#toDown[上一[T0, T1], Item]
    override def add[Item](item: Item): T1#toDown[上一[T0, T1], Item] = _1.toDown(this, item)
  }
  case class 上二[T0 <: Down, T1 <: Down, T2 <: Down](_0: T0, _1: T1, _2: T2) extends Upper with Add {
    override type createRight[T <: Down] = 上一[中二[T0, T1, T2], T]
    override type keep[T <: Down]        = 上二[T0, T1, T]
    override def createRight[T <: Down](t: T): 上一[中二[T0, T1, T2], T] = 上一(中二(_0, _1, _2), t)
    override def keep[T <: Down](t: T): 上二[T0, T1, T]                = 上二(_0, _1, t)
    override type add[Item] = T2#toDown[上二[T0, T1, T2], Item]
    override def add[Item](item: Item): T2#toDown[上二[T0, T1, T2], Item] = _2.toDown(this, item)
  }
  case class 中零[T0 <: Down](_0: T0) extends Upper with Down {
    override type createRight[T <: Down] = 中一[T0, T]
    override type keep[T <: Down]        = 中零[T]
    override def createRight[T <: Down](t: T): 中一[T0, T] = 中一(_0, t)
    override def keep[T <: Down](t: T): 中零[T]            = 中零(t)
    override type toDown[T <: Upper, Item] = T0#toDown[T, Item]
    override def toDown[T <: Upper, Item](t: T, item: Item): T0#toDown[T, Item] = _0.toDown(t, item)
  }
  case class 中一[T0 <: Down, T1 <: Down](_0: T0, _1: T1) extends Upper with Down {
    override type createRight[T <: Down] = 中二[T0, T1, T]
    override type keep[T <: Down]        = 中一[T0, T]
    override def createRight[T <: Down](t: T): 中二[T0, T1, T] = 中二(_0, _1, t)
    override def keep[T <: Down](t: T): 中一[T0, T]            = 中一(_0, t)
    override type toDown[T <: Upper, Item] = T1#toDown[T, Item]
    override def toDown[T <: Upper, Item](t: T, item: Item): T1#toDown[T, Item] = _1.toDown(t, item)
  }
  case class 中二[T0 <: Down, T1 <: Down, T2 <: Down](_0: T0, _1: T1, _2: T2) extends Upper with Down {
    override type createRight[T <: Down] = 中二[T0, T1, T] // TODO
    override type keep[T <: Down]        = 中二[T0, T1, T]
    override def createRight[T <: Down](t: T): 中二[T0, T1, T] = 中二(_0, _1, t)
    override def keep[T <: Down](t: T): 中二[T0, T1, T]        = 中二(_0, _1, t)
    override type toDown[T <: Upper, Item] = T2#toDown[T, Item]
    override def toDown[T <: Upper, Item](t: T, item: Item): T2#toDown[T, Item] = _2.toDown(t, item)
  }
  case class 下零[T0](_0: T0) extends Down {
    override type toDown[T <: Upper, Item] = T#keep[下一[T0, Item]]
    override def toDown[T <: Upper, Item](t: T, item: Item): T#keep[下一[T0, Item]] = t.keep(下一(_0, item))
  }
  case class 下一[T0, T1](_0: T0, _1: T1) extends Down {
    override type toDown[T <: Upper, Item] = T#keep[下二[T0, T1, Item]]
    override def toDown[T <: Upper, Item](t: T, item: Item): T#keep[下二[T0, T1, Item]] = t.keep(下二(_0, _1, item))
  }
  case class 下二[T0, T1, T2](_0: T0, _1: T1, _2: T2) extends Down {
    override type toDown[T <: Upper, Item] = T#createRight[下零[Item]]
    override def toDown[T <: Upper, Item](t: T, item: Item): T#createRight[下零[Item]] = t.createRight(下零(item))
  }

}
