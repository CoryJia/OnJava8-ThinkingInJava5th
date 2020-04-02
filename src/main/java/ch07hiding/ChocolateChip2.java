package ch07hiding;// hiding/ch07hiding.ChocolateChip2.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import ch07hiding.cookie2.Cookie;

public class ChocolateChip2 extends Cookie {
  public ChocolateChip2() {
   System.out.println("ch07hiding.ChocolateChip2 constructor");
  }
  public void chomp() { bite(); } // Protected method
  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.chomp();
  }
}
/* Output:
Cookie constructor
ch07hiding.ChocolateChip2 constructor
bite
*/
