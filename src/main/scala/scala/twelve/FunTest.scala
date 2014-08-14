package scala.twelve

import scala.math._

/**
 * Created by kris on 2014/8/14.
 */
object FunTest extends App {

  val num = 3.14
  val fun = ceil _
  val arrs = Array(3.14, 7.68, 45, 3).map(fun)
  val c = (x: Double) => x * 3


  println(c(2))
}
