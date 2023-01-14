package advanced.lazyVals

import scala.math.BigDecimal.int2bigDecimal

object LazyVals extends App {
  sealed trait SeniorityLevel

  object SeniorityLevel {
    case object Junior extends SeniorityLevel

    case object Middle extends SeniorityLevel

    case object Senior extends SeniorityLevel
  }

  case class Developer(
                        firstName: String,
                        level: SeniorityLevel,
                        programmingLang: List[String]
                      )


  val developers: List[Developer] = List(
    Developer(
      firstName = "Bob",
      level = SeniorityLevel.Junior,
      programmingLang = List("Java")
    ),
    Developer(
      firstName = "Alice",
      level = SeniorityLevel.Middle,
      programmingLang = List("Java", "Scala")
    ),
    Developer(
      firstName = "Sam",
      level = SeniorityLevel.Senior,
      programmingLang = List("Java", "Scala", "Python")
    ),
    Developer(
      firstName = "Pam",
      level = SeniorityLevel.Senior,
      programmingLang = List("Java", "Scala", "Python", "Kotlin")
    ),
  )


  def isMiddleOrSenior(developer: Developer): Boolean =
    List(SeniorityLevel.Middle, SeniorityLevel.Senior).contains(developer.level)


  def knowsMoreThanTwoPL(developer: Developer): Boolean = developer.programmingLang.size > 2


  def name(developer: Developer): String = developer.firstName

  val foundDevs: List[String] = developers
    .withFilter(isMiddleOrSenior)
    .withFilter(knowsMoreThanTwoPL)
    .map(name)

  //  (1 to 1000000000).to(LazyList).map(_ * 3).take(5).filter(_ <= 6).foreach(println) // отработает довольно быстро
  val capacity = 10000
  val power =0

  val powerOfTwo = List.fill(power)(2.toBigInt).product
  println(powerOfTwo)

}
