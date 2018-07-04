package solutions

object Problem17{

  def split[A](index: Int, list: List[A]): (List[A], List[A]) = (index, list) match{
    case (index, _) if index < 0 => throw new ArrayIndexOutOfBoundsException
    case (index, Nil) => (Nil, Nil)
    case (0, head :: tail) => (Nil, head :: tail)
    case (index, head :: tail) =>  {
      val (pre, post) = split(index - 1, tail)
      (head :: pre, post)
    }
  }
}
