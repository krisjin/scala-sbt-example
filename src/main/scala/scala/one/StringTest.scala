package scala.one

import scala.util.Random

/**
 * Created by root on 14-8-3.
 */
object StringTest {

  def main(args: Array[String]) {
    var str = "scala"
    var num: BigInt = 12399
    var seciNum: BigDecimal = 12345
    var num$ = 6
    val num3: BigInt = 9333
    println("Hello".intersect("World"))

    println(str.toLowerCase())
    println(str.toUpperCase())
    println(str.concat(" hello!"))
    println(str.drop(1))
    println("distinct:" + str.distinct)
    println("get char:" + str(1))
    println("scala patch:" + str.patch(2, "hool", 4))
    str = num.toString
    println(str)


    println(num * num * num * num)
    println(seciNum * seciNum * seciNum * seciNum * seciNum)
    println(BigInt.probablePrime(100, Random))

    println(math.sqrt(num$))

    val reval = sum(1 to 100: _*)
    println("return value=" + reval)

  }

  def sum(num9: Int*) = {
    var result = 0
    for (num <- num9) result += num
    result
  }

}
