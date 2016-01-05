class Problem5{
  def reverse(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case x :: Nil => list
    case x :: xs => reverse(xs) ::: List(x)
  }
}

class Problem6{
  val problem5 = new Problem5
  def isPalindrome(list: List[Int]): Boolean = list.equals(problem5.reverse(list))
}


