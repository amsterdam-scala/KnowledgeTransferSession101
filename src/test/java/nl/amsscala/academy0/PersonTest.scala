package nl.amsscala.academy0

import org.scalactic.Equality
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class PersonTest extends FeatureSpec with GivenWhenThen with Matchers {
  implicit val personEqHelper =
    new Equality[JavaPerson] {
      def areEqual(a: JavaPerson, b: Any): Boolean =
        b match {
          case t: ScalaPerson => List(a.getFirstName, a.getLastName, a.getAge) === t.toList
          case _ => false
        }
    }

  feature("Creating and instance") {
    val java42 = new JavaPerson("Frans", "van den Berg", 42)
    val scala42 = new ScalaPerson("Frans", "van den Berg", 42)
    val java43 = new JavaPerson("Frans", "van den Berg", 43)
    val scala43 = new ScalaPerson("Frans", "van den Berg", 43)

    scenario("Testing with changing ages on equality and non-equality") {
      Given("two persons in a java and scala definition")
      java42 should equal(scala42)
      java43 should equal(scala43)
      java42 should not equal scala43

      When("increment the age for one java/scala pair")
      java42.setAge(java42.getAge + 1)
      scala42.age += 1 // Automagically using setter age_$eq(int)

      Then("all names and ages should be the same.")
      java42 should equal(scala42)
      java43 should equal(scala43)
      java42 should equal(scala43)
    }
  }
}
