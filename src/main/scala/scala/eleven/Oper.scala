package scala.eleven

import scala.collection.mutable

/**
 * Created by kris on 2014/8/11.
 */
object Oper extends App {
  val nums = 1 :: 2 :: 3 :: 4 :: Nil
  for (i <- nums) println(i)

  val scores = new mutable.HashMap[String, Int]()
  scores("kris") = 100
  scores.update("will", 100)

  for ((k, v) <- scores) println(k + ":" + v)
  println(scores("kris"))

  val app = ApplyTest("kris", "28")
}
