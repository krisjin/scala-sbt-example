package scala.eight

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
  ext()
}
