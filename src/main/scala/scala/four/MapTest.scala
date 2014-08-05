package scala.four

/**
 * Created by root on 14-8-5.
 */
object MapTest {
  def main(args:Array[String]){
    val map = Map("name" -> "kris","age" -> 28,"address" -> "China")
    println(map.mkString(";"))
    val mutableMap = scala.collection.mutable.Map("name" -> "kris","age" -> 28,"address" -> "China")
    val map2 = Map(("name","krisjin"),("age",27))
    var name = map2("name")
    println(name)
    val name2 = if(map2.contains("name")) map2("name") else 0
    val name3 = map2.getOrElse("sname",0)
    println(name3)
    mutableMap("name") = "xiaoming"
    println(mutableMap)
    mutableMap += ("music" -> "bandari" , "sport" -> "football")
    println(mutableMap)
    mutableMap -= ("name","music")
    println(mutableMap)
    var newMap = map + ("name" -> "krisjin" , "year" -> 2014 , "month" -> 8 , "day" ->5)
    println(newMap)
    newMap  -= "name"
    println(newMap)

    for((k,v) <- newMap)println(k+":"+v)

    val keySets = newMap.keySet
    for(v <- newMap.values)print(v+" ")

    val reverseMap = for((k,v) <- newMap) yield (v,k)

    println("\n"+reverseMap)
  }



}
