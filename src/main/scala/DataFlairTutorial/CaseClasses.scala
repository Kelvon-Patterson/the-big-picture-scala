package DataFlairTutorial

class CaseClasses {

  //TODO: A Scala Case Class is like a regular class, except it is good for modeling immutable data. It also serves useful in pattern matching, such a class has a default apply() method which handles object construction. A scala case class also has all vals, which means they are immutable.

  // Defining a Minimal Case Class in Scala--
  // To define a minimal scala case class, we need the keywords 'case class', an identifier, and a parameter list. We can keep the parameter list empty.
  // Let's define a class 'Song'
  case class Song(title: String, artist: String, track: Int)

  //And now its time to create a scala object for this scala class
  val stay: Song = Song("Stay", "Rhianna", 4)

  //To create a scala object of a case class, we don't use the keyword 'new'. This is because its default apply() method handles the creation of objects.
  // Let's try accessing the title of this object:

  println(stay.title)
  println(stay.artist)
  println(stay.track)
  // We cannot mutate the object. It will fail.

  //Now, let's take a look at how to compare two Scala case classes.
  val cryBaby: Song = Song("Cry Baby"," Melanie Martinez", 7)
  val cry_Baby: Song = Song("Cry Baby"," Melanie Martinez", 7)

  println(cryBaby==cry_Baby)
  //renders true

  //Since a Scala case class is immutable, we might sometimes need a copy to make changes without changing the original. So, we now see how to create a shallow copy of it. But before that, let's see a little about shallow and deep copies.
  //--- A deep copy is another object where any changes we make to it don't reflect in the original object.
  //--- A shallow copy, however, is one where changes to the copy do reflect the original.

  //So, Scala uses the method copy() to carry out a shallow copy.
  val chandelier: Song = Song("Chandelier","Sia", 3)
  val chandelier1: Song = chandelier.copy("Sia","Chandelier", 3)





}
