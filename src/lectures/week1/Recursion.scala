package lectures.week1

import scala.annotation.tailrec

object Recursion extends App {
  def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def loop(k: Int, accumulator: Int = 1): BigInt = {
      if (k <= 0) accumulator
      else loop(k - 1, 2 * accumulator)
    }

    loop(n)
  }

  def printNumbersResult(x: Int, y: Int, n: Int): Unit = {
    @tailrec
    def loop(y: Int, i: Int, acc: Int = x): Int = {
      if (i <= 0) acc
      else loop(y, i - 1, acc + y)
    }

    val res = loop(y, n)

    @tailrec
    def printLoop(i: Int, acc: String = "is the result"): String = {
      if (i <= 0) acc
      else printLoop(i - 1, res.toString + " " + acc)
    }

    println(printLoop(res.toString.length))

  }

  printNumbersResult(10, 1, 5)
}
