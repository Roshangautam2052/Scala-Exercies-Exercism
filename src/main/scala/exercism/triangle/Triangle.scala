package exercism.triangle

case class Triangle(a:Double, b:Double, c:Double) {
  def equilateral : Boolean ={
    if (checkIsTriangle()) {
      if (a == b && b == c) true else false
    } else {
      false
    }
  }
  def isosceles : Boolean ={
    if(checkIsTriangle()) {
      if(a == b || b == c || a == c ) true else false
    }
    else false
  }
  def scalene : Boolean = {
    if(checkIsTriangle()){
      if(a != b && b != c && c !=a) true else false
    }
    else false
  }
  private def checkIsTriangle():Boolean = {
    if(a == 0 || b == 0 || c == 0) false
    else if((a + b >=c) && (b + c >= a) && (a + c >=b)){
      true
    }
    else {
      false
    }
  }

}
