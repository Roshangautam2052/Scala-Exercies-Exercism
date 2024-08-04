package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TwoferSpec extends AnyWordSpec with Matchers{
  val emptyName:String = ""
  val notEmptyName:String = "Alice"
  val twoferObject = new Twofer

  "Twofer.twofer" should {
    "return One for you, one for me " when {
      "the name is empty" in {
        twoferObject.twofer(emptyName) shouldBe s"One for you, one for me."
      }
    }
    "return One for you name, one for me " when {
      "the name is not empty" in {
        twoferObject.twofer(notEmptyName) shouldBe s"One for $notEmptyName, one for me."
      }
    }
  }


}
