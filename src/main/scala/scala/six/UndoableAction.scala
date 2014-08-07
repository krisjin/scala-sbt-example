package scala.six

/**
 * Created by kris on 2014/8/7.
 */
abstract class UndoableAction(val description: String) {
  def undo(): Unit

  def redo(): Unit
}
