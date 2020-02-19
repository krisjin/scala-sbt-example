package scala.example

/**
  *
  * User:krisjin
  * Date:2020-02-19
  */
class ClassB extends ClassA {

  override val nameA: String = "ClassB of A"

  override def say(s: String): String = {


    "ClassB say:" + s
  }


}
