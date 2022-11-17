package Precipio
import java.io._
class Car (milesPerGallon: Int , gallonsPerTank: Int){
var mpg: Int = milesPerGallon
  var gpt: Int = gallonsPerTank
  var mpt: Int = 0


  //class method
  def milesPerTank(): Unit ={
    mpt = mpg * gpt
    println("Number of Miles Per Tank: " + mpt)
  }
}

object Volvo  {
  def main(args: Array[String]): Unit ={
    val sedan = new Car(19,18)
    sedan.milesPerTank()
  }
}

object Car {
  def main(args: Array[String]): Unit = {
    val SUV = new Car(25, 20)
    SUV.milesPerTank()
  }
}
