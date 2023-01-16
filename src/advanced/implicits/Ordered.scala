package advanced.implicits



import scala.language.implicitConversions

object Ordered extends App {
  //1
  case class Course(id: Int, title: String)

  val courses = List(
    Course(0, "Scala"),
    Course(1, "Functions"),
    Course(1, "Advanced Scala"),
    Course(4, "Spark"),
    Course(3, "Cats"),
    Course(3, "Akka")
  )

  implicit def courseOrdering: Ordering[Course] = Ordering.by(c => (c.id, c.title))

  println(courses.sorted)

  // *1
  //2
  case class Price(price: Int)

  object Price{
    implicit class PriceOps(p: Price) {
      def toInt: Int = p.price

      def -(n: Int): Price =  Price(p.price-n)
    }
  }
  val price= Price(200)
  val sum = price.toInt + 100
  println(sum)
}
