package scala.five

/**
 * Created by kris on 2014/8/6.
 */
object PersonTest {
  def main(args: Array[String]) {
    val person = new Person("krisjin", 22)

    val network = new Network
    val network2 = new Network

    val kris = network.join("kris")
    val will = network.join("will")
    kris.contacts += will

    println(kris)
  }
}
