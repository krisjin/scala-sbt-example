package scala

/**
 * User: shijingui
 * Date: 2017/1/14
 */
object ForObject {

  def main(args: Array[String]) {
    test1
  }

  def test1: Unit = {
    for (i <- 1 to 3; j <- 1 to 3) {
      println(10 * i + j)
    }

  }
}
