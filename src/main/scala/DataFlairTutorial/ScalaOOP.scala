package DataFlairTutorial

class ScalaOOP {

/*Moving on to objects, if a class is a blueprint, objects are prototypes of that blueprint. An object is essentially a real-world entity with state and behaviour. An object’s state is its data values at any point in time. Its behaviour is the functionality it performs.
So, Scala object is an instance of a class and is a runtime entity. For a class fruit, an Orange can be an object.
 */
 // Let’s take an example of Scala Class.
   class Car{
     var fuel:Float=0
     var color:String="Black"
  //Now let's declare a object for this class
  var fordEdge = new Car()
     }

  //Let's take another example. This time we'll use a primary constructor to initialize values.

  class Person(SSN: Int, Name:String){
    def sayHi(): Unit ={
      println("I'm " + Name + " and my SSN is " + SSN)
    }
  }
  //Now we create an object for this.
  val Kelvon = new Person(332211411, "Kelvon Patterson")

  //Finally we call the method on sayHi() on this object
  Kelvon.sayHi()

    //When we want to work with an object that we won't need to use again, we can declare it anonymously. Let's define a new class to say hi.

    class A {
      def sayHi(): Unit ={
        println("Hi")
      }
    }
    //Now, we create an anonymous object of this and call sayhi() on it.
  new A().sayHi()


}
