package lectures.week1

object Expressions extends App {
  val aExpression = 1 + 2 * 3
  val aNumber = if (("string".length == 6 & 1 < 2) & ('1' +: "23" :+ '4').toInt == 1234) 24 else 123
  println(aNumber)
  val int = true && true
  println(int)
}
