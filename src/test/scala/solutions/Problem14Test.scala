package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem14Test extends FunSpec with Matchers{

  describe("Problem14"){
    it("should duplicate the elements"){
      val problem14 = new Problem14
      problem14.duplicate(List(1,2,3)) should be(List(1, 1, 2, 2, 3, 3))
    }
  }
}