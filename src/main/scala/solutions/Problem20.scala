package solutions

object Problem20{

  def removeAt[A](index: Int, list: List[A]): List[A] = (index, list) match{
    case (_ , Nil) => Nil
    case (index, _) if(index > list.length || index < 0) => throw new ArrayIndexOutOfBoundsException
    case (_, head :: Nil) => List(head)
    case (1, head :: tail) => tail
    case (index, head :: tail) => List(head) ::: removeAt(index - 1, tail)
  }

}