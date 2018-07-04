package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem12Test extends FunSpec with Matchers{

  describe("Problem12"){
    it("should decode the elements"){
      Problem12.decode(List((2, 'a'), (3, 'b'), (1, 'c'))) should be(List('a', 'a', 'b', 'b', 'b', 'c'))
    }
  }
}

