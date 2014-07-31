package scala.one

/**
 * Created by kris on 2014/7/31.
 */
object Drunkard {
    var money=10

    def drink:Unit={
      money-=1
    }

    def count:Int={
      drink
      money
    }

    def printByName(x: =>Int):Unit={
       for(i<- 0 until 10){
         println("每天算一算酒鬼还剩下"+x+"块钱")
       }
    }

    def printByValue(x:Int){
      for(i<- 0 until 10){
        println("每天算一算酒鬼还剩下"+x+"块钱")
      }
    }
    def main(args:Array[String]){
//      println("按名称参数传递---------")
//      printByName(count)
      println("按值参数传递-----------")
      printByValue(count)
    }
}
