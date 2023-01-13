package binaryTree


case class Node[+T](
                     override val value: T,
                     override val leftChild: BinaryTree[T],
                     override val rightChild: BinaryTree[T])
  extends BinaryTree[T] {
  override def isEmpty: Boolean = false

  override def isLeaf: Boolean = leftChild.isEmpty && rightChild.isEmpty

  override def collectLeaves: List[BinaryTree[T]] = {
    //    def loop(toInspect: List[BinaryTree[T]] = List(this),
    //             leaves: List[BinaryTree[T]] = List()): List[BinaryTree[T]] = {
    //      if (toInspect.isEmpty) leaves
    //      if (toInspect(0).isLeaf) leaves = leaves :: toInspect(0)
    //      else {
    //        toInspect =
    //      }
    //    }
    List(this)
  }
}

