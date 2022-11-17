package Precipio

object Getters_Setters extends App {

  class someClass{
    private[this] var q = 0
    def quantity: Int = q
//    def quantity_ = (b:Int) {q=b}
  }
  val s = new someClass
  s.quantity // should return = 0
}
