package Lightbend

object ValAndVar extends App {

  //Mutable Fields

  class Hello{
    var message: String = "Hello"

    val h = new Hello;

    h.message = "hi there"

    //Were able to modify the var message

    //only use vars for specific use cases(performance optimization.)

    //Class parameters are not fields

  }


}
