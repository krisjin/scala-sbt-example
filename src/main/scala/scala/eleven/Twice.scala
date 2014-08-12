package scala.eleven

/**
 * Created by kris on 2014/8/12.
 */
object Twice {
  def apply(x: Int): Int = x * 2

  def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None
}


