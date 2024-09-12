package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class LackadaisicalTeenagerSpec extends AnyWordSpec with Matchers {
  val lackadaisicalTeenager = new LackadaisicalTeenager()
  "LackadaisicalTeenager.determineBobReply" should {
    "return 'Sure' when question is asked when it ends with ?" in {
      val reply = lackadaisicalTeenager.determineBobReply("Every body is kung fu fighting?")
      reply shouldBe "Sure"
    }

    "return 'Whoa,chill out!' when we yell at him and the sentence is all capital letters" in {
      val reply = lackadaisicalTeenager.determineBobReply("DO NOT SHOUT")
      reply shouldBe "Whoa,chill out!"
    }

    "return 'Calm down, I know what I'm doing!' when question is asked" in {
      val reply = lackadaisicalTeenager.determineBobReply("WHAT ARE YOU SAYING ?")
      reply shouldBe "Calm down, I know what I'm doing!"
    }

    "return 'Fine. Be that way!' when there is silence which is various combinations of whitespace" in {
      val reply = lackadaisicalTeenager.determineBobReply("                            ")
      reply shouldBe "Fine. Be that way!"
    }

    "return 'Whatever. when anything is asked" in {
      val reply = lackadaisicalTeenager.determineBobReply("I don't know what to do ")
      reply shouldBe "Whatever."
    }


  }

}
