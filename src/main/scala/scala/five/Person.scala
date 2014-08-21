package scala.five

/**
 * Created by kris on 2014/8/6.
 */
class Person(name: String, age: Int) {
  println("name:" + name + "; age:" + age)

  def say = println("hello!")

}

class Person2 private(val id: Int) {


}
