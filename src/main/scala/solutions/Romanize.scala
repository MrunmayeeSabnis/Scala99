package solutions

import scala.annotation.tailrec

object Romanize {

  private lazy val numToRoman = List((1000, "M"), (900, "CM"), (500, "D"), (400, "CD"), (100, "C"), (90, "XC"),
    (50, "L"), (40, "XL"), (10, "X"), (9, "IX"), (5, "V"), (4, "IV"), (1, "I"))
  
  private lazy val romanToNum = List(("M", 1000),("CM", 900), ("D", 500), ("CD", 400), ("C", 100), ("XC", 90),
    ("L", 50), ("XL",40), ("X", 10), ("IX", 9), ("V", 5), ("IV", 4), ("I", 1))
  
  def toRoman(n: Int): String = {
    @tailrec
    def loop(n: Int, str: String): String = {
      n match {
        case value if n >= 1000 => {
          val filteredList = numToRoman.filter(_._1 <= value).head
          loop(value % filteredList._1, str + filteredList._2 + "M" * ((value / 1000) - 1))
        }
        case value if n >= 100 => {
          val lessThanMap = numToRoman.filter(_._1 <= value).head
          val extraStr = if (value < 400) "C" * ((value / 100) - 1) else ""
          loop(value % lessThanMap._1, str + lessThanMap._2 + extraStr)
        }
        case value if n >= 10 => {
          val lessThanMap = numToRoman.filter(_._1 <= value).head
          val extraStr = if (value < 40) "X" * ((value / 10) - 1) else ""
          loop(value % lessThanMap._1, str + lessThanMap._2 + extraStr)
        }
        case value if n >= 1 => {
          val lessThanMap = numToRoman.filter(_._1 <= value).head
          val extraStr = if (value < 4) "I" * (value - 1) else ""
          loop(value % lessThanMap._1, str + lessThanMap._2 + extraStr)
        }
        case value if value <= 0 => str
      }
    }
    loop(n, "")
  }

  def fromRoman(str: String): Int = {
    @tailrec
    def loop(str: String, num: Int): Int = {
      str match {
        case s if s.length == 0 => num
        case s if s.length == 1 => loop("", num + getValue(s))
        case s if s.length > 1 => {
          s.toList match {
            case Nil => num
            case head :: head1 :: tail => {
              if(s.length == 2 && getValue(s) != 0)
                loop("", num + getValue(s))
              else if(getValue(List(head, head1).mkString) != 0)
                loop(tail.mkString(""), num + getValue(List(head, head1).mkString))
              else
                loop((head1 :: tail).mkString(""), num + getValue(head.toString))
            }
          }
        }
      }
    }
    loop(str, 0)
  }

  private def getValue(key: String): Int = romanToNum.find(_._1 == key).map(_._2).getOrElse(0)
}
