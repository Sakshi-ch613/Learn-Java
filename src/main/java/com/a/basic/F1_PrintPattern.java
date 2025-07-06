package com.a.basic;

public class F1_PrintPattern {
    public static void main(String[] args) {
        //boolean b = isPrime(19);
        printPattern1(7);
    }

    private static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int k=n-i; k>=1; k--) {
                System.out.print("   ");
            }

            for(int j=1; j<=i*2-1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


}
