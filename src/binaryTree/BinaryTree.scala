package binaryTree

abstract class BinaryTree[+T] {
  def value: T // значение узла

  def leftChild: BinaryTree[T] // левый потомок

  def rightChild: BinaryTree[T] // правый потомок

  def isEmpty: Boolean

  def isLeaf: Boolean

  def collectLeaves: List[BinaryTree[T]]
}
