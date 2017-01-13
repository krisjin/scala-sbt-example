package scala

import scala.math._

/**
 * Scala基础语法
 *
 * object定义的对象为单例，可以直接使用 对象名.方法(参数) 进行调用，类似java中的static方法。
 * 伴生对象：拥有与class类同名的object定义的对象。
 * User: shijingui
 * Date: 2016/11/15
 */
object ScalaBaseGrammar {

  def main(args: Array[String]) {

    //函数,在使用函数的时候建议，获取值的直接调用函数，其它的调用最好加上（）
    //函数用法def 函数名（参数：参数类型，参数：参数类型）: 返回值类型={ }
    //函数的简写：a方法b,完整写a.方法（b）例：1to(2),可简略写为1 to 2
    //apply方法 a(b) 完整写法为 a.apply(b) ,例：例： "xxx"(2) 实际转换为 "xxx".apply(2)

    fun1();
    val funReturnValue = fun2();

    println(funReturnValue);
    val funReturnValue2 = fun3(1, 2);

    println("Scala的第三个函数！！" + funReturnValue2);
    fun4;

    val anonymousValue = fun5(22, 11);
    println("Scala的第五个函数(匿名)：" + anonymousValue)

    //变量，常量定义 var,val
    var a = 11;
    val b = 11;
    //b = 22;//定义的常量不能再被赋值
    var c: Int = 33;
    //定义的变量必须要初始化
    var d: String = "22";
    var e, f = "multi variable define"; //声明多个变量，e,f的值相同
    println("变量常量使用：" + e + " == " + f)


    //类型转换的使用，没有强制转换的概念。直接使用类似Java中的包装类使用方法。
    var g: Int = 22222;
    var h: Long = g.toLong;
    var i: Double = h.toDouble;

    testF;
  }


  /**
   * 无参数无返回值的函数
   */
  def fun1(): Unit = {
    println("Scala的第一个函数！！");
  }

  /**
   * 无参数有返回值的函数
   * @return
   */
  def fun2(): String = {
    return "Scala的第二个函数！！";
  }

  /**
   * 有参数的有返回值的函数
   * @param a
   * @param b
   * @return
   */
  def fun3(a: Int, b: Int): Int = {
    var dd = 22;
    a + b; //函数体最后的语句为返回值
    //    return a + b;
  }

  /**
   * 嵌套函数调用
   */
  def fun4: Unit = {
    fun1();
  }

  /**
   * 定义一个匿名函数
   */
  var fun5 = (x: Int, y: Int) => x - y;

  def testF: Unit = {

    println(sqrt(22))
    println(pow(2, 4))
    println(min(22, 2))

    val s = if (1 > 2) 1 else 2
    var s11 = 0
    if (1 > 0) s11 = 11 else s11 = -1

    var dd = {
      val a = 1 * 2;
      val b = 2 * 1;
      a * b
    }

    println(s)
    println(s11)
    println(dd)


    val s12 = "Hello"

    var sum ="----";

    for (j <- 0 until s12.length) {
//      sum+=j;
      println(s12(j))
    }


    println(sum)

  }
}
