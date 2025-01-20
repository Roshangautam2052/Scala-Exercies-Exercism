package exercism.robotName

object RobotCache {
 var robotExistingStream: List[String] = List.empty[String]
 def findName(name:String):Boolean ={
   robotExistingStream.contains(name)
 }
 def addName(name:String):String = {
  robotExistingStream = name :: robotExistingStream
   s"$name Added Successfully"
 }

}
