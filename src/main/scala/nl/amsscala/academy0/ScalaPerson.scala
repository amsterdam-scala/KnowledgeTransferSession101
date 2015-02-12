package nl.amsscala.academy0

class ScalaPerson(firstName: String , val /*no meaning*/lastName: String , var age: Int ) {
  def toList = List(firstName, lastName, age)

  override def toString = toList.mkString("Person(", ", ", ")")
}

/*C:\Users\FransAdm\IdeaProjects\Kennisoverdrachtssessie>javap -private target\scala-2.11\classes\nl\amsscala\academy0\ScalaPerson.class
Compiled from "ScalaPerson.scala"
public class nl.amsscala.academy0.ScalaPerson {
  private java.lang.String firstName;
  private java.lang.String lastName;
  private int age;
  
  public java.lang.String firstName();
  public void firstName_$eq(java.lang.String);
  
  public java.lang.String lastName();
  public void lastName_$eq(java.lang.String);
  
  public int age();
  public void age_$eq(int);
  
  public scala.collection.immutable.List<java.lang.Object> toList();
  public java.lang.String toString();
  public nl.amsscala.academy0.ScalaPerson(java.lang.String, java.lang.String, int);
}*/