package scala.twelve

import scala.math._

/**
 * Created by kris on 2014/8/14.
 */
object FunTest extends App {

  val num = 3.14
  val fun = ceil _
  val arrs = Array(3.14, 7.68, 45, 3).map(fun)
  val fc = (x: Double) => x * 3
  //def fc(x: Double) = 3 * x

  val arrs2 = Array(1.23, 2.34, 7.56).map((x: Double) => x * 2)

  println(arrs2.mkString(" "))
}
