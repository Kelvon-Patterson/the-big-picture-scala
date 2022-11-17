package Precipio
 import scala.math._

//Inheritance in Scala
class Shape3D (val height: Double){
var h : Double = height
  var result: Double = height
  def volume (): Unit ={
    result = h * h * h
//    prinln("Volume of shape (cube): " + result + " cm3")
  }
}

//class Cylinder(override val height: Double, val radius: Double) extends Shape3D(height){
//  var r : Double = radius
//  override def volume(): Unit ={
//    result = Pi * r * r * h
//    println("Volume of cylinder: " + result + " cm3")
//  }
//}
// Here we are initializing a trait called shape.
trait Shape{
  def area(): Unit = {
    println("Area of shape depends on the type of shape")
  }
}

class Circle extends Shape{
  override def toString = "circle"

  val myCircle = new Circle
  myCircle.area()
}

