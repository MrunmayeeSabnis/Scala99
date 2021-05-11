package solutions

import org.scalatest.{FunSpec, Matchers}

class RomanizeTest extends FunSpec with Matchers {

  describe("Romanize"){

    it("romanize from numbers"){
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

    it("romanize to numbers"){
      Romanize.fromRoman("I") should be(1)
      Romanize.fromRoman("IV") should be(4)
      Romanize.fromRoman("V") should be (5)
      Romanize.fromRoman("VI") should be (6)
      Romanize.fromRoman("IX") should be (9)
      Romanize.fromRoman("X") should be (10)
      Romanize.fromRoman("XIV") should be (14)
      Romanize.fromRoman("XXVI") should be (26)
      Romanize.fromRoman("XL") should be (40)
      Romanize.fromRoman("XLVII") should be (47)
      Romanize.fromRoman("L") should be (50)
      Romanize.fromRoman("LIX") should be (59)
      Romanize.fromRoman("LXVI") should be (66)
      Romanize.fromRoman("XC") should be (90)
      Romanize.fromRoman("C") should be (100)
      Romanize.fromRoman("CCLXX") should be (270)
      Romanize.fromRoman("CD") should be (400)
      Romanize.fromRoman("CDLVIII") should be (458)
      Romanize.fromRoman("D") should be (500)
      Romanize.fromRoman("DCLVII") should be (657)
      Romanize.fromRoman("CM") should be (900)
      Romanize.fromRoman("CMLXXVII") should be (977)
      Romanize.fromRoman("M") should be (1000)
      Romanize.fromRoman("MMVI") should be (2006)
      Romanize.fromRoman("MMMCDLIX") should be (3459)
      Romanize.fromRoman("MMMMMMMMMM") should be (10000)
    }

  }
}
