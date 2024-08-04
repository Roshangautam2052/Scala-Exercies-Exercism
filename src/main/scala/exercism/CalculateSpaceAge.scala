package exercism

/**
 * Given an age in seconds, calculate how old someone would be on:
 * Mercury: orbital period 0.2408467 Earth years
 * Venus: orbital period 0.61519726 Earth years
 * Earth: orbital period 1.0 Earth years, 365.25 Earth days, or 31557600 seconds
 * Mars: orbital period 1.8808158 Earth years
 * Jupiter: orbital period 11.862615 Earth years
 * Saturn: orbital period 29.447498 Earth years
 * Uranus: orbital period 84.016846 Earth years
 * Neptune: orbital period 164.79132 Earth years
 * So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.
 *
 * If you're wondering why Pluto didn't make the cut, go watch this YouTube video.
 *
 * Note: The actual length of one complete orbit of the Earth around the sun is closer to 365.256 days (1 sidereal year).
 * The Gregorian calendar has, on average, 365.2425 days.
 * While not entirely accurate, 365.25 is the value used in this exercise. See Year on Wikipedia for more ways to measure a year.
 */
class CalculateSpaceAge {
  def spaceAgeCalculator(planet: String, age: Double): Double = {
    val earthOrbitalPeriod: Double = 365.2425
    val ageInYears: Double = (age/(86400 * 365.25))
    planet.toLowerCase() match {
      case "mercury" => BigDecimal(ageInYears/0.2408467).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "venus" =>   BigDecimal(ageInYears / 0.61519726).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "earth" =>   BigDecimal(ageInYears).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "mars" =>    BigDecimal(ageInYears / 1.8808158).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "jupiter" => BigDecimal(ageInYears / 11.862515).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "saturn" =>  BigDecimal(ageInYears / 29.447498).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "uranus" =>  BigDecimal(ageInYears / 84.016846).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case "neptune" => BigDecimal(ageInYears / 164.79132).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      case _ => 404
    }
  }

}
