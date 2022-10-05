package DataFlairTutorial

object MethodOverloading extends App {

  //TODO: What is method overloading?
  // Scala Method Overloading is when one class has more than one method with the same name but different signature. ( Different parameters but same method name.

  //Ex: 1
  class sayHello{
    def hello(): Unit ={
      println("Hello, user ")
    }
    def hello(admin:String): Unit ={
      println("Hello, " + admin)
    }

    def hello(admin: String , guest: String): Unit ={
      println("Hello, " + admin, "Hello, " + guest)
    }
    val name = "kelvon"
    hello(name)
  }


   class Calculator{
     def sum(a:Int,b:Int): Unit = {
       var sum=a+b
       println(sum)
       }
     def sum(a:Double,b:Double): Unit = {
       var sum=a+b
       println(sum)
       }
     }
   var c=new Calculator()
   c.sum(1,2)



































}
