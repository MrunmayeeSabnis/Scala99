package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem18Test extends FunSpec with Matchers {
  describe("Problem18"){
    it("should extract a slice from the list"){
      Problem18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g))
    }
  }
}