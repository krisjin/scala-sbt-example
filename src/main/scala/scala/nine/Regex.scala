package scala.nine

/**
 * Created by kris on 2014/8/8.
 */
object Regex extends App{
  val numPattern = "[0-9]+".r
  val complexPattern = """\s+[0-9]+\s+""".r

  for(matchString<- numPattern.findAllIn("9843 apple,4343 tomato")) println(matchString)
}
