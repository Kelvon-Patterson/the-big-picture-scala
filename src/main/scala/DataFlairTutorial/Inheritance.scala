package DataFlairTutorial

class Inheritance {

  //TODO : When a class inherits from another, it means it extends another. We use the ‘extends’ keyword for this. This lets a class inherit members from the one it extends and lets us reuse code.
  // The class that extends is the subclass, the child class, or the derived class. The other class is the superclass, the parent class, or the base class.

  class Person{
    var SSN: String = "999-99-9999"
  }



  class Student extends Person(){
    var enrollment_no: String = "08333921345"
    println("SSN = " + SSN)
    println("enrollment_no = " + enrollment_no)

  }
   // In this example, we have two classes- Person and Student. We make Student extend Person. This means a Student is a Person.
  //Since Student extends Person, it inherits the attribute holding the social security number. In class Student, we print SSN and enrolment_no. Finally, we create an object of class Student.


  //TODO : TYPES OF INHERITANCE -- Scala supports 5 types of inheritance

  // A.Single Inheritance -- Scala single-level inheritance is when one class inherits from a single other class.

  // B. Multilevel Inheritance -- When one class extends another, which in turn extends another

  // C. Multiple Inheritance -- When one class inherits from multiple base classes

class A {
println("A")
}

  class B extends A {
    println("B")
  }

  class C extends B {
    println("C")
    // class C can use all methods from class A and class B
  }


  def main(args: Array[String]):Unit={
    trait A{
      var length:Int= _
      def action={
        length=length+5
      }
    }
    trait B{
      var height:Int = _
      def action={
        height = height + 1
      }
    }
    class C extends A with B{
      length=3;
      height+=6;
      override def action={
        super[A].action
        super[B].action
      }
    }
    var c=new C
    c.action
    println(c.height)
    println(c.length)
  }















}
