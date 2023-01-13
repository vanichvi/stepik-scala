package lectures.weef3fp

import java.util.Scanner
import scala.io.StdIn.readLine

//object Patterns extends App {
//  def guard(data: Any, maxLength: Int): String = data match {
//    case d: List[Any] if (d.size <= maxLength) => "Задан список List допустимой длины"
//    case d: List[Any] if (d.length > maxLength) => "Длина списка больше максимально допустимого значения"
//    case s: String if (s.length <= maxLength) => "Длина строки не превышает максимально допустимого значения"
//    case s: String if (s.length < 0 || s.length > maxLength) => "Получена строка недопустимой длины"
//    case _ => "Что это? Это не строка и не список"
//  }

  //  println(guard(List(1, 2, 3), 3))
  //  println(guard(List(1, 2, 3), 2))
  //  println(guard("Строка", 6))
  //  println(guard("Строка", 3))
  //  println(guard(42, 3))
  object Patterns extends App {
//    object Person {
//      def apply(s: Array[String]) = {
//        s
//      }
//
//      def unapply(name: Option[Array[String]]): Option[String] = {
//        if (name==null) Some("Oops, something is wrong")
//        else Some(s"${name.getOrElse()(0).charAt(0)}. ${name(1).charAt(0)}.")
//      }
//    }
//    val name = readLine().split(" ") match {
//      case Person(str) => println(str)
//    }
//    print(name)
    def name(s:Array[String]) = s match {
  case null => "Oops, something is wrong"
  case _ =>s"${s(0).charAt(0)}. ${s(1).charAt(0)}."
}
    val res = name(readLine().split(" "))
    println(if (res==null) res else "Oops, something is wrong")
  }
//}
