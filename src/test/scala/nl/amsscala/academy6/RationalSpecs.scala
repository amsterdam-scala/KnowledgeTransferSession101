package nl.amsscala.academy6

import org.scalactic.Equality
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class RationalSpecs extends FeatureSpec with GivenWhenThen with Matchers {
  // Sprint 01 CreatingInstance
  feature("creating an instance") {
    scenario("should be able to be create an (applied) instance given a numerator and a denominator") {
      assert(new Rational(denominator = 4, numerator = 3).isInstanceOf[Rational]) // by constructor
      assert(Rational(3, 4).isInstanceOf[Rational]) // by apply method
    }

    scenario("should not allow a numerator to be 0") {
      intercept[IllegalArgumentException] {
        new Rational(3, 0)
      }
      intercept[IllegalArgumentException] {
        Rational(3, 0)
      }
    }

    scenario("should be able to be create an (applied) instance given just a numerator") {
      {
        val rational = new Rational(3)
        (rational.numerator, rational.denominator) should be(3, 1)
      }
      {
        val rational = Rational(3)
        (rational.numerator, rational.denominator) should be(3, 1)
      }
      {
        val rational: Rational = 3
        (rational.numerator, rational.denominator) should be(3, 1)
      }
    }

    scenario("should normalise the given numerator and denominator") {
      val rational = Rational(66, 42)
      (rational.numerator, rational.denominator) should be(11, 7) // In fact: should be((11,7))
    }

    scenario("should normalise the sign of numerator and denominator") {
      (for (pair <- List((9, -12), (-9, 12), (-9, -12));
            rational = Rational(pair._1, pair._2))
      yield (rational.numerator, rational.denominator)) should be(List((-3, 4), (-3, 4), (3, 4)))
    }
  }

  // Sprint 02 toString
  feature("toString function") {
    scenario("should return <numerator / denominator>") {
      new Rational(3, 4).toString should be("3/4")
    }
  }

    val oneQuarter = new Rational(1, 4)
    val oneHalf = Rational(1, 2)
    val oneThird = new Rational(1, 3)
    val twoThird = Rational(2, 3)
    val threeQuarter = new Rational(3, 4)

    /* Equality helper, default equality doesn't function.
     * areEqual(a,b) is called from "should equal(right : scala.Any)" or "should ===(right : scala.Any)"
     * but still using Rational.==
     */
    implicit val rationalEqHelper =
      new Equality[Rational] {
        def areEqual(a: Rational, b: Any): Boolean = b match {
          case t: Rational => a == t
          case _ => false
        }
      }
    // Sprint 03 Arithmetic
    feature("arithmetic operations") {
      scenario("unary plus operator") {
        +oneQuarter should equal(oneQuarter)
      }

      scenario("9/12 should be equal to 3/4") {
        Rational(9, 12) should equal(new Rational(3, 4))
      }

      scenario("8/12 should be not equal to 3/4") {
        assert(Rational(8, 12) != new Rational(3, 4))
      }

      scenario("should subtract together 1/2 and 1/4 to give 1/4") {
        oneHalf - oneQuarter should equal(oneQuarter)
      }

      scenario("should add together 1/2 and 1/2 to give 1/1") {
        oneHalf + oneHalf should equal(new Rational(1, 1))
      }

      scenario("should accept just and integer") {
        oneThird + 3 should equal(new Rational(10, 3))
      }

      scenario("should take 1/4 away from 1/2 to give 1/4") {
        oneHalf - oneQuarter should equal(oneQuarter)
      }

      scenario("should take 1/4 away from 1/4 to give 0") {
        oneQuarter - oneQuarter should equal(new Rational(0))
      }

      scenario("should take 1/2 away from 2/3 to give 1/6") {
        twoThird - oneHalf should equal(new Rational(1, 6))
      }

      scenario("should accept just and integer2") {
        oneThird - 3 should equal(new Rational(-8, 3))
      }

      scenario("should accept integer and rational") {
        3 - oneThird should equal(new Rational(8, 3))
      }
      scenario("should multiply 2/3 and 1/4 to give 1/6") {
        val a = new Rational(2, 3)
        val b = new Rational(1, 4)
        a * b should equal(new Rational(1, 6))
      }

      scenario("should accept just and integer3") {
        oneThird * 3 should equal(new Rational(1))
      }

      scenario("should divide 1/2 and 1/4 to give 2/1") {
        oneHalf / oneQuarter should equal(new Rational(2))
      }

      scenario("should accept just and integer4") {
        val a = new Rational(1, 3)
        a / 2 should equal(new Rational(1, 6))
      }

      val x = oneHalf
      val y = twoThird

      scenario("should maintain precedence") {
        x + x * y should equal(new Rational(5, 6))
        (x + x) * y should equal(twoThird)
        x + (x * y) should equal(new Rational(5, 6))
      }
    }
    /*
      feature("comparations") {
        scenario("should return true when 1/2 < 3/4") {
          oneHalf < threeQuarter should be(true)
        }
        scenario("should return true when 3/4 < 3/4") {
          threeQuarter < threeQuarter should be(false)
        }
        scenario("should return true when 3/4 < 1/4") {
          threeQuarter < oneHalf should be(false)
        }

        scenario("should return true when 1/2 <=  3/4") {
          oneHalf <= threeQuarter should be(true)
        }
        scenario("should return true when 3/4 <= 3/4") {
          threeQuarter <= threeQuarter should be(true)
        }
        scenario("should return true when 3/4 <= 1/3") {
          threeQuarter <= oneHalf should be(false)
        }

        scenario("should return true when 1/2 > 3/4") {
          oneHalf > threeQuarter should be(false)
        }
        scenario("should return true when 3/4 > 3/4") {
          threeQuarter > threeQuarter should be(false)
        }
        scenario("should return true when 3/4 > 1/4") {
          threeQuarter > oneHalf should be(true)
        }

        scenario("should return true when 1/2 >=  3/4") {
          oneHalf >= threeQuarter should be(false)
        }
        scenario("should return true when 3/4 >= 3/4") {
          threeQuarter >= threeQuarter should be(true)
        }
        scenario("should return true when 3/4 >= 1/3") {
          threeQuarter >= oneHalf should be(true)
        }

        scenario("should return true when -3/4 >=  3/4") {
          -threeQuarter >= threeQuarter should be(false)
        }
        scenario("should return true when -3/4 >= -3/4") {
          -threeQuarter >= -threeQuarter should be(true)
        }
        scenario("should return true when 3/4 >= -3/4") {
          threeQuarter >= -threeQuarter should be(true)
        }
      }

      feature("functions") {
        scenario("max function"){
          Rational.max(oneHalf, threeQuarter) should equal(threeQuarter)
        }
        scenario("min function"){
          Rational.min(oneHalf, threeQuarter) should equal(oneHalf)
        }
      }*/
}