import scala.math.abs

object W3ResourceExercises extends App {


  //1) write a Scala program to print "Hello World" and version of the scala language.


  println("Hello World")
  println("The version of the scala language being used is " + util.Properties.versionString)

  //2) Write a Scala program to compute the sum of the two given integer values. If the two values are the same then triple the sum.

  def sum(a: Int, b: Int): Int = {
    if (a == b) {
      (a + b) * 3
    }
    else
      a + b
  }

  println(sum(3, 3))
  println(sum(3, 5))

  //3) Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.

  def absoluteDiff(n: Int) = {
    val absValDiff = Math.abs(n - 51)
    if (n > 51) 3 * absValDiff else absValDiff
  }

  println(absoluteDiff(40))
  println(absoluteDiff(60))

  //4) Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.

  def equals30(a: Int, b: Int): Boolean = {
   a==30 || b==30 || a+b == 304
  }
  println(equals30(30,49))
  println(equals30(10,10))

  //5) Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.

  def within20(a: Int): Boolean ={
   Math.abs(100 -a)  <= 20 || Math.abs(300-a) <=20

  }
  println(within20(115))
  println(within20(200))
  println(within20(70))


}

