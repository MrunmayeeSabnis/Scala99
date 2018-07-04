package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem11Test extends FunSpec with Matchers{

  describe("Problem11"){
    it("should duplicate the elements n times"){
      Problem11.encodeModified(List('a', 'a', 'b', 'b', 'b', 'c')) should be(List((2, 'a'), (3, 'b'), ('c')))
    }
  }
}

