package exercism.robotName

import com.mifmif.common.regex.Generex

/**
 * InManage robot factory settings.
 *
 * When a robot comes off the factory floor, it has no name.
 *
 * The first time you turn on a robot, a random name is generated in the format of two uppercase letters followed by three digits, such as RX837 or BC811.
 *
 * Every once in a while we need to reset a robot to its factory settings, which means that its name gets wiped. The next time you ask, that robot will respond with a new random name.
 *
 * The names must be random: they should not follow a predictable sequence. Using random names means a risk of collisions. Your solution must ensure that every existing robot has a unique name.
 *
 * Make sure your solution is general enough to be easily scalable for longer names containing more letters and digits. This usually makes for better code quality, too.
 *
 * Suggestion (this is not explicitly tested): To make sure you always have a unique name you could implement your own cache or use a Stream with its built-in cache.
 */
 class Robot {
  var name: Option[String] = None

  def nameRobot(): Option[String] = {
    val generatedString = new Generex("[A-Z]{2}\\d{3}").random()
    val isNameExists = RobotCache.findName(generatedString)
    if (isNameExists) {
      Some(s"Name:$generatedString already exists ")
    }
    else{
      val feedback = RobotCache.addName(generatedString)
      this.name = Some(generatedString)
      Some(generatedString)
    }
  }

  def reset(): Option[String] = {
    val generatedString = new Generex("^[A-Z]{2}\\d{3}$").random()
    this.name = None
    Some("Name removed successfully")
  }
}




