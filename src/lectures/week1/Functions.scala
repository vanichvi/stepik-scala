package lectures.week1

object Functions extends App {
  def aParameterlessFunction(): Unit = println("Function with no parameters")

  def someFunnc(x: Int, y: => Int): Int = {
    x * 2
  }

  def callSomeFunc(x: Int, y: => Int) = println(x)

  callSomeFunc(someFunnc(2, 2), 1)
  //aParameterlessFunction
}
