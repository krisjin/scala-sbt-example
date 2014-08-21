package scala.thirteen

import scala.collection.mutable.Map


/**
 * Created by kris on 2014/8/15.
 */
object CollectionTest extends App {
  val setA = Set("name", "sex", "age", "address")
  val mapA = Map("name" -> "kris", "sex" -> "男", "age" -> 28, "address" -> "朝阳区")
  mapA += ("hha" -> "hei")
  //  val sortMapA = SortedMap()

  val digits = List(4, 2)
  val newsDigits = 23 :: List(44, 33)

  def sum(lst: List[Int]): Int = if (lst == Nil) 0 else lst.head + sum(lst.tail)

  def sum2(lst: List[Int]): Int = lst match {
    case Nil => 0
    case h :: t => h + sum2(t)
  }

  val tmpList = List(8, 23, 4).sum

  val mlst = scala.collection.mutable.LinkedList(34,2121,-33)
  var cur = mlst
  while(cur != Nil){
    if(cur.elem < 0)cur.elem = 0
    cur = cur.next
  }

  println(mlst.elem)

}
