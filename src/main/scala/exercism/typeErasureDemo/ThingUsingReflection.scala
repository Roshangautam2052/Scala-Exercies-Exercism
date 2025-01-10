package exercism.typeErasureDemo


import scala.reflect.runtime.universe._
case class ThingUsingReflection[T](value:T) {
  def processThing[T: TypeTag](thingUsingReflection: ThingUsingReflection[T]):String =
    typeOf[T] match {
      case t if t =:= typeOf[Seq[Int]] => "Thing of Seq[Int]"
      case t if t =:= typeOf[Seq[String]] => "Thing of Seq[String]"
      case t if t =:= typeOf[Int] => "Thing of Int"
      case _ => "Thing of other"
    }
}
