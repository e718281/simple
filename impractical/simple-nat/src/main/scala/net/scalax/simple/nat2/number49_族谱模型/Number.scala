package net.scalax.simple
package nat
package number49

object Number49 {

  case class In(in: () => In, out: () => Out, var name: Option[String]) {
    override def toString: String = name.fold("InZero")(getName => s"In(in = ${in()}, out = ${out()}, $getName)")
  }
  case class Out(in: () => In, out: () => Out, var name: Option[String]) {
    override def toString: String = name.fold("OutZero")(getName => s"Out(in = ${in()}, out = ${out()}, $getName)")
  }

  def InZero: In = {
    lazy val inIns: In   = InZero
    lazy val outIns: Out = OutZero
    In(in = () => inIns, out = () => outIns, name = Option.empty)
  }
  def OutZero: Out = {
    lazy val inIns: In   = InZero
    lazy val outIns: Out = OutZero
    Out(in = () => inIns, out = () => outIns, name = Option.empty)
  }

}
