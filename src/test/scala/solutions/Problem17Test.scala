package solutions

import org.scalatest.{Matchers, FunSpec}

class Problem17Test extends FunSpec with Matchers {
  describe("Problem17"){
    it("should return splitted list"){
      val problem16 = new Problem17
      problem16.split(2, List(6, 1, 9, 2, 8, 3)) should be((List(6, 1), List(9, 2, 8, 3)))
    }
  }
}