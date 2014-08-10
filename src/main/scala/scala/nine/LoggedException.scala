package scala.nine

import scala.util.logging.Logged

/**
 * Created by root on 14-8-11.
 */
trait LoggedException extends Exception with Logged{
  def log(){log(getMessage)}

}
