package DataFlairTutorial

object StringMethod extends App {

  //TODO: 1. char charAt(int index) -- This method return the character at the index we pass to it

  var name: String = "Kelvon"

  println("name.charAt(3) = " + name.charAt(3))
  // renders: 'v'


  //TODO: 2. int compareTo(Object o) -- This Scala string method compares a string to anther object.
  println("name.compareTo(name) = " + name.compareTo(name))
  // renders : 0 -- renders an Int because they are the same lexicographically


  //TODO: 3. int compareTo(String anotherString) -- This is like the previous one, except that it compares two string lexicographically. If they match, it returns 0. Otherwise, it return the difference between the two(the number of characters less in the shorter string, or the maximum ASCII difference between the two).

  println("name.compareTo(\"Kelvon \") = " + name.compareTo("Kelvon "))
  // renders: -1

  println( "name.compareTo(\"Kelvon\") = " + name.compareTo("Kelvon"))
  // renders: 0

  println("name.compareTo(\"kelvon\") = " +  name.compareTo("kelvon"))
  // renders: -32


  //Comparing to a different type raises a type-mismatch error

// TODO: ---  println("name.compareTo(7) = " + name.compareTo(7))
//renders: type mismatch;
  // found   : Int(7)
  // required: String


  // TODO : 4. int compareToIgnoreCase(String str) -- int compareToIgnoreCase Scala String Method compares two string lexicographically, while ignoring the case differences

  println("name.compareToIgnoreCase(\"kelvon\") = " + name.compareToIgnoreCase("kelvon"))

 //TODO : 5. String concat(String str) -- This will concatenate the string in the parameter to the end of the string on which we call it.

  println( "name.concat(\"Patterson\") = " + name.concat("Patterson"))


  //TODO : 6. Boolean contentEquals(StringBuffer sb) -- contentEquals compares a string to a StringBuffer’s contents. If equal, it returns true; otherwise, false.

  val a = new StringBuffer("Kelvon")
  println( "\"Kelvon\".contentEquals(a) = " + "Kelvon".contentEquals(a))
  println( "\"kelvon\".contentEquals(a) = " + "kelvon".contentEquals(a))


  //TODO : 7. Boolean endsWith(String suffix) -- This Scala String Method returns true if the string ends with the suffix specified; otherwise, false.

  println("name.endsWith(\"n\") = " +  name.endsWith("n"))
  println("name.endsWith(\"v\") = " +  name.endsWith("v"))

  //TODO: 8. Boolean equals(Object anObject) -- This Scala String Method returns true if the string and the object are equal; otherwise, false.

  println(name.equals("k"))

}