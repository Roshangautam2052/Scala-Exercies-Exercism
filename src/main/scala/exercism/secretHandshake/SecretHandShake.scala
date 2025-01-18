package exercism.secretHandshake

object SecretHandShake extends App{
  val decimalHandShake = new SecretHandShakeOperation()
  val decimalToBinaryConverter = DecimalToBinaryConverter()
  println(decimalHandShake.performSecretHandShake(15))
}
