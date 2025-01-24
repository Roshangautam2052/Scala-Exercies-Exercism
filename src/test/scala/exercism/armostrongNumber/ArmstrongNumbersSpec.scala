package exercism.armostrongNumber

import exercism.armstrongNumber.ArmstrongNumbers
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ArmstrongNumbersSpec extends AnyWordSpec with Matchers{
  "ArmstrongNumbers.isArmstrongNumber" should  {
    "return true if the number is 5" in  {
      val armstrongNumber:ArmstrongNumbers = new ArmstrongNumbers
      armstrongNumber.isArmstrongNumber(5) shouldBe(true)
    }
    "return false if the number is 10" in  {
      val armstrongNumber:ArmstrongNumbers = new ArmstrongNumbers
      armstrongNumber.isArmstrongNumber(10) shouldBe(false)
    }
    "return false if the seven digit number is 9926314" in  {
      val armstrongNumber:ArmstrongNumbers = new ArmstrongNumbers
      armstrongNumber.isArmstrongNumber(9926314) shouldBe(false)
    }
    "return false if the four digit number is 9926" in  {
      val armstrongNumber:ArmstrongNumbers = new ArmstrongNumbers
      armstrongNumber.isArmstrongNumber(9926) shouldBe(false)
    }
  }


}
