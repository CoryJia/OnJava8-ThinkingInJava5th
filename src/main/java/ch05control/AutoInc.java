package ch05control;// operators/ch04operators.ch05control.AutoInc.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates the ++ and -- operators

public class AutoInc {
  public static void main(String[] args) {
    int i = 1;
    System.out.println("i: " + i);
    System.out.println("++i: " + ++i); // Pre-increment
    System.out.println("i++: " + i++); // Post-increment
    System.out.println("i: " + i);
    System.out.println("--i: " + --i); // Pre-decrement
    System.out.println("i--: " + i--); // Post-decrement
    System.out.println("i: " + i);
  }
}
/* Output:
i: 1
++i: 2
i++: 2
i: 3
--i: 2
i--: 2
i: 1
*/
