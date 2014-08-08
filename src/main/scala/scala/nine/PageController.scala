package scala.nine

/**
 * Created by kris on 2014/8/8.
 */
trait PageController {

  def execute(action: String) {
    println("invoke " + action + " ...")
  }

}
