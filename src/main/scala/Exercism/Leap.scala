package Exercism

object Leap extends App {

  def leapYear(year: Int): Boolean = {
     year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

  }

  println(leapYear(1900))
}
