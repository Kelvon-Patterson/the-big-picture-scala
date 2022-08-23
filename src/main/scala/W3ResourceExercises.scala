import W3ResourceExercises.front2FourTimes

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
//TODO--if/else syntax
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
  //TODO--W3resources solution
  def removeChar1(str: String, n: Int): String =
  {
    str.take(n) + str.drop(n + 1)
  }

  println("Result: " + removeChar("Scala", 1))
  println("Result: " + removeChar("Scala", 0))
  println("Result: " + removeChar("Scala", 4))

  //8 Write a scala program to exchange the first and last characters in a given string and return the new string
//TODO--Need to solve for edge cases as well
  def exchangeChar(str:String):String={
    val len= str.length
  if(len<=1) str
   else str.substring(str.length-1) + str.substring(1,str.length-1) + str.substring(0,1)
  }

  println("Result: " + exchangeChar("Scala"))
  println("Result: " + exchangeChar("abcd"))
  println("Result: " + exchangeChar("ab"))
  println("Result: " + exchangeChar("a"))

    //9 Write a Scala program to create a new string which is 4 copies of the front 2 characters of a given string. If the given string is less than 2 return the original string.

  def front2FourTimes(str:String): String={
    val len= str.length
    if(len<=2) str
    else str.substring(0,2)*4
    }

  println("Result: " + front2FourTimes("Scala"))
  println("Result: " + front2FourTimes("abcd"))
  println("Result: " + front2FourTimes("ab"))
  println("Result: " + front2FourTimes("a"))


  //10 Write a Scala program to create a new string with the last char added at the front and back of a given string of length 1 or more.

  def frontToBack(str:String): String= {
    val len = str.length
    if (len <= 1) str
    else str.substring(str.length-1) + str + str.substring(str.length-1)

  }
  //TODO: W3Resources solution-- def test(str1: String): String =
  //    {
  //    val len = str1.length
  //    val last = str1.charAt(len - 1)
  //    last + str1 + last
  //    }


println("Result: " + frontToBack("Scala"))
println("Result: " + frontToBack("abcd"))
println("Result: " + frontToBack("ab"))
println("Result: " + frontToBack("a"))

  //11) Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.
//TODO: dont need to check for positive number since it was given.
  def isPositive3or7(num: Int): Boolean={
    num % 3 ==0 ||  num % 7 == 0

  }

  println("Result: " + isPositive3or7(3))
  println("Result: " + isPositive3or7(14))
  println("Result: " + isPositive3or7(12))
  println("Result: " + isPositive3or7(37))

  //12 Write a scala program to create a new string taking the first 3 characters of a given string and return the string with the 3 characters added at both the front and back. If the given string length is less than 3, use whatever characters are there.

  def threeFront3back(str: String): String={
  val firstThree = str.substring(0,3)

    if(str.length < 3) str * 3
    else firstThree + str + firstThree

  }
//TODO  FIGURE OUT WHY RESULT 3 AND 4 ARENT WORKING
//  println("Result: " + threeFront3back("Scala"))
//  println("Result: " + threeFront3back("abcd"))
//  println("Result: " + threeFront3back("ab"))
//  println("Result: " + threeFront3back("a"))

//13 Write a Scala program to check whether a given string starts with 'Sc' or not

  def startsWithSc(str: String): Boolean ={
    str.startsWith("Sc")

  }

  println("Result: " + startsWithSc("Scala"))
  println("Result: " + startsWithSc("abcd"))
  println("Result: " + startsWithSc("sc"))
  println("Result: " + startsWithSc("a"))

  //14 Write a Scala program to check whether one of the given temperatures is less than 0 and the other is greater than 100

  def weatherGreaterThan100(num1: Int,num2: Int): Boolean ={
    (num1 < 0 && num2 > 100) || (num2 < 0 && num1 > 100)

  }

  println("Result: " + weatherGreaterThan100(120, -1))
  println("Result: " + weatherGreaterThan100(-1, 120))
  println("Result: " + weatherGreaterThan100(2, 120))

}