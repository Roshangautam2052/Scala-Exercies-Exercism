package exercism.robotSimulator

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RobotSimulatorSpec extends AnyWordSpec with Matchers{
  val positionCalculator = new PositionCalculator()
  "PositionCalculator.calculatePosition" should {
    "return the robot with the same  position and direction if positionString is not given" in {
      val bearing = Bearing.North
      val testRobot = Robot(bearing, (0, 0))
      positionCalculator.calculatePosition(testRobot, None) shouldBe testRobot
    }
    "return the robot with the same negative position and direction if positionString is not given" in {
      val bearing = Bearing.South
      val testRobot = Robot(bearing, (-1, -1))
      positionCalculator.calculatePosition(testRobot, None) shouldBe testRobot
    }
    "return the robot with the Bearing 'East' if initial Bearing is North and positionString is only 'R'" in {
      val bearing = Bearing.North
      val testRobot = Robot(bearing,(0, 0))
      val finalRobot = Robot(Bearing.East, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("R")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'South' if initial Bearing is East and positionString is only 'R'" in {
      val testRobot = Robot(Bearing.East,(0, 0))
      val finalRobot = Robot(Bearing.South, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("R")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'North' if initial Bearing is West and positionString is only 'R'" in {
      val testRobot = Robot(Bearing.West,(0, 0))
      val finalRobot = Robot(Bearing.North, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("R")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'West' if initial Bearing is South and positionString is only 'R'" in {
      val testRobot = Robot(Bearing.South,(0, 0))
      val finalRobot = Robot(Bearing.West, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("R")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'East' if initial Bearing is South and positionString is only 'L'" in {
      val testRobot = Robot(Bearing.South,(0, 0))
      val finalRobot = Robot(Bearing.East, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("L")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'South' if initial Bearing is West and positionString is only 'L'" in {
      val testRobot = Robot(Bearing.West,(0, 0))
      val finalRobot = Robot(Bearing.South, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("L")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'North' if initial Bearing is East and positionString is only 'L'" in {
      val testRobot = Robot(Bearing.East,(0, 0))
      val finalRobot = Robot(Bearing.North, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("L")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'West' if initial Bearing is North and positionString is only 'L'" in {
      val testRobot = Robot(Bearing.North,(0, 0))
      val finalRobot = Robot(Bearing.West, (0, 0))
      positionCalculator.calculatePosition(testRobot, Some("L")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'West' and co-ordinate (-4,1) if initial Bearing is North and positionString is 'LAAARALA'" in {
      val testRobot = Robot(Bearing.North,(0, 0))
      val finalRobot = Robot(Bearing.West, (-4, 1))
      positionCalculator.calculatePosition(testRobot, Some("LAAARALA")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'South' and co-ordinate(-3,-8) if initial Bearing is East with co-ordinate(2,-7) and positionString is 'RRAAAAALA'" in {
      val testRobot = Robot(Bearing.East,(2, -7))
      val finalRobot = Robot(Bearing.South, (-3, -8))
      positionCalculator.calculatePosition(testRobot, Some("RRAAAAALA")) shouldBe finalRobot
    }
    "return the robot with the Bearing 'North' and co-ordinate(11,5) if initial Bearing is South with co-ordinate(8,4) is North and positionString is 'LAAARRRALLLL'" in {
      val testRobot = Robot(Bearing.South,(8, 4))
      val finalRobot = Robot(Bearing.North, (11, 5))
      positionCalculator.calculatePosition(testRobot, Some("LAAARRRALLLL")) shouldBe finalRobot
    }

  }

}
