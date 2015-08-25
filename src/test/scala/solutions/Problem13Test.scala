package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem13Test extends FunSpec with Matchers{

  describe("Problem13"){
    it("should encode the elements"){
      val problem13 = new Problem13
      problem13.encodeDirect(List('a', 'a', 'b', 'b', 'b', 'c')) should be(List((2, 'a'), (3, 'b'), (1, 'c')))
    }
  }
}