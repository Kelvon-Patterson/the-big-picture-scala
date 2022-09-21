package Module05

object Person {
  def apply(firstName: String, lastName: String)= new Person(firstName,lastName)
}

class Person(firstName: String, lastName: String){
def getName:String = firstName + " " + lastName
}
