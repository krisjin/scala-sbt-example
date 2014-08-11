package scala.eleven

/**
 * Created by kris on 2014/8/11.
 */
class ApplyTest(param: String, param2: String) {
  println(param + "--" + param2)
}

object ApplyTest {
  def apply(param: String, param2: String) = new ApplyTest(param, param2)
}
