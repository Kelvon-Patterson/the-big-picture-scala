package DataFlairTutorial

object ScalaFunctions extends App {

  //TODO: WHAT IS A SCALA FUNCTION?
  // When we want to execute a group of statements to perform a task a hundred times, we don’t type them a hundred times. We group them into a function, put a call to that function inside a loop, and make that loop run a hundred times.
  // --Scala also has methods, but these differ only slightly from Scala function. A method belongs to a class; it has a name, a signature, [optionally, ] some annotations, and some bytecode. A function is a complete object that we can store in a variable. Then, a method is a function that is a member of some object.

  //DECLARING A FUNCTION IN SCALA
  //To create a scala function, we use the def keyword.

  //TODO: A : SYNTAX
  //Here's the syntax you will want to follow.
//  def functionName(parameters: DataType) : returnTypeOfFunction = {
//    //statement to be executed
//  }

  //The type of parameters / dataType, the type of Scala function is optional as is the '=' operator.
  //EX:

  //TODO: B : WITHOUT = | WITHOUT PARAMETERS
  //You can consider this to be the simplest kind of scala function declaration
  def sayHello(){
    println("Hello")
  }
  //calling it
  sayHello()

  //TODO: C : WITHOUT = | WITHOUT PARAMETERS
  //We can declare a Scala function that takes parameters to work on to produce a result. Here, we simply print that result instead of returning it.

  def sum1(a: Int, b: Int){
    println(a+b)
  }
  //function call
  sum1(5,5)

  //TODO: D : WITHOUT = | WITHOUT PARAMETERS
  //With the '=' operator, a function takes a return type, and also returns a value of that type.

  def func2(): Int ={
    return 7
  }

  //Recursion in Scala Function
  def factorial(n: Int): Int={
    if(n==1)
      {
        return 1
      }
      n*factorial(n-1)
  }

  //Scala functions with variable arguments
    //When we dont know how many arguments we'll want to pass, we can use a variable argument for this
  def sum(args:Int*):Int={
      var result= 0
      for(arg<-args){
        result+= arg
      }
      result
    }
//call sum
  println(sum(1,2,3,4,5,6,7,8))
  println(sum(12,42,11))

  //TODO HIGHER ORDER FUNCTIONS IN SCALA
  // Since scala is a highly functional language, it treats its functions as first-class citizens. This means that we can pass them around as parameters, or even return them from functions.

  //Let's first define a Scala function sayHello
  def sayHello(s:String): Unit ={
    println(s"Hello, $s")
  }
val name : String = "Kelvon"

  //Now, let's define a function func that calls 'sayhello' on 'name'.
  def func(f:String=> Unit, s:String): Unit ={
    f(s)
  }
println(func(sayHello,name))


}
