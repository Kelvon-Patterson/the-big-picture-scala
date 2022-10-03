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

  val b = Array('K','e', 'l', 'v', 'o', 'n')
  println("\"Kelvon\".equals(b) = " + "Kelvon".equals(b))
  println(" \"Kelvon\".equals(\"Kelvon\") = " + "Kelvon".equals("Kelvon"))

  //TODO: Boolean equalsIgnorecase -- Same as .equals but Ignores the casing.

  //TODO : 10.  byte getBytes() -- getBytes Scala String Method encodes a string into a sequence of bytes and stores it into a new byte array. It uses the platform’s default charset for this.

  println("\"Ayushi\".getBytes() = " + "Ayushi".getBytes())

  //TODO : 11. byte[] getBytes(String charsetName) -- With a named charset as a parameter, getBytes will use that charset to encode the string.

  println("\"Ayushi\".getBytes(\"Unicode\")" + "Kelvon".getBytes("Unicode"))

    //TODO: 12. void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
   //  This Scala String Method copies characters from the string into the destination character array. scrBegin denotes the index to begin at in the source string, and srcEnd denotes the index to end at in the source string. dstBegin denotes the index to begin at in the destination character array. dst is the destination character array.

  var c:Array[Char]=Array('A','y','u','s','h','i')
 // c: Array[Char] = Array(A, y, u, s, h, i)
  var d="01234"
  //d: String = 01234
   d.getChars(2,4,c,2)
  println("c = " + c.mkString("Array(", ", ", ")"))
  // Array[Char] = Array(A, y, 2, 3, h, i)

  //TODO: 14. int indexOf(int ch)
  //This Scala Sring returns the index of the first occurrence of the character ch in the string.

  println("\"Banana\".indexOf(3) = " + "Banana".indexOf(3))

  //TODO: 15. int indexOf(int ch, int fromIndex)
  //This is like indexOf, except that it begins searching at the index we specify.

  println( "\"banana\".indexOf('a', 2) = " + "banana".indexOf('a', 2))

  //TODO: 16. int indexOf(String str)
  //This Scala String Method returns the index of the first occurrence of the substring we specify, in the string.

  println("\"Banana\".indexOf(\"na\") = " + "Banana".indexOf("na"))

  //TODO : 19. int lastIndexOf(int ch, int fromIndex)
  //Unlike indexOf, this Scala String Method returns the index of the last occurrence of the character we specify

  println("name.lastIndexOf('v') = " + name.lastIndexOf('v'))

  //TODO : 20. int lastIndexOf(String str)
  //This scala string method returns the index of the last occurrence fo the substring we specify, in the string.

  println("name.lastIndexOf(\"on\") = " + name.lastIndexOf("on"))


  //TODO: 21. int lastIndexOf(String str, int fromIndex)
  //This Scala string method is like the previous method, except that it begins searches at the index we specify, and searches right to left.
  println(name.lastIndexOf("on", 3))


  //TODO: 22. int length()
  //This method simply returns the length of a string.
  println( "name.length = " +name.length)

  //TODO: 23. Boolean matches(String regex)
  //if the string matches the regular expression we specify, this returns true; else false.

  println(" name.matches(\".n.*\")"+ name.matches(".n.*"))


  //TODO: 27. String replace(char oldChar, char newChar)
  //Replace will replace all occurrences of oldChar in the string with newChar, and Return the resultant string.

  println( "name.replace('o','0') = "+  name.replace('o','0'))

  //TODO : 28.  String replaceAll(String regex, String replacement)
  //This will replace each substring matching the regular expression. It will replace it with the replacement string we provide.

  println("name.replaceAll(\".on\", \"** \") = " + name.replaceAll(".on", "** "))


  //TODO : 29. String replaceFirst(String regex, String replacement)
  //if in the example above, we want to replace only the first such occurrence.

  println("name.replaceFirst(\".on\", \"** \") = " + name.replaceFirst(".on", "** "))

  //TODO: 30. String [] split(String regex)
  //this method splits the string around matches of the regular expression we specify. It returns a String array.

  println("\"xpotxdotynotzhotokayslot\".split(\".ot\") = " +   "xpotxdotynotzhotokayslot".split(".ot").mkString("Array(", ", ", ")"))

  //TODO : 32. String[] split(String regex, int limit)
 // This Scala String Method is like split, except that we can limit the number of members for the array. The last member, then, is whatever part of the string that’s left.

  println("\"xpotxdotynotzhotokayslot\".split(\".ot\",2) = " + "xpotxdotynotzhotokayslot".split(".ot", 2).mkString("Array(", ", ", ")"))

//TODO : 33.  Boolean startsWith(String prefix)
  //If the string starts with the prefix we specify, this returns true; else false. This is like endsWith.

  println( "name.startsWith(\"Ke\") = " + name.startsWith("Ke"))


  //TODO: 34. Boolean startsWith(String prefix, int toOffset)
  //if the string starts with the specified prefix at the index we specify, This returns true; else false.

  println("name.startsWith(\"el\", 1) = " + name.startsWith("el", 1))

  //TODO: 35. char [] toCharArray()
  //This converts the string into a CharArray, and then returns it.

  println("name.toCharArray" + name.toCharArray.mkString("Array(", ", ", ")"))



}