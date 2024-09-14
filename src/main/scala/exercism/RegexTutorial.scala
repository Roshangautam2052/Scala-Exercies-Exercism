package exercism

import scala.util.matching.Regex

object RegexTutorial extends App{
  val pattern = "Scala".r
  val str = " Scala is a Scalable and cool"

  println(pattern findFirstIn str)
  // Using Regex constructor
  val pattern2 = new Regex("(S|s)cala")
  val str2 = "scala is scalable  and cool"

  println((pattern2 findAllIn str2).mkString(","))
  println(pattern2 replaceFirstIn(str2, "Java"))
  val exampleString = "       Hello what is         your name ?      "
  val otherString = exampleString.trim()
  println(otherString)
}
