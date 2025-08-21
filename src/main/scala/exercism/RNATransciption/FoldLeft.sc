import scala.annotation.tailrec

@tailrec
def operation(list:List[Int], result:Int):Int = {
  list match {
    case Nil  => result
    case head :: tail => operation(tail, result+ head)
  }
}

val list = List.range(1,6)
operation(list, 0)

// What if we want to generalise this to find the product
@tailrec
def operation2(list:List[Int], f:(Int, Int) => Int, result:Int):Int = {
  list match  {
    case Nil  => result
    case head :: tail  => operation2(tail, f, f(result, head))
  }
}

val sum = (a:Int, b:Int) => a + b

val product = (a:Int, b:Int) => a * b


operation2(List.range(1,6), product, 1)
operation2(List.range(1,6), sum, 1)

list.foldLeft(0)((result:Int, head:Int) => sum(result, head))
list.foldLeft(0)((result:Int, head:Int) => product(result, head))


class SalaryComponent(val componentType:String, val amountPercentage:Double)

val houseRentAllowance = new SalaryComponent("benefit", 40)
val medicalAllowance = new SalaryComponent("benefit", 5)
val pension = new SalaryComponent("deduction", 3)
val incomeTax = new SalaryComponent("deduction", 20)

val components: List[SalaryComponent] = List(houseRentAllowance, medicalAllowance, pension, incomeTax)

val baseSalary:Double = 15000

components.foldLeft(baseSalary){(salary:Double, component:SalaryComponent) =>
  component.componentType match  {
    case "benefit" => salary *(1 + component.amountPercentage/100)
    case "deduction" => salary *(1 - component.amountPercentage/100)
  }
}

