object Problem7{
  def flatten(list: List[Any]): List[Any] = list match{
    case Nil => list
    case (x: List[Int]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
  }
}

