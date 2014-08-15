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
  println(mapA)
}
