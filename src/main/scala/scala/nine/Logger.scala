package scala.nine

/**
 * Created by kris on 2014/8/8.
 */
trait Logger {
  def log(msg: String) {
    println(msg)
  }

  //  def info(msg:String){
  //    log("INFO: "+msg)
  //  }
  //  def warn(msg:String): Unit ={
  //    log("WARN: "+msg)
  //  }
  //  def error(msg:String): Unit ={
  //    log("ERROR: "+msg)
  //  }
}
