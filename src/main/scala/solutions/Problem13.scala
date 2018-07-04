package solutions

object Problem13{
  def encodeDirect(list: List[Any]): List[(Int, Any)] = {
    if(list.isEmpty) Nil
    else{
      val(packedList, toBePackedList) = list.span(_ == list.head)
      (packedList.size, packedList.head) :: encodeDirect(toBePackedList)
    }
  }
}



