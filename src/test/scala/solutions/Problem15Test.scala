package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem15Test extends FunSpec with Matchers{

  describe("Problem15"){
    it("should duplicate the elements n times"){
      Problem15.duplicateN(3,List(1,2,3)) should be(List(1, 1, 1, 2, 2, 2, 3, 3, 3))
    }
  }
}