package solutions

import org.scalatest.{FunSpec, Matchers}

class RomanizeTest extends FunSpec with Matchers {

  describe("Romanize"){

    it("romanize for"){
      Romanize.toRoman(1) should be("I")
      Romanize.toRoman(4) should be("IV")
      Romanize.toRoman(5) should be("V")
      Romanize.toRoman(6) should be("VI")
      Romanize.toRoman(9) should be("IX")
      Romanize.toRoman(10) should be("X")
      Romanize.toRoman(14) should be("XIV")
      Romanize.toRoman(26) should be("XXVI")
      Romanize.toRoman(40) should be("XL")
      Romanize.toRoman(47) should be("XLVII")
      Romanize.toRoman(50) should be("L")
      Romanize.toRoman(59) should be("LIX")
      Romanize.toRoman(66) should be("LXVI")
      Romanize.toRoman(90) should be("XC")
      Romanize.toRoman(100) should be("C")
      Romanize.toRoman(270) should be("CCLXX")
      Romanize.toRoman(400) should be("CD")
      Romanize.toRoman(458) should be("CDLVIII")
      Romanize.toRoman(500) should be("D")
      Romanize.toRoman(657) should be("DCLVII")
      Romanize.toRoman(900) should be("CM")
      Romanize.toRoman(977) should be("CMLXXVII")
      Romanize.toRoman(1000) should be("M")
      Romanize.toRoman(2006) should be("MMVI")
      Romanize.toRoman(3459) should be("MMMCDLIX")
      Romanize.toRoman(10000) should be("MMMMMMMMMM")
    }

  }
}
