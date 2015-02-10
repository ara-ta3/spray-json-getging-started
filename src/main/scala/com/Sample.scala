package com

import spray.json._

object Sample extends App with DefaultJsonProtocol {

  val hoge:List[List[String]] = List(
    List("hoge", "fuga"),
    List("piyo", "fuga")
  )

  println(hoge.toJson)
}


