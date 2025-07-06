package com.a.basic;

public class G1_Palindrome {
    public static void main(String[] args) {
        int n = 121;
        if (n == reverse(n))
            System.out.println("Palindrome");
        else {
            System.out.println("Not Palindrome");
        }
    }


    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
}
