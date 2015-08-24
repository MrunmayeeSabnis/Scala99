class Problem1{

  def nthElem(list: List[Int], n: Int): Int = list(list.size - (list.size - n) - 1)

}

object Problem1{
  def main(args: Array[String]): Unit ={
    val problem1 = new Problem1
    println(problem1.nthElem(List(12,3,4,5,6), 4))
  }
}
