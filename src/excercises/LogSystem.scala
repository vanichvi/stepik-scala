package excercises

import scala.annotation.tailrec

object LogSystem extends App {
  class Logger(val msgNum: Int = 0) {
    def info(): Logger = {
      println("INFO New Message")
      new Logger(msgNum + 1)
    }

    def info(msgs: Int): Logger = {
      if (msgs <= 0) this
      else info().info(msgs - 1)
    }

    def print = println(msgNum)
  }
}
