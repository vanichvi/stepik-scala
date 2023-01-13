package lectures.weef3fp

object FunctionsFP extends App {
  val multiply = (x: Int, y: Int) => x * y
  println(multiply(9, 5))
  val length = (s: String) =>  s.length
  print(length(""))

  def someFunc: Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val res = someFunc(1)
  println(someFunc(3)(4))
}
