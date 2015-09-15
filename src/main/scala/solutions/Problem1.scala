package solutions

class Problem1{
  def last[A](list: List[A]): Any = list match{
    case Nil => Nil
    case head :: Nil => head
    case head :: tail => last(tail)
  }
}
