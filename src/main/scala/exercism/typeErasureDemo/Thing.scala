package exercism.typeErasureDemo

case class Thing[T](value : T){
  def processThing(thing: Thing[_]): String = {
    thing match  {
      case Thing(value:Int) => "Thing of int"
      case Thing(value: String) => "Thing of String"
      case Thing(value:Seq[Int]) => "Thing of Seq[Int]"
      case _ => "Thing of Something else"
    }
  }
}

