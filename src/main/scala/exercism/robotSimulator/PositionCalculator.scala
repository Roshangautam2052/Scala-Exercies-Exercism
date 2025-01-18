package exercism.robotSimulator

import scala.annotation.tailrec

/**
 * Instruction:
 * Write a robot simulator.
 *
 * A robot factory's test facility needs a program to verify robot movements.
 *
 * The robots have three possible movements:
 *
 * turn right
 * turn left
 * advance
 * Robots are placed on a hypothetical infinite grid, facing a particular direction (north, east, south, or west) at a set of {x,y} coordinates, e.g., {3,8}, with coordinates increasing to the north and east.
 *
 * The robot then receives a number of instructions, at which point the testing facility verifies the robot's new position, and in which direction it is pointing.
 *
 * The letter-string "RAALAL" means:
 * Turn right
 * Advance twice
 * Turn left
 * Advance once
 * Turn left yet again
 * Say a robot starts at {7, 3} facing north. Then running this stream of instructions should leave it at {9, 4} facing west.
 */

class PositionCalculator {
  def calculatePosition(robot: Robot, positionString: Option[String]): Robot = {
    positionString match {
      case Some(value) => calculateFinalPosition(robot, value)
      case None => robot
    }
  }
  private def calculateFinalPosition(robot: Robot, positionString: String): Robot = {
    @tailrec
    def calculator(robot: Robot, positionString: String): Robot = {
      if (positionString.isEmpty) {
        return robot
      }
      val currentChar = positionString.head
      val remainingString = positionString.tail
      currentChar match {
        case 'R' =>
          val newBearing = robot.bearing match {
            case Bearing.North => Bearing.East
            case Bearing.South => Bearing.West
            case Bearing.East => Bearing.South
            case Bearing.West => Bearing.North
          }
          calculator(Robot(newBearing, robot.position), remainingString)
        case 'A' =>
          val newPosition = robot.bearing match {
            case Bearing.North => (robot.position._1, robot.position._2 + 1)
            case Bearing.South => (robot.position._1, robot.position._2 - 1)
            case Bearing.East => (robot.position._1 + 1, robot.position._2)
            case Bearing.West => (robot.position._1 - 1, robot.position._2)
          }
          calculator(Robot(robot.bearing, newPosition), remainingString)

        case 'L' =>
          val newBearing = robot.bearing match {
            case Bearing.North => Bearing.West
            case Bearing.South => Bearing.East
            case Bearing.East => Bearing.North
            case Bearing.West => Bearing.South
          }
          calculator(Robot(newBearing, robot.position), remainingString)
        case _ => calculator(robot, remainingString)
      }
    }
    calculator(robot, positionString)
  }
}
