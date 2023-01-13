package lectures.week1

object StringTask extends App {
  def reverse(string: String) = {
    val words = {
      string.split(raw"\s+")
    }
    val reversedWords = words.reverse
    var res = ""
    for (i <- reversedWords) {
      res = res + i + " "
    }
    println(res.strip())

  }

  reverse("      kjkj        kjkkk       kk      ")
}
