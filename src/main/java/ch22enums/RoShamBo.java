// enums/RoShamBo.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Common tools for RoShamBo examples
package ch22enums;

import onjava.*;

public class RoShamBo {
    public static <T extends Competitor<T>>
    void match(T a, T b) {
//       Outcome outcome = a.compete(b);
//        System.out.println(outcome);
        System.out.println(
                a + " vs. " + b + ": " + a.compete(b));
    }

    public static <T extends Enum<T> & Competitor<T>>
    void play(Class<T> rsbClass, int size) {
        for (int i = 0; i < size; i++)
            match(
                    Enums.random(rsbClass), Enums.random(rsbClass));
    }
}