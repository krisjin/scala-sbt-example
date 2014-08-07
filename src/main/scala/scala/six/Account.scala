package scala.six

/**
 * Created by kris on 2014/8/7.
 */
class Account private(val ids: Int, initialBalance: Double) {
  val id = Account.newUniqueNumber()
  val balance = initialBalance
  private val address = "朝阳区"
}

//伴生对象
object Account {
  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

  def apply(initialBalance: Double) = new Account(lastNumber, initialBalance)
}