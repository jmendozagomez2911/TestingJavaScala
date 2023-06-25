package scalas.test.OOBasics

object OOBasics extends App {

  val person1 = new Person("John", 26)
  //println(person.age) age is a class parameter, not a class member that you can access with dot operator
  val person2 = new Person("Jose", 28)
  val person3 = new Person("Javier", 28)
  println(person1.edadigual(person2))
  println(person2.edadigual(person3))


}
//CLASS INSIDE OR OUTSIDE OBJECT ????
//If you define a class outside an object, it can be accessed from other classes, objects or packages in your codebase.
// This is useful when you want to create a reusable component that can be used in multiple places.
//
//If you define a class inside an object, it becomes a member of that object and can only be accessed by the other members of that object.
// This is useful when you want to encapsulate related functionality together and prevent it from being accessed by other parts of the codebase.

//CONSTRUCTOR of class Person
//NAME AND AGE are both val parameters, which means their values cannot be modified after the class is instantiated
class Person(name: String,val age: Int) {
  //CLASS PARAMETERS ARE NOT FIELDS. YOU CAN'T ACCESS THEM (e.g. FOR PRINT) UNLESS YOU PUT "VAL" INSIDE PARAMETERS. USE GETTER AND SETTER METHOD

  def edadigual(persona2: Person) : Boolean = age == persona2.age


}