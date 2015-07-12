class Problem15{
  def duplicateN(n: Int, list: List[Any]): List[Any] = {
    list.flatMap(element => for(ns <- 1 to n) yield element)
  }
}

object Problem15{
  def main(args: Array[String]): Unit ={
    val problem15 = new Problem15
    println("The n times duplicated list is: " + problem15.duplicateN(3, List('a', 'b', 'c', 'd')))
  }
}
