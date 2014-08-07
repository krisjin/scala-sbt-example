package scala.six

/**
 * Created by kris on 2014/8/7.
 */
object Hello extends App {
  if (args.length > 0) println("Hello" + args(0))
  else
    println("Hello Scala!")
}
