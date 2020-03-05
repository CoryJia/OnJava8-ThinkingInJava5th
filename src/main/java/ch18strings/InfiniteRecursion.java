package ch18strings;// strings/InfiniteRecursion.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Accidental recursion
// {ThrowsException}
// {VisuallyInspectOutput} Throws very long exception

import java.util.*;
import java.util.stream.*;

public class InfiniteRecursion {
    @Override
    public String toString() {
      /**
       这里发生了自动类型转换，由 InfiniteRecursion 类型转换为 String 类型。
       因为编译器发现一个 String 对象后面跟着一个 “+”，而 “+” 后面的对象不是
       String，于是编译器试着将 this 转换成一个 String。它怎么转换呢？
       正是通过调用 this 上的 toString() 方法，于是就发生了递归调用。
       */
        return
//                " InfiniteRecursion address: " + this + "\n";
        " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }
}
