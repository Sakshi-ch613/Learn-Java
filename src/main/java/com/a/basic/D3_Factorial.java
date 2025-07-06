package com.a.basic;

import java.util.Scanner;

public class D3_Factorial {

    // Iterative method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial (recursive) of " + number + " is: " + factorialRecursive(number));
            System.out.println("Factorial (iterative) of " + number + " is: " + factorialIterative(number));
        }

        scanner.close();
    }
}
