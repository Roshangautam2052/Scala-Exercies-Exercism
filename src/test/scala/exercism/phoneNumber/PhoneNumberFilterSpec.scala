package exercism.phoneNumber

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class PhoneNumberFilterSpec extends AnyFreeSpec with Matchers{

  val phoneNumberFilter: PhoneNumberFilter.type = PhoneNumberFilter
  val lengthOfPhoneNumber = 10
  val validCharactersRegex =  """^[2-9][0-9]{2}[2-9][0-9]{6}$"""


  "PhoneNumberFilter.cleanPhoneNumber" -{
    "should return None if the input is empty" in  {
      val emptyString = ""
      val result = phoneNumberFilter.cleanPhoneNumber(emptyString)
      result shouldBe None
    }
    "should return None if the length of input is greater than 10 " in  {
      val emptyString = "613-995-025312423243"
      val result = phoneNumberFilter.cleanPhoneNumber(emptyString)
      result shouldBe None
    }
    "should return None if the length of input is less than 10 " in  {
      val emptyString = "613-995"
      val result = phoneNumberFilter.cleanPhoneNumber(emptyString)
      result shouldBe None
    }
    "should return None if the input does not match the regex pattern " in  {
      val emptyString = "+10,123,4,56789"
      val result = phoneNumberFilter.cleanPhoneNumber(emptyString)
      result shouldBe None
    }
    "should return the phoneNumber after filtering country code and special characters " in  {
      val emptyString = "+1 (613)-995-0253"
      val result = phoneNumberFilter.cleanPhoneNumber(emptyString)
      result shouldBe Some("6139950253")
    }
  }
  "PhoneNumberFilter.filterOutCountryCodeAndPunctuation" - {
    "should filter out countryCode from the string" in {
        val samplePhoneNumber:String = "+1(613)-995-0253"
        val result = phoneNumberFilter.filterOutCountryCodeAndPunctuation(samplePhoneNumber)
        result shouldBe("6139950253")
    }
    "should filter out special characters from the phoneNumber" in {
      val samplePhoneNumber:String = "+1(6,1&*@£$%^& 3)-995, 0, 253"
      val result = phoneNumberFilter.filterOutCountryCodeAndPunctuation(samplePhoneNumber)
      result shouldBe("6139950253")
    }
    "should filter out spaces from the phoneNumber" in {
      val samplePhoneNumber:String = "1 613 995 0253"
      val result = phoneNumberFilter.filterOutCountryCodeAndPunctuation(samplePhoneNumber)
      println(result)
      result shouldBe("6139950253")
    }

  }







}
