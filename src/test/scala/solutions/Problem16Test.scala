package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem16Test extends FunSpec with Matchers{

  describe("Problem16"){
    it("should drop the nth element"){
      Problem16.dropNthElem(2, List(1,2,3,4,5)) should be(List(1,3,4,5))
    }
  }
}