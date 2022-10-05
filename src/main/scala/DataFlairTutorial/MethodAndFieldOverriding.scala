package DataFlairTutorial

object MethodAndFieldOverriding extends App {


  //TODO: -- Scala overriding method provides your own implementation of it. When a class inherits from another, it may want to modify the definition for a method of the superclass of provide a new version of it.We use the 'override' modifier to implement this.
  // Technically, Scala method overriding is when a member M of class C matches a non-private member M’ of a class from which C inherits. There are some restrictions:  'M' is not private class -- 'M' is not final.

  //TODO: In this example, class Student extends class Person. It overrides the method greet() from class Person to its own definition using the Scala 'override' keyword.

  class Person{
    def greet(): Unit ={
      println("I'm a person")
    }
  }

  class Student extends Person{
    override def greet(): Unit ={
      println("I'm a student")
    }
  }

var s =new Student()

  s.greet()

  //In the following example, we have a superclass Vehicle and a subclass Car. A vehicle has a variable 'wheels' with the value 0. Car overrides this and gives it a value of 4. When we call the method show() on an object of class Car, it gives us the value 4.


  class Vehicle{
    def getNumOfWheels: Int ={
    0
    }
    val wheels = 0
  }

  class Car extends Vehicle{
    override def getNumOfWheels: Int ={
      4
    }

    override val wheels: Int = 4
    def show(): Unit ={
      println("The car has " + wheels + " wheels")
    }

  }

 class Bike extends Vehicle{
   override def getNumOfWheels: Int ={
     2
   }
 }

  class Auto extends Vehicle{
    override def getNumOfWheels: Int ={
      3
    }
  }

  var c = new Car();
  println(c.getNumOfWheels)
  var b = new Bike();
  println(b.getNumOfWheels)
  var a = new Auto();
  println(a.getNumOfWheels)
  c.show()





}
