package solutions

object FindTripletsWithZeroSum {

  def tripletsWithZeroSum(l: List[Int]): Set[List[Int]] = getComb(l, l, List.empty).toSet.filter(_.sum == 0)

  private def getComb(l: List[Int], permList: List[Int], acc: List[List[Int]]): List[List[Int]] = l match {
    case Nil => acc
    case head :: Nil => acc
    case head :: head1 :: tail => {
      if(tail.length >= 2) {
        val triplet1 = List(head, head1, tail.head)
        val triplet2 = List(head, tail.head, tail(1))
        getComb(head :: head1 :: tail.tail, permList, acc :+ triplet1) ++ getComb(head +: tail, permList, acc :+ triplet2)
      } else if(tail.length == 1){
        val trip = List(head, head1, tail.head)
        getComb(permList.drop(1), permList.drop(1), acc :+ trip)
      }else {
        getComb(permList.drop(1), permList.drop(1), acc)
      }
    }
  }
}
