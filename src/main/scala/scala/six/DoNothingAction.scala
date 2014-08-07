package scala.six

/**
 * Created by kris on 2014/8/7.
 */
object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo() {}

  override def redo() {}
}
