package solutions

class Problem18{
  def slice[A](fromIndex: Int, toIndex: Int, list: List[A]): List[Any] = (fromIndex, toIndex, list) match{
    case (_ ,_, Nil) => Nil
    case (startIndex, stopIndex, _) if(startIndex < 0 || stopIndex < 0) => throw new ArrayIndexOutOfBoundsException
    case (_, stopIndex, _) if stopIndex <= 0 => Nil
    case (startIndex, stopIndex, head :: tail) if startIndex <= 0 => List(head) ::: slice(0, (stopIndex - 1), tail)
    case (startIndex, stopIndex, head :: tail) => slice(startIndex - 1, stopIndex - 1, tail)
  }

}