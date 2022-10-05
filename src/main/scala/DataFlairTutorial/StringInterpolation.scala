package DataFlairTutorial

object StringInterpolation extends App {

  //Scala String Interpolation is a new way to create them. But we didn't always have this feature at hand.
  //By interpolating a string, we can embed variable references directly in a processed string literal. We have three kinds of Scala String interpolators.

  //TODO-- s String Interpolator
  //When we prepend 's' to any string, we can directly use variables in it with the use of the '$' character. But that variable should be in scope in that string; it should be visible.

  val name = "Kelvon"
  println(s"Hello, $name, how are you ? ")
  //We can also process arbitrary expressions using ${}
  println(s"Hello, 2+3 is ${2+3} ")
  println(s"Is 2+3 equal to 5? That is ${2+3==5}")

  //TODO-- f String Interpolator
  //First let's see the problem with the s interpolator.
  val a = 77.000
  println(s"The number is $a")
  //The number printed is 77.0 not 77.000
  println(f"The number is $a%.3f")
}
