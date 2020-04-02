package ch13functional;// functional/RecursiveFibonacci.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class RecursiveFibonacci {
    IntCall fib;

    RecursiveFibonacci() {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) {
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for (int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));
    }


    /*static IntCall fib;

    public static void main(String[] args) {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);

        for (int i = 0; i < 10; i++) {
            System.out.println(fib.call(i));
        }
    }*/
}
/* Output:
0
1
1
2
3
5
8
13
21
34
55
*/
