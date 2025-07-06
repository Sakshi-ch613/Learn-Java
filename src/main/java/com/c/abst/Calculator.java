package com.c.abst;

public interface Calculator {
    double PI = 3.1416;

    // Adds two numbers and returns the result
    int add(int a, int b);

    // Subtracts the second number from the first and returns the result
    int subtract(int a, int b);

    // Multiplies two numbers and returns the result
    int multiply(int a, int b);

    // Divides the first number by the second and returns the result
    // Throws ArithmeticException if the divisor is zero
    int divide(int a, int b) throws ArithmeticException;


}
