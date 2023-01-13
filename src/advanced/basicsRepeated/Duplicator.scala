package advanced.basicsRepeated

object Duplicator extends App {
  def duplicate[T](someList: List[T], nDumps: Int): List[T] = someList.flatMap(x => List.fill(nDumps)(x))
  println(duplicate(List("a", "b"), 3))
}
