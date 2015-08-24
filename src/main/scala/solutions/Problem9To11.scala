object Problem9{
  def pack(list: List[Char]): List[List[Char]] = {
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


object Problem10{
  def encode(list: List[Char]): List[(Int, Any)] = {
    Problem9.pack(list).map{ e => (e.size, e.head) }
  }
}


object Problem11{
  def encodeModified(list: List[Char]): List[Any] = {
    Problem10.encode(list).map(e => if(e._1 == 1) (e._2) else e)
  }
}


object Problem9To11{
  def main(args: Array[String]): Unit ={
    println("The packed list is : " + Problem9.pack(List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'd')))
    println("The packed list is : " + Problem10.encode(List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'd')))
    println("The packed list is : " + Problem11.encodeModified(List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'd')))
  }
}
