package exercism

/**
 * Instructions
 * Calculate the Hamming distance between two DNA strands.
 *
 * Your body is made up of cells that contain DNA. Those cells regularly wear out and need replacing, which they achieve by dividing into daughter cells. In fact, the average human body experiences about 10 quadrillion cell divisions in a lifetime!
 *
 * When cells divide, their DNA replicates too. Sometimes during this process mistakes happen and single pieces of DNA get encoded with the incorrect information. If we compare two strands of DNA and count the differences between them we can see how many mistakes occurred. This is known as the "Hamming distance".
 *
 * We read DNA using the letters C, A, G and T. Two strands might look like this:
 *
 * GAGCCTACTAACGGGAT
 * CATCGTAATGACGGCCT
 * ^ ^ ^  ^ ^ ^^
 * They have 7 differences, and therefore the Hamming distance is 7.
 *
 * The Hamming distance is useful for lots of things in science, not just biology, so it's a nice phrase to be familiar with :)
 *
 * Implementation notes
 * The Hamming distance is only defined for sequences of equal length, so an attempt to calculate it between sequences of different lengths should not work.
 *
 * Option is used to indicate a computation that may possibly have no useful result (for example due to an error or invalid input). If you are unfamiliar with Option you may read this tutorial. Option is a so-called Monad which covers a "computational aspect", in this case possible absence of a value. Proper use of Monads can result in very concise yet elegant and readable code. Improper use can easily result in the contrary. Watch this video to learn more.
 */

class HammingDistanceCalculator() {

  def calculateHammingDistance(firstWord: String, secondWord: String): Option[Int] = {
    if (firstWord.length != secondWord.length) {
      None
    }
    else {
      val difference = firstWord.zip(secondWord).count{
        case(a,b) => a != b
      }
      Some(difference)
    }
  }
}
