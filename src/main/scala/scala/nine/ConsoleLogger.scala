package scala.nine

/**
 * Created by kris on 2014/8/8.
 */
class ConsoleLogger extends Logger with Serializable{
  def log(msg: String) {
    print(msg)
  }
}
