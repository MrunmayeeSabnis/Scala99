package solutions

class Problem9{
  def pack[A](list: List[A]): List[List[A]] = {
    if(list.isEmpty) List()
    else{
      val(packedList, toBePackedList) = list.span(_ == list.head)
      if(toBePackedList == Nil) {
        List(packedList)
      }
      else packedList :: pack(toBePackedList)
    }
  }
}


class Problem10{
  def encode[A](list: List[A]): List[(Int, Any)] = {
    val problem9 = new Problem9
    problem9.pack(list).map{ e => (e.size, e.head) }
  }
}


class Problem11{
  def encodeModified[A](list: List[A]): List[Any] = {
    val problem10 = new Problem10
    problem10.encode(list).map(e => if(e._1 == 1) (e._2) else e)
  }
}


