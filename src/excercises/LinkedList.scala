package excercises

import scala.runtime.Nothing$

object LinkedList extends App {
  abstract class LogList [+T]{
    def last(): T

    def previous(): LogList[T]

    def isEmpty(): Boolean

    def all(): String

    def add[B >: T](msg: B): LogList[B]
  }

  object Empty extends LogList[Nothing] {


    override def last(): Nothing = throw new NoSuchElementException()

    override def previous(): LogList[Nothing] = throw new NoSuchElementException()

    override def isEmpty(): Boolean = true

    override def all(): String = ""

    override def add[B >: Nothing](msg: B): LogList[B] = new Log[B](msg, Empty)
  }

  class Log[T] (head: T, tail: LogList[T]) extends LogList[T] {


    override def last(): T = head

    override def previous(): LogList[T] = tail

    override def isEmpty(): Boolean = false

    override def all(): String = {
      def loop(cur: LogList[T], acc: String = ""): String = {
        try {
          loop(cur.previous(), s"$acc ${cur.last()}")
        } catch {
          case e: NoSuchElementException => acc
        }
      }

      loop(this).trim
    }
    override def add[B >: T](msg: B): LogList[B] = new Log[B](msg, this)
  }

  val list = Empty
  val strLogs: LogList[String] = Empty
  print(list.all())
}

