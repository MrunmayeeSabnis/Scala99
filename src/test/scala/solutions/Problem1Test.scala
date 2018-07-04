package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem1Test extends FunSpec with Matchers{

  describe("Problem1"){
    it("should give the last element of the list"){
      Problem1.last(List('a', 'a', 'b', 'b', 'b', 'c')) should be('c')
    }
  }
}

