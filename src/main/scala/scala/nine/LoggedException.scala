package scala.nine

import scala.util.logging.Logged

/**
 * Created by root on 14-8-11.
 */
trait LoggedException extends Logged {
  //def log(){log(getMessage)}
  this: Exception =>
  def log() {
    log(getMessage)
  }
}
