object Problem5{
  def reverse(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case x :: Nil => list
    case x :: xs => reverse(xs) ::: List(x)
  }
}

object Problem6{
  def isPalindrome(list: List[Int]): Boolean = list.equals(Problem5.reverse(list))
}


