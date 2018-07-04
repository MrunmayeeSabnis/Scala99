package solutions

object Problem19{
  def rotate[A](index: Int, list: List[A]): List[A] = (index, list) match {
    case (index, list) if (index < 0) => list.drop(index.abs) ::: list.take(index.abs)
    case (0, list) => list
    case (index, list) => {
      val first = list.take(index)
      val second = list.drop(index)
      second ::: first
    }
  }

}