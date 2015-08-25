package solutions

class Problem14{
  def duplicate[A](list: List[A]): List[A]= list match{
    case Nil => Nil
    case x :: xs => List(x, x) ::: duplicate(xs)
  }
}

