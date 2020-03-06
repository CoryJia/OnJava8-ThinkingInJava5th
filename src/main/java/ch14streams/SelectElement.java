package ch14streams;// streams/SelectElement.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import static ch14streams.RandInts.*;

public class SelectElement {
  public static void main(String[] args) {
    System.out.println(rands().findFirst().getAsInt());
    System.out.println(
      rands().parallel().findFirst().getAsInt());
    System.out.println(rands().findAny().getAsInt());
    System.out.println(
      rands().parallel().findAny().getAsInt());
  }
}
/* Output:
258
258
258
242
*/