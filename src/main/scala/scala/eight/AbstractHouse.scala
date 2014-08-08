package scala.eight

import java.util.Date


/**
 * Created by kris on 2014/8/8.
 */
abstract class AbstractHouse(houseSize:Int,houseType:String) {
    def developers:String
    val money:Double
    var openDate:Date
}
