package solutions

object Problem2{
  def penultimate(list: List[Int]): Any = list match{
    case Nil => Nil
    case head :: _ :: Nil => head
    case head :: tail => penultimate(tail)
  }
}