package solutions

class Problem16{
  def dropNthElem[A](index: Int, list: List[A]): List[A] = (index, list) match{
    case (index, _) if index < 0=> throw new ArrayIndexOutOfBoundsException
    case (index, Nil) => Nil
    case (1, head :: tail) => tail
    case (index, head :: tail) => head :: dropNthElem( index - 1, tail)
  }
}