package scala.nine

import java.io._

/**
 * Created by kris on 2014/8/8.
 */
object TestXml extends App {
  val xml = new Xml

  val out = new ObjectOutputStream(new FileOutputStream("e:/xml.obj"))
  out.writeObject(xml)
  out.close()

  val in = new ObjectInputStream(new FileInputStream("e:/xml.obj"))
  val inputXml = in.readObject().asInstanceOf[Xml]

  println(inputXml.name)

}
