package DataFlairTutorial

object ScalaAbstractClass extends App {

  //-- Why do we need Scala Abstract Class?
  //Abstraction is often the answer to TMI(Too Much Info). It applies to almost everything in life and keeps us from insanity. And in case you were wondering, abstraction is hiding unnecessary details and putting forward only what interest the subject.

  //TODO: Scala Abstract class is one that can have both abstract and non-abstract methods.  -- An abstract method is one without a definition right away. So that means, abstract class lets us declare a method for a class without definition. We can tell the compiler that the class is supposed to have a particular method, but we may not be sure what to put in that right away. Or we may also want to use this for inheritance.

  //When more than one class inherits from a superclass, the superclass may not want to provide a definition for a certain method, as we may not want to create an instance of it to call the method on. We can then declare the method abstract. Also , you cannot instantiate Scala abstract class. In simple words, you cannot create an object of it. A class can only inherit from one Scala abstract class.

  //How to Implement Scala Abstract Class--
  //To implement Scala abstract class, we use the 'abstract' keyword against its declaration. IT IS ALSO MANDATORY FOR A CHILD TO IMPLEMENT ALL ABSTRACT METHODS OF THE PARENT CLASS.

  abstract class Person{
    def greet(): Unit
  }

  class Student extends Person{
    def greet(): Unit ={
      println("Hi Im a student")
    }
  }
  var student = new Student()
  student.greet()

  //In this example we also include a constructor and variables.

  abstract  class Person1(age: Int){
    var SSN: String = ""
    def greet ():Unit
    def greetHello(): Unit ={
      println("Hello")
    }
  }

  class Student1 (age: Int) extends Person1(age){
    SSN = "233-22-2123"
    def greet(): Unit ={
      println("Hi im a student again")
      println("I am " + age + " years old")
      println("my SSN is " + SSN)

    }
  }

  var s = new Student1(18)
  s.greet()







}
