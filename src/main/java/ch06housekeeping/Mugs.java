package ch06housekeeping;// housekeeping/ch06housekeeping.Mugs.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Instance initialization

class Mug {
  Mug(int marker) {
    System.out.println("Mug(" + marker + ")");
  }
}

public class Mugs {
  Mug mug1;
  Mug mug2;
  { // [1]
    mug1 = new Mug(1);
    mug2 = new Mug(2);
    System.out.println("mug1 & mug2 initialized");
  }
  Mugs() {
    System.out.println("ch06housekeeping.Mugs()");
  }
  Mugs(int i) {
    System.out.println("ch06housekeeping.Mugs(int)");
  }
  public static void main(String[] args) {
    System.out.println("Inside main()");
    new Mugs();
    System.out.println("new ch06housekeeping.Mugs() completed");
    new Mugs(1);
    System.out.println("new ch06housekeeping.Mugs(1) completed");
  }
}
/* Output:
Inside main()
Mug(1)
Mug(2)
mug1 & mug2 initialized
ch06housekeeping.Mugs()
new ch06housekeeping.Mugs() completed
Mug(1)
Mug(2)
mug1 & mug2 initialized
ch06housekeeping.Mugs(int)
new ch06housekeeping.Mugs(1) completed
*/
