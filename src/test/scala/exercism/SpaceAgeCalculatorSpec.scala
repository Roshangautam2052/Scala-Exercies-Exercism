package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SpaceAgeCalculatorSpec extends AnyWordSpec with Matchers {
  val earthOrbitalPeriod: Double = 365.2425

  val calculateSpaceAge = new CalculateSpaceAge

  "CalculateSpaceAge.spaceAgeCalculator" should {
    "return age in mercury" when {
      "given planet is mercury " in {
        val planet:String = "Mercury"
        val ageInSeconds:Int = 2134835688
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 280.88
      }
    }
    "return age in venus" when {
      "given planet is venus " in {
        val planet:String = "Venus"
        val ageInSeconds:Int = 189839836
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 9.78
      }
    }
    "return age in earth" when {
      "given planet is earth " in {
        val planet:String = "Earth"
        val ageInSeconds:Int = 1000000000
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 31.69
      }
    }
    "return age in mars" when {
      "given planet is mars " in {
        val planet:String = "Mars"
        val ageInSeconds:Double = 2.329871239E9
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 39.25
      }
    }
    "return age in Jupiter" when {
      "given planet is jupiter " in {
        val planet:String = "Jupiter"
        val ageInSeconds:Double = 901876382
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 2.41
      }
    }
    "return age in saturn" when {
      "given planet is saturn" in {
        val planet:String = "Saturn"
        val ageInSeconds:Double = 3.0E9
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 3.23
      }
    }
    "return age in uranus" when {
      "given planet is uranus " in {
        val planet:String = "Uranus"
        val ageInSeconds:Double = 3.210123456E9
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 1.21
      }
    }
    "return age in neptune" when {
      "given planet is neptune " in {
        val planet:String = "Neptune"
        val ageInSeconds:Double = 8.210123456E9
        calculateSpaceAge.spaceAgeCalculator(planet, ageInSeconds) shouldBe 1.58
      }
    }
  }

}
