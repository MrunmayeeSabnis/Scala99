package solutions

class Problem12{
  def decode(packedList: List[(Int, Any)]): List[Any] = {
    packedList.flatMap( element => for(n <- 1 to element._1) yield element._2)
  }
}

