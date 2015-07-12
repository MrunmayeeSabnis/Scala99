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

object ProblemsFiveAndSix extends App{
  override def main(args: Array[String]): Unit ={
    println("Reverse list is : " + Problem5.reverse(List(2, 4, 8, 5, 7)))
    println("Is the list Palindrome : " + Problem6.isPalindrome(List(1, 2, 3, 3, 2, 1)))
  }
}

