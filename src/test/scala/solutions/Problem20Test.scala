package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem20Test extends FunSpec with Matchers{

  describe("Problem20"){
    it("should remove nth element from the list"){
      val problem20 = new Problem20
      problem20.removeAt(3, List(1,2,3,4,5)) should be(List(1,2,4,5))
    }
  }
}

