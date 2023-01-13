package advanced.basicsRepeat

object Test {
  def add(x: Int, y: => Int) = x + y

  def multiply(f: () => Int) = f() * 2

  def four: Int = 4

  def two(): Int = 2

//  add(two(), four)
//
//  add(1, () => 2)
//
//  add(1, two _)
//
//  multiply(12)
//
//  add(1, 2)
//
//  multiply(() => 4)
//
//  add(1, four)
//
//  multiply(two _)
//
//  multiply(two)
//
//  multiply(four)
//
//  add(1, (() => 2) ())

}
