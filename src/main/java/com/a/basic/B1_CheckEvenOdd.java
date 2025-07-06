package com.a.basic;

public class B1_CheckEvenOdd {
    public static void main(String[] args) {
        boolean b = isEven(10);
        System.out.println(b);

    }

    /**
     *
     * @param num - number to test whether it is ever or odd
     * @return - return boolean true if num is even else false
     */
    public static boolean isEven(int num) {
        return num%2==0;
    }
}
