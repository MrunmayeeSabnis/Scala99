class Problem13{
  def encodeDirect(list: List[Any]): List[(Int, Any)] = {
    if(list.isEmpty) Nil
    else{
      val(packedList, toBePackedList) = list.span(_ == list.head)
      (packedList.size, packedList.head) :: encodeDirect(toBePackedList)
    }
  }
}

object Problem13{
  def main(args: Array[String]): Unit ={
    val problem13 = new Problem13
    println("The directly encoded list is : " + problem13.encodeDirect(List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'd')))
  }
}

