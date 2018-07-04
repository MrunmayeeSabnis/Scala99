object Problem8{
  def compress(list: List[Int]): List[Int] = list match{
    case Nil => Nil
    case x :: xs => x :: compress(xs.dropWhile(_ == x))
  }
}


