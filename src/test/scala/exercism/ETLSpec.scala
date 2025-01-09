package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec



class ETLSpec extends AnyWordSpec with Matchers{
   val etl: ETL.type = ETL

  "ETL.transform" should {
    "return a single transformed sequence when the sequence has only one letter" in {
      val singleLetterMap: Map[Int, Seq[String]] = Map(1 -> Seq("A"))
      etl.transform(singleLetterMap) shouldBe Map("a" -> 1)
    }
    "return a multiple score with multiple letters transformed sequence when the sequence has multiple letters" in {
      val singleScoreWithMultipleLettersMap: Map[Int, Seq[String]] = Map(1 -> Seq("A", "E", "I", "O", "U"))
      etl.transform(singleScoreWithMultipleLettersMap) shouldBe Map("a" -> 1, "e" -> 1, "i" -> 1, "o" -> 1, "u" -> 1)
    }
    "return a multiple scores with different numbers of letters  sequence when the sequence has multiple letters letter" in {
      val multipleScoresMap: Map[Int, Seq[String]] = Map(1 -> Seq("A", "E"), 2 -> Seq("D", "G"))
      etl.transform(multipleScoresMap) shouldBe Map("a" -> 1, "d" -> 2, "e" -> 1, "g" -> 2)
    }
    "return a multiple scores with large  numbers of letters " in {
      val multipleScoresMap: Map[Int, Seq[String]] = Map(1 -> Seq("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"),
        2 -> Seq("D", "G"), 3 -> Seq("B", "C", "M", "P"), 4 -> Seq("F", "H", "V", "W", "Y"),
        5 -> Seq("K"), 8 -> Seq("J", "X"), 10 -> Seq("Q", "Z"))
      etl.transform(multipleScoresMap) shouldBe Map("a" -> 1,
        "b" -> 3, "c" -> 3, "d" -> 2, "e" -> 1, "f" -> 4, "g" -> 2, "h" -> 4,
        "i" -> 1, "j" -> 8, "k" -> 5, "l" -> 1, "m" -> 3, "n" -> 1, "o" -> 1,
        "p" -> 3, "q" -> 10, "r" -> 1, "s" -> 1, "t" -> 1, "u" -> 1, "v" -> 4,
        "w" -> 4, "x" -> 8, "y" -> 4, "z" -> 10)
    }
  }

}
