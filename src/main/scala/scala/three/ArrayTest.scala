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

    val eles = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val newArr = for (ele <- eles) yield ele * 2
    println()
    print("原始集合：")
    for (e <- eles) print(e + " ")
    println()
    print("产生的新集合：")
    for (e <- newArr) print(e + " ")

    val conditionOper = for (e <- eles if e % 2 == 0) yield e * 2
    println()
    for (c <- conditionOper) print(c + " ")

    val filterArr = eles.filter(_ % 2 == 0).map(2 * _)
    println()
    for (e <- filterArr) print(e + " ")

    test2()
    test3()
  }

  def test2() {
    var arr = new ArrayBuffer[Int]()
    arr +=(1, 2, 3, -4, 5, 6, -7, 8, 9, -10)
    var first = true
    var n = arr.length
    var i = 0
    while (i < n) {
      if (arr(i) >= 0) i += 1
      else {
        if (first) {
          first = false;
          i += 1
        } else {
          arr.remove(i)
          n -= 1
        }
      }
    }
    println("\n" + arr)
  }

  def test3() {
    var arr = new ArrayBuffer[Int]()
    arr +=(1, 2, 3, -4, 5, 6, -7, 8, 9, -10,33,-322,32,-123,789)
    var first = true
    val indexes = for (i <- 0 until arr.length if first || arr(i) >= 0) yield {
      if (arr(i) < 0) first = false
      i
    }

    for (j <- 0 until indexes.length) arr(j) = arr(indexes(j))
    arr.trimEnd(arr.length - indexes.length)

    println(arr)

  }

}
