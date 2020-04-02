package ch20generics;// generics/Fibonacci.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Generate a Fibonacci sequence

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Fibonacci implements Supplier<Integer> {
    private int count = 0;

    @Override
    public Integer get() {
        return fib(count++);
    }

    private int fib(int n) {
        /*if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);*/

        int f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        Stream.generate(new Fibonacci()).limit(20).map(i -> i + " ").forEach(System.out::print);
    }
}
/* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597
2584
*/
