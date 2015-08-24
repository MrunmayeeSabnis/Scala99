class Problem14{
  def duplicate(list: List[Any]): List[Any]= list match{
    case Nil => Nil
    case x :: xs => List(x, x) ::: duplicate(xs)
  }
}

object Probelm14{
  def main(args: Array[String]): Unit ={
   val problem14 = new Problem14
    println("The duplicated list is : " + problem14.duplicate(List(1,2,3)))
  }
}

