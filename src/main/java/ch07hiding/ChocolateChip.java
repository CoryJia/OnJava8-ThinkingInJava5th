package ch07hiding;// hiding/ch07hiding.ChocolateChip.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Can't use package-access member from another package

import ch07hiding.cookie2.Cookie;

public class ChocolateChip extends Cookie {
  public ChocolateChip() {
    System.out.println("ch07hiding.ChocolateChip constructor");
  }
  public void chomp() {
    //- bite(); // Can't access bite
  }
  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.chomp();
  }
}
/* Output:
Cookie constructor
ch07hiding.ChocolateChip constructor
*/
