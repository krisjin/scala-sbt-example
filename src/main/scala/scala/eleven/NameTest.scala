package scala.eleven

/**
 * Created by kris on 2014/8/12.
 */
object NameTest extends App {
  val author = "krisjin shi"
  val Name(firstName, lastName) = author
  println(firstName + "::" + lastName)

}
