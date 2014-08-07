package scala.five

import scala.collection.mutable.ArrayBuffer

/**
 * Created by kris on 2014/8/7.
 */
class Network {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val member = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    member += m
    m
  }

  private def addPage(url: String): Unit = {

  }

}
