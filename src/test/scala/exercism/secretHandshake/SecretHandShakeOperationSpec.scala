package exercism.secretHandshake

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SecretHandShakeOperationSpec extends AnyWordSpec with Matchers{
 val secretHandShakeOperation = new SecretHandShakeOperation()

  "SecretHandShakeOperation.performSecretHandShake" should {
    "return a List(wink) if the input number is 1 " in {
      val input: Int = 1
      val response = secretHandShakeOperation.performSecretHandShake(input)
      response shouldBe Right(List("wink"))
    }
    "return a List(double blink) if the input number is 2 " in {
      val input: Int = 2
      val response = secretHandShakeOperation.performSecretHandShake(input)
      response shouldBe Right(List("double blink"))
    }
    "return a List(jump) if the input number is 8 " in {
      val input: Int = 8
      val response = secretHandShakeOperation.performSecretHandShake(input)
      response shouldBe Right(List("jump"))
    }
    "return a List(wink, double blink, close your eyes, jump) if the input number is 15 " in {
      val input: Int = 15
      val response = secretHandShakeOperation.performSecretHandShake(input)
      response shouldBe Right(List("wink", "double blink", "close your eyes", "jump"))
    }
    "return a List(double blink, wink) if the input number is 31 " in {
      val input: Int = 31
      val response = secretHandShakeOperation.performSecretHandShake(input)
      response shouldBe Right(List("jump", "close your eyes", "double blink", "wink"))
    }
    "return a List() if the input number is 0 " in {
      val input: Int = 16
      val response = secretHandShakeOperation.performSecretHandShake(input)
      response shouldBe Right(List())
    }

  }
}
