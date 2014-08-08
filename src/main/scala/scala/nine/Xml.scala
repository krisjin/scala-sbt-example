package scala.nine

import scala.collection.mutable.ArrayBuffer

/**
 * Created by kris on 2014/8/8.
 */
@SerialVersionUID(4324242L) class Xml extends Serializable {
  private val xmls = new ArrayBuffer[Xml]

  var name = "version"

}
