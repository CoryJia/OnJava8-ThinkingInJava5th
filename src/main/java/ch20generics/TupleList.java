package ch20generics;// generics/TupleList.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Combining generic types to make complex generic types

import ch09polymorphism.Amphibian;
import onjava.Tuple4;

import java.util.ArrayList;

public class TupleList<A, B, C, D>
extends ArrayList<Tuple4<A, B, C, D>> {
  public static void main(String[] args) {
    TupleList<Vehicle, Amphibian, String, Integer> tl =
            new TupleList<>();
    tl.add(TupleTest2.h());
    tl.add(TupleTest2.h());
    tl.forEach(System.out::println);
  }
}
/* Output:
(Vehicle@7cca494b, Amphibian@7ba4f24f, hi, 47)
(Vehicle@3b9a45b3, Amphibian@7699a589, hi, 47)
*/
