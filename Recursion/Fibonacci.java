// Program to print Nth Fibonacci number

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibm1 = fib(n - 1);
        int fibm2 = fib(n - 2);
        int fibn = fibm1 + fibm2;

        return fibn;
        // return fib(n-1) + fib(n-2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }
}
