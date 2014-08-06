package scala.four

/**
 * Created by kris on 2014/8/6.
 */
object TupleTest {
  def main(args: Array[String]) {
    val t = ("krisjin", 28, "china")
    val (name, age, coutry) = t
    val (_, _, address) = t
    val fun = "Hello World".partition(_.isUpper)
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 5, 2)
    val pairs = symbols.zip(counts)
    val keys = Array("name", "age", "favorite")
    val values = Array("krisjin", 28, "football")
    val map = keys.zip(values).toMap
    println(t _1)
    println(t._1)
    println("name:" + name)
    println("address:" + address)
    println(fun)
    println(pairs.mkString)

    for ((k, v) <- pairs) Console.print(k * v)
    println()
    for ((k, v) <- map) println(k + ":" + v)
  }
}
