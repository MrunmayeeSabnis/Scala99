package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem2Test extends FunSpec with Matchers{

  describe("Problem2"){
    it("should give the second last element of the list"){
      val problem2 = new Problem2
      problem2.penultimate(List('a', 'a', 'b', 'b', 'b', 'c')) should be('b')
    }
  }
}

