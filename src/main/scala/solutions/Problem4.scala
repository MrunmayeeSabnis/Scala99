package solutions

class Problem4{

  def length[A](list: List[A]): Int = list match{
    case Nil => 0
    case head :: Nil => 1
    case head :: tail => 1 + length(tail)
  }
}