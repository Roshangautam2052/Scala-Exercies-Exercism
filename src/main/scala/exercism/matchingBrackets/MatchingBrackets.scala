package exercism.matchingBrackets

import scala.util.matching.Regex

/**
 * Problem Statement:
 * Introduction
 * You're given the opportunity to write software for the Bracketeer™, an ancient but powerful mainframe. The software that runs on it is written in a proprietary language. Much of its syntax is familiar, but you notice lots of brackets, braces and parentheses. Despite the Bracketeer™ being powerful, it lacks flexibility. If the source code has any unbalanced brackets, braces or parentheses, the Bracketeer™ crashes and must be rebooted. To avoid such a scenario, you start writing code that can verify that brackets, braces, and parentheses are balanced before attempting to run it on the Bracketeer™.
 *
 * Instructions
 * Given a string containing brackets [], braces {}, parentheses (), or any combination thereof, verify that any and all pairs are matched and nested correctly. Any other characters should be ignored. For example, "{what is (42)}?" is balanced and "[text}" is not.
 */
class MatchingBrackets {

  def isPaired(brackets: String): Boolean = {
    if (brackets.isEmpty) true
    else {
      val bracketsOnly: Regex = new Regex("[^{}\\[\\]()]*")
      val filteredString: String = bracketsOnly.replaceAllIn(brackets, "")
      applyBracketRule(filteredString)
    }
  }
  private def applyBracketRule(filteredString: String): Boolean = {
    // Stack to keep track of opening brackets
    val stack = scala.collection.mutable.Stack[Char]()
    // Map of matching pairs
    val pairs = Map(')' -> '(', ']' -> '[', '}' -> '{')
    // Iterate through each character in the filtered string
    for (char <- filteredString) {
      char match {
        case '{' | '[' | '(' => stack.push(char) // Push opening brackets onto the stack
        case '}' | ']' | ')' =>
          // If stack is empty or top of stack doesn't match the closing bracket, return false
          if (stack.isEmpty || stack.pop() != pairs(char)) return false
        case _ =>
      }
    }
    // Ensure all brackets are paired (stack should be empty)
    stack.isEmpty
  }

}

