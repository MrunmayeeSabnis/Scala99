package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem19Test extends FunSpec with Matchers{

  describe("Problem19"){
    it("should rotate the list"){
      Problem19.rotate(3, List('a', 'b', 'c', 'd', 'e', 'f')) should be(List('d', 'e', 'f', 'a', 'b', 'c'))
    }
  }
}

