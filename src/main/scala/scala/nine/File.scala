package scala.nine

import java.io._
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.{FileVisitResult, Files, Path, SimpleFileVisitor}

//{File, FileInputStream, PrintWriter}

import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.{FileVisitResult, Files, Path, SimpleFileVisitor}

/**
 * Created by kris on 2014/8/8.
 */
object File extends App {
  //  val txt = Source.fromFile("e:/test.txt", "UTF-8")
  //  val lineIterator = txt.getLines()
  //  for (i <- lineIterator) println(i+"&")
  //  val lineBuffer = txt.getLines().toBuffer
  //  for(i<- lineBuffer)
  //  println(i)
  //  println(txt.mkString)
  //  for(i<- txt) print(i)
  //  val buf = txt.buffered
  //  while (buf.hasNext) {
  //    if (buf.head == 'a') {
  //      println(buf.head)
  //      break
  //    } else {
  //      buf.drop(buf.indexOf(buf.head))
  //    }
  //
  //  }
  //  val token = txt.mkString.split("\\s+")
  //  var strs = for {i <- token} yield i
  //  println(strs.mkString("||"))
  //  val nums = for(num<- token) yield num.toInt
  //  print(nums.mkString(","))
  //  val nums = token.map(_.toInt)
  //  print(nums.mkString(","))
  //  println("how old are you")
  //  var age = readInt()
  //  println("I'm " + age + " old")

  //  val html = Source.fromURL("http://www.baidu.com/","UTF-8")

  val file = new File("e:/test.txt")
  val in = new FileInputStream(file)
  val bytes = new Array[Byte](file.length().toInt)
  in.read(bytes)
  in.close()

  val out = new PrintWriter("e:/out.txt")
  for (i <- 1 to 100) out.print(i)
  out.close()


  def subDirs(dir: File): Iterator[File] = {
    val children = dir.listFiles().filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subDirs _)
  }

  //  for (d <- subDirs(new File("e:/chart"))) println(d.getCanonicalFile)

  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }

  val dir = new File("e:/chart")
  Files.walkFileTree(dir.toPath, (f: Path) => println(f))
}
