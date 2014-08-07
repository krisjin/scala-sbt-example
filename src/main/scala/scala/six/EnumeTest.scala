package scala.six

import scala.six.TrafficLightColor._

/**
 * Created by kris on 2014/8/7.
 */
object EnumeTest extends App {

  def test() {
    for (e <- TrafficLightColor.values) {
      if (e == Red) println(e.id + ":" + "Stop")
      else if (e == Yellow) println(e.id + ":" + "Waring")
      else println(e.id + ":" + "Crossing")
    }

    val yellow= TrafficLightColor(2)
    val red= TrafficLightColor.withName("Reds")
    println(red)
    println(yellow)
  }

  test()
}
