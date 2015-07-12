class Problem8{
  def compress(list: List[Int]): List[Int] = list match{
    case Nil => Nil
    case x :: xs => x :: compress(xs.dropWhile(_ == x))
  }
}

object Problem8{
  def main(args: Array[String]): Unit ={
    val problem8 = new Problem8
    println("Compressed list is : " + problem8.compress(List(1,1,1,2,3,4,5,5,6)))
  }
}

