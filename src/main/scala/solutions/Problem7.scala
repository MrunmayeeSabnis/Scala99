class Problem7{
  def flatten(list: List[Any]): List[Any] = list match{
    case Nil => list
    case (x: List[Int]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
  }
}

object Problem7{
  def main(args: Array[String]): Unit ={
    val problem7 = new Problem7
    println("Flatten list is : " + problem7.flatten(List(List(1,7,8), 2, 3, List(4, 5), 2)))
  }
}

