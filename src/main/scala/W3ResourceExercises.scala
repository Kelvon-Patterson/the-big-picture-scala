object W3ResourceExercises extends App {


  //1) write a Scala program to print "Hello World" and version of the scala language.


  println("Hello World")
  println("The version of the scala language being used is " + util.Properties.versionString)

  //2) Write a Scala program to compute the sum of the two given integer values. If the two values are the same then triple the sum.

  def sum( a: Int, b: Int): Int = {
    if(a == b){
      (a+b) * 3
    }
    else
    a+b
  }

  println(sum(3,3))
  println(sum(3,5))
}
