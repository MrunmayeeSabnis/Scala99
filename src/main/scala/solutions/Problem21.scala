package solutions

object Problem21 {

  def insertAt[A](position: Int, element: A, insertIn: List[A]): List[A] = {
    if(position == 0) element :: insertIn
    else if(position < 0 || position > length(insertIn)) throw new IndexOutOfBoundsException
    else {
     insertIn match {
       case Nil => List(element)
       case head :: tail => head :: insertAt(position - 1, element, tail)
     }
    }
  }

  private def length[A](list: List[A]) = list.length - 1
}

