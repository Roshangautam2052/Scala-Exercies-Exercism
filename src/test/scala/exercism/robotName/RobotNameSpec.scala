package exercism.robotName

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.util.matching.Regex

class RobotNameSpec extends AnyWordSpec with Matchers {
  implicit val nameRegex: Regex = "[A-Z]{2}\\d{3}".r


  "Robot.apply" should {
    "return the name of robot with fully matching the Regex " in {
      val testRobot: Robot = new Robot
      val nameRobot = testRobot.nameRobot()
      val isMatch = testRobot.name match {
        case Some(value) if (nameRegex.matches(value)) => true
        case _ => false
      }
      isMatch shouldBe (true)
    }
    "return different names of robot when two robots are named with fully matching the Regex " in {
      val testRobot1: Robot = new Robot
      val testRobot2: Robot = new Robot
      val testRobot1Name: Option[String] = testRobot1.nameRobot()
      val testRobot2Name: Option[String] = testRobot2.nameRobot()
      testRobot2Name shouldNot equal(testRobot1Name)
    }
    "return name of the robot to be none when the robot name is reset " in {
      val testRobot1: Robot = new Robot
      val testRobot1Name: Option[String] = testRobot1.nameRobot()
      val resetRobot = testRobot1.reset()
      testRobot1.name shouldBe (None)
    }
  }
}
