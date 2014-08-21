package scala.one

/**
 * Created by kris on 2014/7/30.
 */
class Counter {

  private var value = 0

  def increment() {
    value += 1
  }

  def current() = value

  def sum(numbers: Int*): Int = {
    var result = 0
    for (number <- numbers) result += number
    result
  }

}
