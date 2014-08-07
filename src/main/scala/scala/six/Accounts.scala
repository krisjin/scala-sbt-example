package scala.six

/**
 * Created by kris on 2014/8/7.
 */
object Accounts {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

  def main(args: Array[String]) {
    val account = Account(299.2)
    print(account.balance)
  }
}
