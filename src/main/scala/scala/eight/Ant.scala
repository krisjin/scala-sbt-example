package scala.eight

/**
 * Created by kris on 2014/8/8.
 */
class Ant extends {
  override val range = 2
} with Creature {
  println("子类被调用")

  def this(msg: String) {
    this()

  }
}
