object Functions extends App {
// the return type of the function is optional.
  def product1(a: Int,b: Int) = {
    if (a == 0 || b == 0) 0
    else a*b
  }
  // Or we could do the same function on a single line and still get the same output
   def product2(a:Int, b: Int)= a*b

  println(product1(2,10))
   }




