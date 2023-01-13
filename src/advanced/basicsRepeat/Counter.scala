package advanced.basicsRepeat

import scala.annotation.tailrec

object Counter extends App {
  def countChars(someString: String): Map[Char, Int] = {
    @tailrec
    def loop(string: String, i: Int = 0, count: Map[Char, Int] = Map()): Map[Char, Int] = {

      if (i == string.length) {
        count
      }
      else {
        val curChar = string.toLowerCase.charAt(i)
        if (count.contains(curChar)) {
          loop(string, i + 1, count)
        }
        else {
          val countUpdate = count + (curChar -> string.toLowerCase.count(_ == curChar))
          loop(string, i + 1, countUpdate)
        }

      }
    }

    loop(someString)
  }

  println(countChars("Sst").toList.sortBy(_._2).reverse)
  //  println("Ppsghfghfghfgh".groupBy(identity).map(elem => (elem._1, elem._2.length)))
}
