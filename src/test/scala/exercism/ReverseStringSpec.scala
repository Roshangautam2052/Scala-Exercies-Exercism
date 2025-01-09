package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ReverseStringSpec extends AnyWordSpec with Matchers{
  val reverseString: ReverseString = new ReverseString()

  "ReverseString.reverse" should {
    "return an empty string when the string is empty" in {
      val emptyString:String = ""
      reverseString.reverse(emptyString) shouldBe ""
    }
    "return desserts  when the string is stressed" in {
      val nonEmptyString:String = "stressed"
      reverseString.reverse(nonEmptyString) shouldBe "desserts"
    }
    "return sports  when the string is strops" in {
      val nonEmptyString:String = "strops"
      reverseString.reverse(nonEmptyString) shouldBe "sports"
    }
    "return racecar  when the string is racecar" in {
      val nonEmptyString:String = "racecar"
      reverseString.reverse(nonEmptyString) shouldBe "racecar"
    }

  }

}
