package scala.eleven

/**
 * Created by kris on 2014/8/12.
 */
object TwiceTest extends App {
  val x = Twice(43532523)
  var retParam=0
  x match {
    case Twice(x) =>retParam=x
  }
  println(retParam)
}
