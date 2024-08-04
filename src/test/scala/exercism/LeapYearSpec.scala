package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class LeapYearSpec extends AnyWordSpec with Matchers {

  val leapYearObject = new LeapYear

  "LeapYear.validateLeapYear" should {
    "return true" when {
      "the give year is leap Year" in {
        val leapYear: Int = 2000
        assert(leapYearObject.validateLeapYear(leapYear))
      }
    }
    "return false" when {
      "the give year is not leap Year" in {
        val notLeapYear: Int = 1900
        leapYearObject.validateLeapYear(notLeapYear) shouldBe false
      }
    }
    "return false" when {
      "the give year is not leap Year which is not divisible by 4" in {
        val notLeapYearDividedByFour: Int = 1997
        leapYearObject.validateLeapYear(notLeapYearDividedByFour) shouldBe false
      }
    }
  }
}
