package exercism.bankAccount.models

sealed abstract class Nationality(name: String)

object Nationality {
  case object Nepal extends Nationality("Nepalese")

  case object UK extends Nationality("British")

  case object USA extends Nationality("American")

  case object India extends Nationality("Indian")

  case object Japan extends Nationality("Japanese")
}


