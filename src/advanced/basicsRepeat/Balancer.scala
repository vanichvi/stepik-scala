package advanced.basicsRepeat

object Balancer extends App {
  def isBalanced(aString: String): Boolean = aString.count(_ == '(') == aString.count(_ == ')')
}
