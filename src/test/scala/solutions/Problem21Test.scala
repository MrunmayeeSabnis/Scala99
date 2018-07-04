package solutions

import org.scalatest.{FunSpec, Matchers}

class Problem21Test extends FunSpec with Matchers {

  describe("Problem21"){
    it("should insert element at 0 th position"){
      Problem21.insertAt(0, 44, List(1, 2, 3, 4, 5)) should be(List(44, 1, 2, 3, 4, 5))
    }

    it("should insert element at n th position"){
      Problem21.insertAt(2, 44, List(1, 2, 3, 4, 5)) should be(List(1, 2, 44, 3, 4, 5))
    }

    it("should throw exception when inserted at position less than 0"){
      intercept[IndexOutOfBoundsException] {
        Problem21.insertAt(-1, 44, List(1, 2, 3, 4, 5))
      }
    }

    it("should throw exception when inserted at position greater than list's length"){
      intercept[IndexOutOfBoundsException] {
        Problem21.insertAt(6, 44, List(1, 2, 3, 4, 5))
      }
    }
  }
}
