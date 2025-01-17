package exercism.secretHandshake

import scala.annotation.tailrec
/**
 Problem Statement:
 Introduction
You are starting a secret coding club with some friends and friends-of-friends. Not everyone knows each other, so you and your friends have decided to create a secret handshake that you can use to recognize that someone is a member. You don't want anyone who isn't in the know to be able to crack the code.

You've designed the code so that one person says a number between 1 and 31, and the other person turns it into a series of actions.

Instructions
Your task is to convert a number between 1 and 31 to a sequence of actions in the secret handshake.

The sequence of actions is chosen by looking at the rightmost five digits of the number once it's been converted to binary. Start at the right-most digit and move left.

The actions for each number place are:

00001 = wink
00010 = double blink
00100 = close your eyes
01000 = jump
10000 = Reverse the order of the operations in the secret handshake.
Let's use the number 9 as an example:

9 in binary is 1001.
The digit that is farthest to the right is 1, so the first action is wink.
Going left, the next digit is 0, so there is no double-blink.
Going left again, the next digit is 0, so you leave your eyes open.
Going left again, the next digit is 1, so you jump.
That was the last digit, so the final code is:

wink, jump
Given the number 26, which is 11010 in binary, we get the following actions:

double blink
jump
reverse actions
The secret handshake for 26 is therefore:

jump, double blink
 */

class SecretHandShakeOperation {
  val decimalToBinaryConverter: DecimalToBinaryConverter = DecimalToBinaryConverter()
  def performSecretHandShake(secretCode: Int): Either[String, List[String]] = {
    val binaryEquivalentNumber: Either[String, List[Int]] = decimalToBinaryConverter.convertDecimalToBinary(secretCode)
    binaryEquivalentNumber match {
      case Right(list) => mapBinaryEquivalentToActions(list.reverse)
      case Left(error) => Left(s"An exception occurred due to this error: $error")
    }
  }
  private def mapBinaryEquivalentToActions(binaryNumber: List[Int]): Either[String, List[String]] = {
    @tailrec
    def mapInnerActions(acc: List[String], currentList: List[Int], iterator: Int): Either[String, List[String]] = {
      val iteration: Int = iterator + 1
      if(currentList.isEmpty){
        return Right(acc.filter(_.trim.nonEmpty))
      }
      val currentValue: Int = currentList.head
      val remainingList: List[Int] = currentList.tail
      currentValue match {
        case 0 => mapInnerActions("" :: acc, remainingList,iteration)
        case 1 => iteration match {
          case 1 =>  mapInnerActions("wink"::acc, remainingList, iteration)
          case 2 =>  mapInnerActions("double blink"::acc, remainingList, iteration)
          case 3 =>  mapInnerActions("close your eyes"::acc, remainingList, iteration)
          case 4 =>  mapInnerActions("jump"::acc, remainingList, iteration)
          case 5 =>  mapInnerActions(acc.reverse, remainingList, iteration)
        }
      }
    }
    mapInnerActions(List.empty, binaryNumber, 0)
  }


}
