package com.c.abst;

public class MyAdvanceCalculator extends AdvanceCalculator {


    @Override
    double add(double a, double b) {
        return a+b;
    }

    @Override
    double subtract(double a, double b) {
        return a-b;
    }

    @Override
    double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    // its own concrete method
    public double calculateCircleAre(double radius) {
        return PI*radius*radius;
    }
}
