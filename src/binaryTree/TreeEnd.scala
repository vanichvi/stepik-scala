package binaryTree

case object TreeEnd extends BinaryTree[Nothing] {
  override def value: Nothing = throw new NoSuchElementException()

  override def leftChild: BinaryTree[Nothing] = throw new NoSuchElementException()

  override def rightChild: BinaryTree[Nothing] = throw new NoSuchElementException()

  override def isEmpty: Boolean = true

  override def isLeaf: Boolean = false

  override def collectLeaves: List[BinaryTree[Nothing]] = List()
}
