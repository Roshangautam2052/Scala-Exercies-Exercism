package exercism.armstrongNumber

import scala.annotation.tailrec
import scala.math.pow

/**
 * Instructions:
 * An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
 *
 * For example:
 *
 * 9 is an Armstrong number, because 9 = 9^1 = 9
 * 10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
 * 153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
 * Write some code to determine whether a number is an Armstrong number.
 */
 class ArmstrongNumbers {

  def isArmstrongNumber(number: Int): Boolean = {
    val numberLength = number.toString.length
    @tailrec
    def checkArmStrongNumber(n:Int, sum:Int): Boolean = {
      val remainder:Int = n % 10
      val quotient = n / 10
      if(remainder == 0) {
        if(number == sum) return true else return false
      }
      checkArmStrongNumber(quotient, sum + pow(remainder, numberLength).toInt)

    }
    checkArmStrongNumber(number, 0)

  }

}
