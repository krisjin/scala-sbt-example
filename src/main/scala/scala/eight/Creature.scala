package scala.eight

/**
 * Created by kris on 2014/8/8.
 */
class Creature {
  println("父类被调用")
  val range: Int = 10
  println("父类中rang变量值为：" + range)
  val env: Array[Int] = new Array[Int](range)
  println("父类中rang变量值为：" + range)

}
