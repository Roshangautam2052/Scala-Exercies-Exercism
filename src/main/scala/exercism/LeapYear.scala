package exercism

/**
 * Introduction
 * A leap year (in the Gregorian calendar) occurs:
 *
 * In every year that is evenly divisible by 4.
 * Unless the year is evenly divisible by 100, in which case it's only a leap year if the year is also evenly divisible by 400.
 * Some examples:
 *
 * 1997 was not a leap year as it's not divisible by 4.
 * 1900 was not a leap year as it's not divisible by 400.
 * 2000 was a leap year!
 * Note
 * For a delightful, four-minute explanation of the whole phenomenon of leap years, check out this YouTube video.
 *
 * Instructions
 * Your task is to determine whether a given year is a leap year.
 *
 * Try to avoid code repetition, use private helper functions if you can.
 *
 * And you might consider using a single Boolean expression instead of if-else for better readability. See here on how this could be done (the link is for Java, but of course the logic is valid for Scala, too).
 */
class LeapYear {

  def validateLeapYear(year:Int): Boolean = {
    if(year % 100 == 0){
      year % 400 == 0
    }
    else year % 4 ==0
  }

}
