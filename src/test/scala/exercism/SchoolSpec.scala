package exercism

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SchoolSpec extends AnyWordSpec with Matchers {
  val emptySchool = new School
  val nonEmptySchool = new School
  emptySchool.roster = Map()
  nonEmptySchool.roster = Map(1 -> Seq("Hari", "Alex", "Shiva", "Bishnu"),
    2 -> Seq("Madan", "Pari", "Lahure"), 3 -> Seq("Sita", "Laxman"),
    4 -> Seq("Mandashree", "IchhaPanreu")
  )

  "School.add" should {
    "return 'Ok.' sequence when the entry does not exists  in the map " in {
      val name = "John"
      val grade = 2
      emptySchool.add(name, grade) shouldBe "Ok."
    }
    "return Student 'name' is already enrolled in grade 'grade',when the entry already exits in the Sequence" in {
      val name = "Sita"
      val grade = 3
      nonEmptySchool.add(name, grade) shouldBe s"Student $name is already enrolled in grade $grade."
    }

  }
  "School.grade" should {
    "return an empty Sequence when the roster is empty in the given grade" in {
      nonEmptySchool.grade(10) shouldBe Seq()
    }
    "return a non empty Sequence when the roster is not empty in the given grade" in {
      nonEmptySchool.grade(2) shouldBe Seq("Madan", "Pari", "Lahure")
    }
    "return a non empty Sequence when the roster is not empty in for any other grade" in {
      nonEmptySchool.grade(4) shouldBe Seq("Mandashree", "IchhaPanreu")
    }
  }
  "School.sorted" should {
      "return an empty sequence when the roster is empty" in {
        emptySchool.sorted shouldBe Map()
      }
      "return an non-empty sorted sequence when the roster is non empty" in {
        nonEmptySchool.sorted shouldBe Map(
          1 -> Seq("Alex", "Bishnu", "Hari", "Shiva"),
          2 -> Seq("Lahure", "Madan", "Pari"),
          3 -> Seq("Laxman", "Sita"),
          4 -> Seq("IchhaPanreu", "Mandashree")
        )

      }
    }
}
