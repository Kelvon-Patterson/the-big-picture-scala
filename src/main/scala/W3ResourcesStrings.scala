object W3ResourcesStrings extends App {


  //Write a Scala program to get the character at the given index within a given string. Also print the length of the string.

  def indexOfChar(str: String, index: Int)={
  val char = str.charAt(index)
    println("The character at position " + index + " is " + char + ", the length of the string is " + str.length)
  }
println(indexOfChar("Scala Exercises ", 6))


//Write a Scala program to get the character (Unicode code point) at the index within the String.

  def uniCodePoint(str:String, index: Int)={
    str.codePointAt(index)
  }

println(uniCodePoint("w3resource - Scala", 9))

  //Write a Scala program to compare two string lexicographically

  def compareStrings(str1: String, str2: String )={
  var comparitiveVal=  str1.compareTo(str2)
  if(comparitiveVal < 0){
    println(str1 + " is less than " + str2)
  }else if(comparitiveVal > 0){
    println(str1 + " is greater than " + str2)
  }else println(str1 + " is equal to " + str2)
  }

  println(compareStrings("This is Exercise 1", "This is Exercise 2"))


  //Write a Scala program to test if a given string contains the specified sequence of char values.
  def charSequence(str1: String,str2: String):Boolean={
    if(str1.contains(str2)){
      true
    }else false
  }
  println(charSequence("Scala Exercises", "Exercise6" ))


//Write a Scala program to create a new String object with the contents of a character array.
  //Character array with data
  val arr_num = Array('1', '2', '3','4', '5', '6');
  //Create a String containing the contents of arr_num
  //starting at index 1 for length
  val str = String.copyValueOf(arr_num,0,3)
  println("\nThe book contains " + str + " pages.\n")


  //Write a Scala program to check whether a given string ends with the contents of another string.

  def endsWith(str1:String, str2: String ): Boolean={
     str1.endsWith(str2)
  }

  println(endsWith("Python Exercises", "se"))

//Write a scala program to check whether two String objects contain the same data.

  def sameData(str1: String, str2: String): Boolean={
    str1.equals(str2)
  }

  println(sameData("Stephen Edwin King", "Stephen Edwin King"))

//Write a Scala program to get a substring of a given string between two specified positions.

  def sameSub(str1: String, num1: Int, num2: Int):String={
    str1.substring(num1,num2)
  }

  println(sameSub("The quick brown fox jumps over the lazy dog.",10,26 ))

  //Write a scala program to convert all the characters to lowercase, uppercase strings

  def toUpperCase(str:String):String={
    str.toUpperCase
  }
  println(toUpperCase("The Quick BroWn FoX!"))
   def toLowerCase(str:String):String ={
     str.toLowerCase
   }
  println(toLowerCase("The Quick BroWn FoX!"))

  //Write a Scala program to print after removing duplicates from a given string
//TODO: Redo this problem with no help
  def removeDupes(str:String): String={
    //turn string in to an array of characters
    val arr = str.toCharArray;
    var targetStr = "";
    for(value <- str){
      if(targetStr.indexOf(value) == -1){
       targetStr += value
      }
    }
    targetStr
  }
println(removeDupes("2q34u923u4928402"))

//Write a scala program to find the maximum occurring char in a string
//TODO redo this problem with no help
  def MaxOccurringChar(str1: String): Char = {
    val N = 256;
    val ctr = new Array[Int](N);
    val l = str1.length();
    for (i <- 0 until l)
      ctr(str1.charAt(i)) = ctr(str1.charAt(i)) + 1;
    var max = -1;
    var result = ' ';
    for (i <- 0 until l) {
      if (max < ctr(str1.charAt(i))) {
        max = ctr((str1.charAt(i)))
        result = str1.charAt(i)
      }
    }
    result
  }

def reverseString(str: String): String = {
  str.reverse
}
  println(reverseString("reverse"))




}
