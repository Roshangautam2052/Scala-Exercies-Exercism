package exercism.clock

class Clock(val hour: Int, val minute: Int) {
  def +(c: Clock): Clock = Clock(this.hour + c.hour, this.minute + c.minute)
  def -(c: Clock): Clock = Clock(this.hour - c.hour, this.minute - c.minute)
  override def toString = s"$hour:$minute"
  override def equals(obj: Any): Boolean = this.toString == obj.toString
}
object Clock {
  def apply(hour: Int, minute: Int): Clock = new Clock((hour + Math.floorDiv(minute, 60)) - Math.floorDiv(hour + Math.floorDiv(minute, 60), 24) * 24, Math.floorMod(minute, 60))
  def apply(minute: Int): Clock = new Clock(0, minute)
}
