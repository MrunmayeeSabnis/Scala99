class Problem4{
  def length(list: List[Any]): Int = list.size
}

object Problem4{
  def main(args: Array[String]): Unit ={
    val problem4 = new Problem4
    println("Length of the list is : " + problem4.length(List(1,2,3,4,5)))
  }
}

