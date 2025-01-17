package exercism.secretHandshake

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class DecimalToBinaryConverterSpec extends AnyWordSpec with Matchers{
    val decimalToBinaryConverter: DecimalToBinaryConverter = DecimalToBinaryConverter()

  "DecimalToBinaryConverter.convertDecimalToBinary" should {
    "return an error message if the input number exceeds 31" in {
      val number:Int = 100
      decimalToBinaryConverter.convertDecimalToBinary(number) shouldBe Left(s"The number: $number is out of range from 1 to 31")
    }
    "return an error message if the input number is negative" in {
      val negativeNumber:Int = -299
      decimalToBinaryConverter.convertDecimalToBinary(negativeNumber) shouldBe Left(s"The number: $negativeNumber is out of range from 1 to 31")
    }
    "return a reverted binary equivalent 8: (1000)  if the input number is 8 " in {
      val inputNumber = 8
      decimalToBinaryConverter.convertDecimalToBinary(inputNumber) shouldBe Right(List(1,0,0,0))
    }
    "return a reverted binary equivalent 4:(100)  if the input number is 4 " in {
      val inputNumber = 4
      decimalToBinaryConverter.convertDecimalToBinary(inputNumber) shouldBe Right(List(1,0,0))
    }
    "return a reverted binary equivalent of 9:(1001) if the input number is 9 " in {
      val inputNumber = 9
      decimalToBinaryConverter.convertDecimalToBinary(inputNumber) shouldBe Right(List(1,0, 0, 1))
    }
    "return a reverted binary equivalent of 26:(11010) if the input number is 26 " in {
      val inputNumber = 26
      decimalToBinaryConverter.convertDecimalToBinary(inputNumber) shouldBe Right(List(1,1,0,1,0))
    }
    "return a reverted binary equivalent of 31:(11111) if the input number is 31 " in {
      val inputNumber = 31
      decimalToBinaryConverter.convertDecimalToBinary(inputNumber) shouldBe Right(List(1,1,1,1,1))
    }

  }
}
