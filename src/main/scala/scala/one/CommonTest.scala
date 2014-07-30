package scala.one

/**
 * Created by kris on 2014/7/30.
 */
object CommonTest {
  def main(args:Array[String]){
    val myCounter=new Counter
    myCounter.increment()
    myCounter.increment()
    myCounter.increment()
    println(myCounter.current())
  }
}
