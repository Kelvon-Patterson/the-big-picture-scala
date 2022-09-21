
object Classes extends App {

  //How to create a class
  class Person{
    val john = new Person
    val mary = new Person


  }

  class Employee{
    private var salary: Int = 100
    //getters and setters to access the private class
    def getSalary() = salary
    def setSalary(newSalary: Int ) ={
      salary = newSalary
    }
    val john = new Employee
    val mary = new Employee
    john.salary = 100
    mary.salary = 120



  }


}
