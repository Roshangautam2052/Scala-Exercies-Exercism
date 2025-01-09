package exercism

/**
 * Introduction
 * You work for a company that makes an online multiplayer game called Lexiconia.
 *
 * To play the game, each player is given 13 letters, which they must rearrange to create words. Different letters have different point values, since it's easier to create words with some letters than others.
 *
 * The game was originally launched in English, but it is very popular, and now the company wants to expand to other languages as well.
 *
 * Different languages need to support different point values for letters. The point values are determined by how often letters are used, compared to other letters in that language.
 *
 * For example, the letter 'C' is quite common in English, and is only worth 3 points. But in Norwegian it's a very rare letter, and is worth 10 points.
 *
 * To make it easier to add new languages, your team needs to change the way letters and their point values are stored in the game.
 *
 * Instructions
 * Your task is to change the data format of letters and their point values in the game.
 *
 * Currently, letters are sto
 */
object ETL {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    val transformedMap: Iterable[Map[String, Int]] = scoreMap map {
      case(k, v) => (for(value <- v ) yield (value.toLowerCase(), k)).toMap
    }
    transformedMap.flatten.toMap
  }
}
