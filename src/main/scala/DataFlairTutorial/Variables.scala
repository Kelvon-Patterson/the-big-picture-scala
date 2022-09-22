package DataFlairTutorial

object Variables extends App {

  //TODO: Intro:
  // A Variable is a reserved memory location to store values.
  // We can declare a Scala variable as a constant or as a variable.

  //TODO: A : Constant -- To declare a value that we cannot mutate/ change, we use the keyword 'val'. This is immutable.


  val x: Int = 7
  val name: String = "Kelvon"

  //TODO: B : Variable -- A variable is mutable. We can change its value as many time as we like. Declare it using the keyword 'var'.

  var name1: String = "Amirah"
  name1 = "Rambo"

  //TODO: Multiple Assignments -- Hoe do we fit multiple assignment statements into one statement? we assign a Tuple ( a value that contains a fixed number of elements, each with its own type. Tuples are immutable.)

//  val pair= (x: Int, y : String )
//  val(x,y)= Pair(7,"Kelvon")



}
