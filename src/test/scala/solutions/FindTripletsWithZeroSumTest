package solutions

import org.scalatest.{FunSpec, Matchers}

class FindTripletsWithZeroSumTest extends FunSpec with Matchers {

  describe("FindTripletsWithZeroSum"){
    it("should return empty if passed empty string"){
      FindTripletsWithZeroSum.tripletsWithZeroSum(Nil) should be(Set())
    }

    it("should return valid triplets with 0 sum"){
      FindTripletsWithZeroSum.tripletsWithZeroSum(List(0,-1,2,-3,1)) should be(Set(List(0, -1, 1), List(2, -3, 1)))
    }

    it("should return empty if no triplets with 0 sum"){
      FindTripletsWithZeroSum.tripletsWithZeroSum(List(4,1,4,-2)) should be(Set())
      FindTripletsWithZeroSum.tripletsWithZeroSum(List(0)) should be(Set())
    }

  }
}
