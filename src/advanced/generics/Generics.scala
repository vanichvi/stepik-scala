package advanced.generics

object Generics extends App{
  class Programmer(name: String)

  case class DataAnalyst(val name: String) extends Programmer(name)
  case class SoftwareEngineer(val name: String) extends Programmer(name)
  class Employee[+T](val employee: T) {
    def info() = println(employee)
  }
  val employee: Employee[Programmer] = new Employee[DataAnalyst](DataAnalyst("Bob"))

  class Modifier[A](var someVar: A) {
    def modifier: A = someVar

    def modifier_=(value: A): Unit = {
      someVar = value
    }
  }
  val aModifier = new Modifier[Int](10)
  aModifier.modifier = 5
}
