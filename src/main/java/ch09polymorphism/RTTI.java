package ch09polymorphism;// polymorphism/ch09polymorphism.RTTI.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Downcasting & Runtime type information (ch09polymorphism.RTTI)
// {ThrowsException}

class Useful {
  public void f() {}
  public void g() {}
}

class MoreUseful extends Useful {
  @Override
  public void f() {}
  @Override
  public void g() {}
  public void u() {}
  public void v() {}
  public void w() {}
}

public class RTTI {
  public static void main(String[] args) {
    Useful[] x = {
      new Useful(),
      new MoreUseful()
    };
    x[0].f();
    x[1].g();
    // Compile time: method not found in Useful:
    //- x[1].u();
    ((MoreUseful)x[1]).u(); // Downcast/ch09polymorphism.RTTI
    ((MoreUseful)x[0]).u(); // Exception thrown
  }
}
/* Output:
___[ Error Output ]___
Exception in thread "main"
java.lang.ClassCastException: Useful cannot be cast to
MoreUseful
        at ch09polymorphism.RTTI.main(ch09polymorphism.RTTI.java:31)
*/
