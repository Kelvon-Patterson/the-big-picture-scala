package DataFlairTutorial

object ScalaSyntax extends App {

  //TODO: A: SCALA EXPRESSION
  //An expression is a computable statement. For example, the following is an expression: 1 + 2
  // We use println() to print the output of an expression:

  println(1)
  println(1+2)
  println("Hi")

  //1. Values
  //An expressions returns a result; We can name it using the 'val' keyword.
  val name= "Kelvon"
  println(name)

  //Usually, Scala will infer the type of an expression- type inference, as we’ve discussed in Features of Scala. But we can also explicitly state the type:
  val roll: Int = 30

  //1. Scala Variables
  //A variable is a value that we can reassign. To declare a variable, we use the ‘var’ keyword. Scala Syntax for Variables are given below.
  var x=2
  x=3 //This changes the value of x from 2 to 3
  println(x*x) //This prints 9

  //TODO: B: SCALA BLOCK
  //A block is a group of expressions delimited by curly braces({}). A block returns whatever its last expression return. The Scala Syntax for the Same is Below.

  println
  (
    {
      val x=1+1
      x+1
    }
    ) //3

  //TODO: C: SCALA CLASS
    //Scala class is a blueprint that we can use to create an object. It may hold values, variables, types, classes, functions, methods, objects, and traits. We collectively call them members. To declare a class, we use the keyword ‘class’ and an identifier.

    class Fruit{}
  val orange = new Fruit

  //TODO: D : SCALA OBJECT
  //It is a single instance of its own definition. To define an object, we use the keyword object.

  object MyObject{
    def plusThree()={
      val x = 3*3
      x+3
    }
    println(MyObject.plusThree())
  }

  //TODO: E :  SCALA FUNCTION
  //A function is an expression that take parameters. First, let's observe an anonymous function

  (x:Int) => x*x

  //This function take an Integer argument x, and returns its square.
  //So, here we see that on the left of the '=>' is the list of parameters, and on the right is an expression it will return. Now let's give it a name.

  val squared = (x:Int) => x*x
  println(squared(3)) // prints 9

  //A function may also take multiple parameters or none.

  val add=(x:Int,y:Int,z:Int)=>x+y+z
  println(add(2,3,7)) //This prints 12
  val sayHi=()=>(println("Hi"))
  //We could also have put the println in a block as {print(“Hi”)}
  sayHi() //This prints Hi

//TODO: F : SCALA METHOD
  // a method is similar to a function, but we define it using the keyword 'def'.
  //What follows is an identifier, parameter list, a return type and a body. EX:

  def squared1(x: Int): Int= x*x
  println(squared1(3))

  //We denote the return type after a colon after the parameter list. Also, here, we use = instead of =>.
  //A method can also take multiple parameter list .
  def myMethod(x:Int, y: Int) (z:Int): Int = {(x+y)*z}
  println(myMethod(2,3)(4))

  //A method can have multiple line expressions:
  def method1(x:Int, y:Int)(z:Int): Int = {
    val a = x+y+z
    (x+y)*a
  }

  //TODO: G : SCALA TRAIT
  //A trait holds fields and methods, and we define it using the 'trait' keyword. We can also combine traits.

  trait greeter{
    def greet(name: String): Unit
  }

  //TODO: H : SCALA MAIN METHOD

// def main(args: Array[String]):Unit = {
//    println("Hello, Scala developer")
//  }

  //TODO: I : FIELDS
  // A unique set of instance variables belongs to each object. These are fields, and they define the object's state.

  //TODO: J : CLOSURE
  // Any function whose return value depends on variables declared outside it.






















}
