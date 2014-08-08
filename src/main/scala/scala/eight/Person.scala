package scala.eight

/**
 * Created by kris on 2014/8/8.
 */
class Person(name: String, age: Int) {
  val name2 = "Person Class"

  override def toString = getClass.getName + "[name=" + name2 + "]"

}
