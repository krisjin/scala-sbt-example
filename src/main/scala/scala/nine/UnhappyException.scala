package scala.nine

import java.io.IOException

/**
 * Created by kris on 2014/8/11.
 */
class UnhappyException extends IOException with LoggedException {
  override def getMessage() = ""

  override def log(msg: String) {

  }
}
