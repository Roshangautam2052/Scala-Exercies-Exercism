package exercism.collatzConjecture

import scala.annotation.tailrec

class CollatzConjecture {
  def calculateNumberOfSteps(n:Int):Option[Int] = {
    @tailrec
    def countSteps(number:Int, count:Int):Option[Int] = {
      if(number <= 0) return None
      number match {
        case 1 => Some(count)
        case _ => if (number % 2 == 0) countSteps(number/2, count +1) else countSteps(3*number + 1, count +1)
      }
    }
    countSteps(n, 0)
  }

}
