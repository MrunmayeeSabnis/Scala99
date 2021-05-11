package solutions

object Romanize {

  private val list = List((1000, "M"), (900, "CM"), (500, "D"), (400, "CD"), (100, "C"), (90, "XC"),
    (50, "L"), (40, "XL"), (10, "X"), (9, "IX"), (5, "V"), (4, "IV"), (1, "I"))
  
  def toRoman(n: Int): String = {
    def loop(n: Int, str: String): String = {
      n match {
        case value if n >= 1000 => {
          val lessThanMap = list.filter(_._1 <= value).head
          loop(value % lessThanMap._1, str + lessThanMap._2 + "M" * ((value / 1000) - 1))
        }
        case value if n >= 100 => {
          val lessThanMap = list.filter(_._1 <= value).head
          val extraStr = if (value < 400) "C" * ((value / 100) - 1) else ""
          loop(value % lessThanMap._1, str + lessThanMap._2 + extraStr)
        }
        case value if n >= 10 => {
          val lessThanMap = list.filter(_._1 <= value).head
          val extraStr = if (value < 40) "X" * ((value / 10) - 1) else ""
          loop(value % lessThanMap._1, str + lessThanMap._2 + extraStr)
        }
        case value if n >= 1 => {
          val lessThanMap = list.filter(_._1 <= value).head
          val extraStr = if (value < 4) "I" * (value - 1) else ""
          loop(value % lessThanMap._1, str + lessThanMap._2 + extraStr)
        }
        case value if value <= 0 => str
      }
    }
    loop(n, "")
  }
}
