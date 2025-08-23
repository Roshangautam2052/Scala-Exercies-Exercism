package exercism.grains

import scala.annotation.tailrec

/**
 *
 */
object GrainsCalculator {
 private val base = BigInt(1)
  def square(number:Int):Option[BigInt]= {
    val totalCountAtAGivenSquare = number match  {
      case value if value <= 0 || value > 64 => None
      case _ => Some(base << (number-1))
    }
    totalCountAtAGivenSquare
  }

  def total:BigInt = {
    @tailrec
    def totalCalculator(startValue:Int, acc:BigInt):BigInt = {
      if(startValue > 64)  acc
      else {
        totalCalculator(startValue +1, acc + base << (startValue-1))
      }

    }
    totalCalculator(1, 0)
  }
}
