import scala.math.abs

object W3ResourceExercises extends App {


  //1 write a Scala program to print "Hello World" and version of the scala language.


  println("Hello World")
  println("The version of the scala language being used is " + util.Properties.versionString)

  //2 Write a Scala program to compute the sum of the two given integer values. If the two values are the same then triple the sum.

  def sum(a: Int, b: Int): Int = {
    if (a == b) {
      (a + b) * 3
    }
    else
      a + b
  }

  println(sum(3, 3))
  println(sum(3, 5))

  //3 Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.

  def absoluteDiff(n: Int) = {
    val absValDiff = Math.abs(n - 51)
    if (n > 51) 3 * absValDiff else absValDiff
  }

  println(absoluteDiff(40))
  println(absoluteDiff(60))

  //4 Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
//---
  def equals30(a: Int, b: Int): Boolean = {
   a==30 || b==30 || a+b == 304
  }
  println(equals30(30,49))
  println(equals30(10,10))

  //5 Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.
//---
  def within20(a: Int): Boolean ={
   Math.abs(100 -a)  <= 20 || Math.abs(300-a) <=20

  }
  println(within20(115))
  println(within20(200))
  println(within20(70))

    //6 Write a Scala program to create a new String where 'if' is added to the front of a given string . If the string already begins with 'if', return the string unchanged.
//--if/else syntax
  def addIfNoIf(a: String): String = {
  if(a.startsWith("if")) a else "if " + a

  }

  println("Result: " + addIfNoIf("if else"))
  println("Result: " + addIfNoIf("else"))

  //7 Write a Scala program to remove the character in a given position of a given string. The given position will be in the range of 0...string length-1 inclusive.

  def removeChar(str: String, index: Int): String ={
    val result = str.substring(0,index) + str.substring(index+1)
    result
  }
  //W3resources solution
  def removeChar1(str: String, n: Int): String =
  {
    str.take(n) + str.drop(n + 1)
  }

  println("Result: " + removeChar("Scala", 1))
  println("Result: " + removeChar("Scala", 0))
  println("Result: " + removeChar("Scala", 4))

  //8 Write a scala program to exchange the first and last characters in a given string and return the new string
//--Need to solve for egde cases as well
  def exchangeChar(str:String):String={
    val len= str.length
  if(len<=1) str
   else str.substring(str.length-1) + str.substring(1,str.length-1) + str.substring(0,1)
  }

  println("Result: " + exchangeChar("Scala"))
  println("Result: " + exchangeChar("abcd"))
  println("Result: " + exchangeChar("ab"))
  println("Result: " + exchangeChar("a"))
}

