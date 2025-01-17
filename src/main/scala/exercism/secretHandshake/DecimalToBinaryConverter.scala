package exercism.secretHandshake

import scala.annotation.tailrec

case class DecimalToBinaryConverter() {
  val range: Range.Inclusive = 1 to 31
  val numberList:List[Int] = range.toList

  /**
   * Convert decimal number to a list of binary number
   * @param number (Decimal input number from user)
   * @return  list of binary numbers or error String
   */
    def convertDecimalToBinary(number:Int):Either[String, List[Int]] = {
      if(!numberList.contains(number)) {
        return Left(s"The number: $number is out of range from 1 to 31")
      }
      @tailrec
      def convertToBinary(acc:List[Int], number:Int):Either[String, List[Int]] = {
        if(number == 0){
          Right(acc)
        }
        else {
          val quotient:Int = number % 2
          val remainder:Int = number / 2
          convertToBinary(quotient::acc, remainder)
        }
      }
      convertToBinary(List.empty, number)
    }

}
