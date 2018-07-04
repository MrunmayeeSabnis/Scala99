package solutions

object Problem15{
  def duplicateN(n: Int, list: List[Any]): List[Any] = {
    list.flatMap(element => for(ns <- 1 to n) yield element)
  }
}

