package nl.amsscala.academy1

class Params0(defVar1: Int /*nothing*/, var publicVar2: Int/*public val*/, private var privVar3: Int /*private var*/,
              val publicVal4: Int /*public val*/, private val privVal4: Int /*priv val*/) {
  /*Compiled from "params.scala"
  public class nl.amsscala.academy1.Params0 {
  private int publicVar2;
  private int privVar3;
  private final int publicVal4;
  private final int privVal4;
  
  public int publicVar2();
  public void publicVar2_$eq(int);
  
  private int privVar3();
  private void privVar3_$eq(int);
  
  public int publicVal4();
  
  private int privVal4();
  
  public nl.amsscala.academy1.Params0(int, int, int, int, int);
}
*/
}

class Params1(defVar1: Int /*only val field*/, var publicVar2: Int /**/, private var privVar3: Int /**/,
              val publicVal4: Int /**/, private val privVal4: Int /**/) {
  override def toString = "" + defVar1 + publicVar2 + privVar3 + publicVal4 + privVal4
  /*Compiled from "params.scala"
public class nl.amsscala.academy1.Params1 {
  private final int defVar1;
  private int publicVar2;
  private int privVar3;
  private final int publicVal4;
  private final int privVal4;
  
  public int publicVar2();
  public void publicVar2_$eq(int);
  
  private int privVar3();
  private void privVar3_$eq(int);
  
  public int publicVal4();
  
  private int privVal4();
  
  public java.lang.String toString();
  public nl.amsscala.academy1.Params1(int, int, int, int, int);
}*/
}

case class Params2(defVar1: Int /**/, var publicVar2: Int/**/, private var privVar3: Int /**/,
              val publicVal4: Int /**/, private val privVal4: Int /**/) {
  /*Compiled from "params.scala"
public class nl.amsscala.academy1.Params2 implements scala.Product,scala.Serializable {
  private final int defVar1;
  private int publicVar2;
  private int privVar3;
  private final int publicVal4;
  private final int privVal4;
  
  public static scala.Option<scala.Tuple5<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>> unapply(nl.amsscala.academy1.Params2);
  public static nl.amsscala.academy1.Params2 apply(int, int, int, int, int);
  public static scala.Function1<scala.Tuple5<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>, nl.amsscala.academy1.Params2> tupled();
  public static scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, nl.amsscala.academy1.Params2>>>>> curried();

  public int defVar1();
  
  public int publicVar2();
  public void publicVar2_$eq(int);
  
  private int privVar3();
  public int privVar3$1();
  private void privVar3_$eq(int);
  
  public int publicVal4();
  
  public int privVal4$1();
  private int privVal4();
  
  public nl.amsscala.academy1.Params2 copy(int, int, int, int, int);
  public int copy$default$1();
  public int copy$default$2();
  public int copy$default$3();
  public int copy$default$4();
  public int copy$default$5();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public nl.amsscala.academy1.Params2(int, int, int, int, int);
}*/
}

case class Params3(defVar1: Int /*only val field*/, var publicVar2: Int /**/, private var privVar3: Int /**/,
              val publicVal4: Int /**/, private val privVal4: Int /**/) {
  override def toString = "" + defVar1 + publicVar2 + privVar3 + publicVal4 + privVal4
  /*Compiled from "params.scala"
public class nl.amsscala.academy1.Params3 implements scala.Product,scala.Serializable {
  private final int defVar1;
  private int publicVar2;
  private int privVar3;
  private final int publicVal4;
  private final int privVal4;
  
  public static scala.Option<scala.Tuple5<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>> unapply(nl.amsscala.academy1.Params3);
  public static nl.amsscala.academy1.Params3 apply(int, int, int, int, int);
  public static scala.Function1<scala.Tuple5<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>, nl.amsscala.academy1.Params3> tupled();
  public static scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, nl.amsscala.academy1.Params3>>>>> curried();

  public int defVar1();
  
  public int publicVar2();
  public void publicVar2_$eq(int);
  private int privVar3();
  
  public int privVar3$2();
  private void privVar3_$eq(int);
  

  public int publicVal4();
  
  public int privVal4$2();
  private int privVal4();
  
  public java.lang.String toString();
  public nl.amsscala.academy1.Params3 copy(int, int, int, int, int);
  public int copy$default$1();
  public int copy$default$2();
  public int copy$default$3();
  public int copy$default$4();
  public int copy$default$5();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public boolean equals(java.lang.Object);
  public nl.amsscala.academy1.Params3(int, int, int, int, int);
}*/
}
