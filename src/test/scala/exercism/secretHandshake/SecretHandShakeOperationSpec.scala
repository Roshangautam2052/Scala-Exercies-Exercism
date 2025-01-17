package exercism.secretHandshake

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SecretHandShakeOperationSpec extends AnyWordSpec with Matchers{
 val secretHandShakeOperation = new SecretHandShakeOperation()

  "SecretHandShakeOperation.performSecretHandShake" should {
    "return an error if the input number is greater than 31" in {
      val input: Int = 33
      val response = secretHandShakeOperation.performSecretHandShake(input).fold(s)
      response shouldBe Left(s"An exception occurred due to this error:")
    }
  }
}
