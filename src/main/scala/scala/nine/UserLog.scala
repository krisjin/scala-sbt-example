package scala.nine

/**
 * Created by root on 14-8-10.
 */
trait UserLog extends Logger{
  abstract override def log(msg:String){
    super.log(new java.util.Date() + " "+ msg)
  }
}
