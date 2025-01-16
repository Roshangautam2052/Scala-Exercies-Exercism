package exercism.robotSimulator

sealed abstract class Bearing (name:String)

object Bearing {
  case object North extends Bearing("North")
  case object South extends Bearing("South")
  case object East extends Bearing("East")
  case object West extends Bearing("West")
}

