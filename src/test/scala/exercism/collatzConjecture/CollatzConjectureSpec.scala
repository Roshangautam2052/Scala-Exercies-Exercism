package exercism.collatzConjecture

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CollatzConjectureSpec extends AnyWordSpec with Matchers {

  "CollatzConjecture.calculateNumberOfSteps" should {
    "return 9 if n = 12" in {
      val collatzConjecture = new CollatzConjecture
      val number: Int = 12
      collatzConjecture.calculateNumberOfSteps(12) shouldBe Some(9)
    }
    "return Some(0) if n = 1" in {
      val collatzConjecture = new CollatzConjecture
      val number: Int = 1
      collatzConjecture.calculateNumberOfSteps(number) shouldBe Some(0)
    }
    "return Some(152) if n = 1000000" in {
      val collatzConjecture = new CollatzConjecture
      val number: Int = 1000000
      collatzConjecture.calculateNumberOfSteps(number) shouldBe Some(152)
    }
    "return None if n = 0" in {
      val collatzConjecture = new CollatzConjecture
      val number: Int = 0
      collatzConjecture.calculateNumberOfSteps(number) shouldBe None
    }
    "return None if n is negative" in {
      val collatzConjecture = new CollatzConjecture
      val number: Int = -13
      collatzConjecture.calculateNumberOfSteps(number) shouldBe None
    }
  }

}


