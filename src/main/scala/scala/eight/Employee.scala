package scala.eight

/**
 * Created by kris on 2014/8/8.
 */
class Employee(name: String, age: Int, salary: Double) extends Person(name, age) {

  override def toString = getClass.getName + "[Employee salary=" + salary + "]"

  def execute() {
    println(super.toString)

  }
}
