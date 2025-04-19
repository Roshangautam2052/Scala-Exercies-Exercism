package exercism.bankAccount

import exercism.bankAccount.models.{Country, Nationality}

import java.util.Date

abstract case class Person(){
  val firstName:String
  val middleName:Option[String]
  val lastName:String
  val dateOfBirth:Date
  val nationality:Nationality
  val countryOfResidency: Country

}
