package scala.one

import java.math.RoundingMode

import scala._
/**
 * Created by kris on 2014/7/30.
 */
object CommonTest {
  def main(args:Array[String]){
      val p1=new Person()
      val p2=new Person("krisjin")
      val p3=new Person("kris",28)
      val num=math.sqrt(4)
      println(num)

    //Array
    val nums =new Array[Int](10)
    println(nums)

    //for
    var num2=0
    for (ch<- "h"){num2+=ch}
    print("num:"+num2)
    val num3 =10
    for(i<- 0 to num3){println(i)}
    for(i<- 1 to 3 ;j<- 1 to 3) print((10*i +j)+" ")
    println()
    for(i<- 1 to 3; j<- 1 to 3 if i!=j) print((10*i+j)+" ")
    println()
    for (i<- 1 to 3;cc =4-i;j<- cc to 3) print((10*i +j)+" ")
    println()

    //if
    val x1=0
    var x2:Any=0
    if(x1>0) x2=1 else x2="-1"
    val x3=if(x1>0) 1 else -1

    //Test Counter

    val counter = new Counter
    val sum=counter.sum(123,234,345)
    println("sum:"+sum)

    //----
    val salary:BigDecimal=100000
    val weekly =salary/52
    val x4=weekly.setScale(2,scala.BigDecimal.RoundingMode.HALF_EVEN)
    println(x4)

    //----
    val logEnable:Boolean=true
    val isStart:Boolean=false
    if(logEnable || isStart)println("output log.......") else println("not output log.....")
    println(22/0)
  }
}
