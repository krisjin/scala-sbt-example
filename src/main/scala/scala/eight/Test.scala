package scala.eight

import java.text.SimpleDateFormat

/**
 * Created by kris on 2014/8/8.
 */
object Test extends App {
  def ext() {
    val emp = new Employee("zhagnsan", 26, 8456.123)
    println(emp.toString)
    emp.execute()

    if (emp.isInstanceOf[Employee]) {
      emp.asInstanceOf[Employee]
      println("true")
    }

    if (emp.getClass == classOf[Employee]) println("classOf[] is true")
  }

  val nousClass = new Person("", 33) {
    def hi(word: String) {
      println(word)
    }
  }
  nousClass.hi("ppppppppppppppppp")
  println(nousClass.name2)

  //ext()
  def testHouse() {
    val house = new ZhangSanHouse(100, "三居")
    val add = house.developers()
    println(add)
    house.money
    val od = house.openDate
    val format = new SimpleDateFormat("yyyy-MM-dd")
    val formatOpenDate = format.format(od)
    println("Open date:" + formatOpenDate)
  }

  def testAnt() {
    val ant = new Ant

    println(ant.range)
    println("Array size=" + ant.env.size)

  }

  //  testHouse
  testAnt()
}
