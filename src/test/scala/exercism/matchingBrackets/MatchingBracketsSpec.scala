package exercism.matchingBrackets

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MatchingBracketsSpec extends AnyWordSpec with Matchers{
   "MatchingBrackets.isPaired" should {
     "return true if the string contains matching brackets" in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "{what is (42)}?"
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
     "return false if the string does not contain matching brackets" in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "[Text}?"
       testMatchingBrackets.isPaired(testString) shouldBe(false)
     }
     "return false if the string is empty" in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = ""
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
     "return true if the string contains matching brackets for {}" in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "{}{{}}?"
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
     "return true if the string contains matching brackets for []" in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "[]?"
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
     "return false if the string contains un match brackets for []" in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "[[[[[]]]]]]][[[[]?"
       testMatchingBrackets.isPaired(testString) shouldBe(false)
     }
     "return true if the string contains matched brackets " in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "(((185 + 223.85) * 15) - 543)/2"
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
     "return true if the string contains complex matched brackets " in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "\\left(\\begin{array}{cc} \\frac{1}{3} & x\\ \\mathrm{e}^{x} &... x^2 \\end{array}\\right)"
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
     "return false if the string contains unpaired brackets " in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "[["
       testMatchingBrackets.isPaired(testString) shouldBe(false)
     }
     "return false if the string contains wrong ordered brackets " in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "}{"
       testMatchingBrackets.isPaired(testString) shouldBe(false)
     }
     "return false if the string paired but wrong nested brackets " in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "[({]})"
       testMatchingBrackets.isPaired(testString) shouldBe(false)
     }
     "return true if the string are paired properly " in {
       val testMatchingBrackets = new MatchingBrackets()
       val testString = "{}[]"
       testMatchingBrackets.isPaired(testString) shouldBe(true)
     }
   }

}
