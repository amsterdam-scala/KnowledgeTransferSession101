package nl.amsscala.academy6

import scala.annotation.tailrec
import scala.math._
import scala.util.control.NoStackTrace

/**
 * A rational number can be represented as a paired integer number; p/q (q != 0). Where p is numerator and p is denominator.
 * Integer p equals rational p/1 mathematically.
 *
 * Use: Rational can created by its apply call: Rational(p, q) without new keyword.
 * By using this the numerator and denominator will be normalized to the GCD.
 *
 * @constructor Create a new rational expressed in a numerator and denominator pair
 * @param numerator Dividend p
 * @param denominator Divisor q
 * @throws IllegalArgumentException If denominator is zero at creating this object
 */
class Rational(val numerator: Int, val denominator: Int = 1) {
  //require(denominator != 0, "Denominator must be non-zero")

  if (denominator == 0)
    throw new IllegalArgumentException("Denominator must be non-zero") with NoStackTrace
  
  /** Returns a representation in text. */
  override def toString = numerator + "/" + denominator
}

object Rational {

  import scala.language.implicitConversions

  def apply(p: Int, q: Int) = {
    lazy val gcd = {
      @tailrec // Euclid's algorithm
      def gcdRec(x: Int, y: Int): Int = if (y == 0) x else gcdRec(y, x % y)

      abs(gcdRec(p, q))
    }
    // Normalize sign and by a common factor
    new Rational((if ((p < 0) == (q < 0)) abs(p) else -abs(p)) / gcd,
      abs(q) / gcd)
  }

  def apply(wholeNumber: Int) = new Rational(wholeNumber)

  implicit def intToRational(n: Int): Rational = Rational(n)
}