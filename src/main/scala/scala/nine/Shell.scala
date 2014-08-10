package scala.nine

//import java.io.File

import sys.process._
/**
 * Created by kris on 2014/8/8.
 */
object Shell extends App{
  val result = "ls -la .."!
 // "ls -la .." #> new File("output.txt")!

  //"ls -la .." #>> new File("output.txt")!

  val ua = new UserAction with Logger
  ua.log("yyyyyyyyyyyyyyyy")
  println(result)
}
