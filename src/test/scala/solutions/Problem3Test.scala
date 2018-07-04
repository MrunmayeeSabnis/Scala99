package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem3Test extends FunSpec with Matchers{

  describe("Problem3"){
    it("should give the kth element in the list"){
      Problem3.kthElem(2, List(1,2,9,6,5,4)) should be(2)
    }
  }
}

