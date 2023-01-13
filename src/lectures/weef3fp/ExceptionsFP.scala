package lectures.weef3fp

import scala.util.Try

object ExceptionsFP extends App {
  def unsafeMethod(): String = throw new RuntimeException("Sorry, not your day")

  val anotherPotentialFailure = Try {
    Try(unsafeMethod())
    "another failure"
  }

  println(anotherPotentialFailure)
}
