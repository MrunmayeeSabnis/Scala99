package solutions

object Problem3 {
  def kthElem[A](index: Int, list: List[A]): Any = (index, list) match {
    case (_, Nil) => Nil
    case (index, _) if (index < 0) => throw new ArrayIndexOutOfBoundsException
    case (1, head :: tail) => head
    case (index, head :: tail) => kthElem(index - 1, tail)
  }
}