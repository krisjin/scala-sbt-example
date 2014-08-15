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
  val fun2 = 3 * (_: Double)
  val fun3: (Double) => Double = 2 * _

  (1 to 9).map(2 * _).foreach(println _)
  val fun4 = (1 to 5).reduceLeft(_ * _)
  val arrs4 = (1 to 9).filter(_ % 2 == 0)
  val arrs5 = "what are you doing".split(" ").sortWith(_.length < _.length)

  def mulBy(factor: Double) = (x: Double, y: Double) => factor * x * y

  val triple = mulBy(3)
  val half = mulBy(2)

  def cal(x: Int, y: Int) = x * y

  //def mulSameTime(x: Int) = (y: Int) => x * y
  def mulSameTime(x: Int)(y: Int) = x * y


  println(mulSameTime(4)(5))

}
