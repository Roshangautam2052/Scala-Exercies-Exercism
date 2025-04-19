package exercism.bankAccount

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class BankAccountSpec extends AnyWordSpec with Matchers {

  val noInitialDepositBankAccount: BankAccount = BankAccount.openAccount(None)
  implicit lazy val someInitialDepositBankAccount: BankAccount = BankAccount.openAccount(Some(100))

  "openingAccount" should {

    val initialDeposit = 100

    "return a BankAccount with balance None when initial deposit is None" in {
      BankAccount.openAccount(None).getBalance shouldBe None
    }

    "return a BankAccount with balance 100 when initial deposit is 100" in {
      BankAccount.openAccount(Some(initialDeposit)).getBalance shouldBe Some(100)
    }
  }


  "getBalance" should {

    "return None when the bank account has no initial deposit " in  {
      noInitialDepositBankAccount.getBalance shouldBe None
    }

    "return some deposit when the bank account has some initial deposit " in  {
     someInitialDepositBankAccount.getBalance shouldBe Some(100)
    }
  }

  "incrementBalance" should {

    "return currentBalance of 100 when the incrementBalance is 100 and bank account has no initial deposit  " in  {
        noInitialDepositBankAccount.incrementBalance(100) shouldBe Some(100)
    }

    "return currentBalance of 200 when the bank account has some initial deposit of 100 " in  {
      someInitialDepositBankAccount.incrementBalance(100) shouldBe Some(200)
    }
  }

  "closeAccount" should {

    "close the account returning None when the bank has someInitialDeposit  " in  {
      noInitialDepositBankAccount.closeAccount() shouldBe  s"Your account has been closed"
    }

    "close the account returning None when the bank has no Initial Deposit  " in  {
      someInitialDepositBankAccount.closeAccount() shouldBe  s"Your account has been closed"
    }

  }


}
