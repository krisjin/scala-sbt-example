package scala.nine

import java.io.PrintStream

/**
 * Created by root on 14-8-11.
 */
trait FileLogger extends Logger {
  val fileName: String
  lazy val out = new PrintStream(fileName)

  override def log(msg: String) {
    out.println(msg)
  }
}
