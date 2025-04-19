package exercism.bankAccount.models

sealed abstract  class Country (name:String)

object Country{
  case object UK extends Country("United Kingdom")
  case object Nepal extends Country("Nepal")
  case object Singapore extends Country("Singapore")
  case object India extends Country("India")
  case object China extends Country("China")
}
