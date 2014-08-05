package scala.three

import scala.collection.mutable.ArrayBuffer

/**
 * Created by kris on 2014/8/5.
 */
object ArrayTest {

  def main(args: Array[String]) {
    val arr2 = new Array[Int](10)
    val arr3 = Array(1, 2, 3, 4, 5, 6)
    for (i <- arr3) print(i + " ")
    println()

    val arrBuf = new ArrayBuffer[Int]()
    for (i <- 1 to 10) arrBuf += i
    println(arrBuf)
    arrBuf +=(11, 12, 13, 14)
    println(arrBuf)
    arrBuf ++= Array(15, 16, 17, 18)
    println(arrBuf)
    arrBuf.trimStart(3)
    arrBuf.trimEnd(5);
    println(arrBuf)
    arrBuf.insert(0, 1)
    println(arrBuf)
    arrBuf.insert(1, 2, 3)
    println(arrBuf)
    arrBuf.remove(arrBuf.length - 1)
    println(arrBuf)
    arrBuf.remove(arrBuf.head, 3)
    println(arrBuf)
    val convertArr = arrBuf.toArray;
    println(convertArr.getClass.getCanonicalName)
    val convertArrBuf = convertArr.toBuffer
    convertArrBuf +=(13, 14, 15)
    println(convertArrBuf)
    convertArrBuf.clear()
    arrBuf.insert(1, 2, 3, 4)
    arrBuf.trimEnd(2)
    println(arrBuf)
    println(convertArrBuf)
    for (i <- 0 until(arrBuf.length, 2)) print(i + " ")
    println()
    for (j <- (0 until arrBuf.length).reverse) print(arrBuf(j) + " ")

  }
}
