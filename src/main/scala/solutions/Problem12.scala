class Problem12{
  def decode(packedList: List[(Int, Any)]): List[Any] = {
    packedList.flatMap( element => for(n <- 1 to element._1) yield element._2)
  }
}

object Problem12{
  def main(args: Array[String]): Unit ={
    val problem12 = new Problem12
    println("The decoded list is : " + problem12.decode(List((2,'a'), (2,'b'), (3,'c'))))
  }
}
