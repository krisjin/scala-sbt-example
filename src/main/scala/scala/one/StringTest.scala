package scala.one

import scala.util.Random

/**
 * Created by root on 14-8-3.
 */
object StringTest {

  def main(args: Array[String]) {

    var str = "scala";
    val num: BigInt = 12399;
    val decimalNum: BigDecimal = 12345;
    val num$ = 6

    //intersect方法输出两个字符串共同的一组字符
    val retVal = "Hello".intersect("World");
    println(retVal);

    //toLowerCase 输出小写形式
    println(str.toLowerCase());

    //toUpperCase 输出大写形式
    println(str.toUpperCase());

    //concat 字符串连接
    println(str.concat(" hello!"))
    println(str.drop(1))
    println("distinct:" + str.distinct)
    println("get char:" + str(1))
    println("scala patch:" + str.patch(2, "hool", 4))
    str = num.toString
    println(str)


    println(num * num * num * num)
    println(decimalNum * decimalNum * decimalNum * decimalNum * decimalNum)
    println(BigInt.probablePrime(100, Random))

    println(math.sqrt(num$))

    val reval = sum(1 to 100: _*)
    println("return value=" + reval)

    //类型转换
    var a: Int = 11;
    var b: Long = a.toLong;
    var c: Double = b.toDouble;
    var d: String = c.toString;
    println("类型转换：" + c);
    println("类型转换：" + d);

    //操作符重载
    //    val e = 8 + 5;
    var e = (8).+(5)
    println("操作符重载:" + e)

  }

  def sum(num: Int*) = {
    var result = 0
    for (num <- num) result += num
    result
  }

}
