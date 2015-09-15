package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem4Test extends FunSpec with Matchers{

  describe("Problem4"){
    it("should give the length of the list"){
      val problem4 = new Problem4
      problem4.length(List('a', 'a', 'b', 'b', 'b', 'c')) should be(6)
    }
  }
}

