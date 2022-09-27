package DataFlairTutorial

object SingletonAndCompanionObjects {

  //TODO: In scala an object is a class with exactly one instance. Like a lazy val it creates lazily when we reference it. It is a value, and as a top-level value, it is a Scala singleton

  //Ex: Of singleton object

  object SingletonObject{
     def greet(): Unit ={
       println("Hello")
     }
  }
  SingletonObject.greet()

  class CompanionClass{
    def greet(): Unit ={
      println("Hello")
    }
  }
  def main(args: Array[String]): Unit ={
    new CompanionClass().greet()
    println("Companion Object")
  }
}
