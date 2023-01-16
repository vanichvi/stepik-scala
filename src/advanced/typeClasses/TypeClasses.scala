package advanced.typeClasses

object TypeClasses extends App {
  case class Customer(id: String, name: String)

  case class Order(orderId: String, customer: Customer, date: String)

  // 1
  trait Check[T] {
    def compare(orderA: Order, orderB: Order): Boolean
  }

  object CustomerCheck extends Check[Order] {
    override def compare(orderA: Order, orderB: Order): Boolean =
      orderA.customer.id == orderB.customer.id
  }

  object DateAndCustomerCheck extends Check[Order] {
    override def compare(orderA: Order, orderB: Order): Boolean =
      CustomerCheck.compare(orderA, orderB) && orderA.date == orderB.date
  }

  // *1
  // 2
  val greeting = ""

  case class Greeting(text: String) {
    def name: String = ???

    def occupation: String = ???

    def level: String = ???
  }

  object Greeting {
    implicit def toGreeting(string: String): Greeting = Greeting(string)
    def isMiddle(level:String): Boolean = level.equals("middle")
  }

  //println(greeting.isMiddle)
}
