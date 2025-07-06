package com.c.abst;

public abstract class AdvanceCalculator implements Calculator{

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // some own concrete methods
    public int add(int... ar) {
        int sum = 0;

        for(int i=0; i< ar.length; i++) {
            sum = sum+ar[i];
        }
        return sum;
    }

    // Adds two numbers and returns the result
    abstract double add(double a, double b);

    // Subtracts the second number from the first and returns the result
    abstract double subtract(double a, double b);

    // Multiplies two numbers and returns the result
    abstract double multiply(double a, double b);

    // Divides the first number by the second and returns the result
    // Throws ArithmeticException if the divisor is zero
    abstract double divide(double a, double b) throws ArithmeticException;




}
