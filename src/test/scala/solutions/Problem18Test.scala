package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem18Test extends FunSpec with Matchers {
  describe("Problem18"){
    it("should extract a slice from the list"){
      val problem18 = new Problem18
      problem18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g))
    }
  }
}