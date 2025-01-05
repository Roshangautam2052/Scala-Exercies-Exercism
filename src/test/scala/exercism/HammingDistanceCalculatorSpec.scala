package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HammingDistanceCalculatorSpec extends AnyWordSpec with Matchers {

  val hammingDistanceCalculator = new HammingDistanceCalculator()

  "HammingDistanceCalculator.calculateHammingDistance" should {
    "return Some(0) when the two strings are empty" in {
      val firstWord = ""
      val secondWord = ""
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(0)
    }
    "return Some(0) when the two strings are short-identical" in {
      val firstWord = "A"
      val secondWord = "A"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(0)
    }
    "return Some(0) when the two strings are long-identical" in {
      val firstWord = "GGACTGA"
      val secondWord = "GGACTGA"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(0)
    }
    "return Some(1) when the two strings are short non-identical" in {
      val firstWord = "A"
      val secondWord = "G"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(1)
    }
    "return Some(2) when the two strings are complete distance in small strands" in {
      val firstWord = "AG"
      val secondWord = "CT"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(2)
    }
    "return Some(1) when the two strings have small distance" in {
      val firstWord = "GGACG"
      val secondWord = "GGTCG"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(1)
    }
    "return Some(2) when the two strings are small distance in long strands" in {
      val firstWord = "ACCAGGG"
      val secondWord = "ACTATGG"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(2)
    }
    "return Some(1) when the two strings have non-unique character in first Strand" in {
      val firstWord = "AAG"
      val secondWord = "AAA"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(1)
    }
    "return Some(2) when the two strings are in different positions" in {
      val firstWord = "TAG"
      val secondWord = "GAT"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(2)
    }
    "return Some(9) when the two strings are large distance" in {
      val firstWord = "GGACGGATTCTG"
      val secondWord = "AGGACGGATTCT"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe Some(9)
    }
    "return None when the two strings are of unequal length" in {
      val firstWord = "AATG"
      val secondWord = "AAA"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe None
    }
    "return None when the two strings are empty" in {
      val firstWord = "AGTG"
      val secondWord = "ATA"
      val length = hammingDistanceCalculator.calculateHammingDistance(firstWord, secondWord)
      length shouldBe None
    }
  }


}
