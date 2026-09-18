package net.scalax.simple.adt.test

import net.scalax.simple.adt.instance.AdtCoProduct.Use.{Positive => AdtPos}

trait CirceJson
    extends AdtPos[
      BigInt,
      AdtPos[BigDecimal, AdtPos[String, AdtPos[Boolean, AdtPos[List[CirceJson], AdtPos[List[(String, CirceJson)], CirceJson]]]]]
    ] {
  CoProductSelf =>

  override def _foldCoProduct[Target](
    param1: BigInt => Target,
    tail: AdtPos[
      BigDecimal,
      AdtPos[String, AdtPos[Boolean, AdtPos[List[CirceJson], AdtPos[List[(String, CirceJson)], CirceJson]]]]
    ] => Target
  ): Target = {
    val param2: BigDecimal => Target      = tail.compose(t => AdtPos.Left(t))
    val param3: String => Target          = tail.compose(t => AdtPos.Right(AdtPos.Left(t)))
    val param4: Boolean => Target         = tail.compose(t => AdtPos.Right(AdtPos.Right(AdtPos.Left(t))))
    val param5: List[CirceJson] => Target = tail.compose(t => AdtPos.Right(AdtPos.Right(AdtPos.Right(AdtPos.Left(t)))))
    val param6: List[(String, CirceJson)] => Target =
      tail.compose(t => AdtPos.Right(AdtPos.Right(AdtPos.Right(AdtPos.Right(AdtPos.Left(t))))))

    CoProductSelf.fold[Target](param1, param2, param3, param4, param5, param6)
  }

  def fold[Target](
    param1: BigInt => Target,
    param2: BigDecimal => Target,
    param3: String => Target,
    param4: Boolean => Target,
    param5: List[CirceJson] => Target,
    param6: List[(String, CirceJson)] => Target
  ): Target = CoProductSelf._foldCoProduct(
    param1,
    _._foldCoProduct(
      param2,
      _._foldCoProduct(
        param3,
        _._foldCoProduct(
          param4,
          _._foldCoProduct(param5, _._foldCoProduct(param6, _.fold[Target](param1, param2, param3, param4, param5, param6)))
        )
      )
    )
  )

}

object CirceJson {

  def fromBigInt(bigIntValue: BigInt): CirceJson = new CirceJson {
    override def fold[Target](
      param1: BigInt => Target,
      param2: BigDecimal => Target,
      param3: String => Target,
      param4: Boolean => Target,
      param5: List[CirceJson] => Target,
      param6: List[(String, CirceJson)] => Target
    ): Target = param1(bigIntValue)
  }

  def fromBigDecimal(bigDecimalValue: BigDecimal): CirceJson = new CirceJson {
    override def fold[Target](
      param1: BigInt => Target,
      param2: BigDecimal => Target,
      param3: String => Target,
      param4: Boolean => Target,
      param5: List[CirceJson] => Target,
      param6: List[(String, CirceJson)] => Target
    ): Target = param2(bigDecimalValue)
  }

  def fromString(stringValue: String): CirceJson = new CirceJson {
    override def fold[Target](
      param1: BigInt => Target,
      param2: BigDecimal => Target,
      param3: String => Target,
      param4: Boolean => Target,
      param5: List[CirceJson] => Target,
      param6: List[(String, CirceJson)] => Target
    ): Target = param3(stringValue)
  }

  def fromBoolean(booleanValue: Boolean): CirceJson = new CirceJson {
    override def fold[Target](
      param1: BigInt => Target,
      param2: BigDecimal => Target,
      param3: String => Target,
      param4: Boolean => Target,
      param5: List[CirceJson] => Target,
      param6: List[(String, CirceJson)] => Target
    ): Target = param4(booleanValue)
  }

  def fromArray(arrayValue: List[CirceJson]): CirceJson = new CirceJson {
    override def fold[Target](
      param1: BigInt => Target,
      param2: BigDecimal => Target,
      param3: String => Target,
      param4: Boolean => Target,
      param5: List[CirceJson] => Target,
      param6: List[(String, CirceJson)] => Target
    ): Target = param5(arrayValue)
  }

  def fromObject(objectValue: List[(String, CirceJson)]): CirceJson = new CirceJson {
    override def fold[Target](
      param1: BigInt => Target,
      param2: BigDecimal => Target,
      param3: String => Target,
      param4: Boolean => Target,
      param5: List[CirceJson] => Target,
      param6: List[(String, CirceJson)] => Target
    ): Target = param6(objectValue)
  }

}
