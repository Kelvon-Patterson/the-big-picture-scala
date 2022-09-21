object forLoops extends App {

/*  Syntax
     for (var a <- Range){
    statements();
  }
*/
  //   <- __ this is the called the generator
  //Example
  for(i <- 1 to 5){
    println("i using to " + i)
  }
  for(i <- 1 until 6){
    println("i using until " + i)
  }
  for(i <- 1 until 6; j <- 1 to 3 ){
    println("i using until " + i + " " + j)
  }

  //You can use for loops to loop over list as well

  val lst = List(1,2,3,4,5,35,32,667)

  for(i <- lst){
    println("i using lst " + i)
  }

  for(i <- lst; if i <6){
    println("i using using filters " + i)
  }

  /*  Syntax
     for (var a <- Range){
    expression();
  }
*/

 val result = for {
   i <- lst
   if i <6} yield {
   i*i
 }
  println("result = " result)
}
