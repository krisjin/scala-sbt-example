package scala.eight

import java.util.Date

/**
 * Created by kris on 2014/8/8.
 */
class ZhangSanHouse(houseSize: Int, houseType: String) extends AbstractHouse(houseSize, houseType) {
  val money = 13132.98
  var openDate = new Date()

  def developers(): String = {
    val address = "ddd"
    address
  }
}
