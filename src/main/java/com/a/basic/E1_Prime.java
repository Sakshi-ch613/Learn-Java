package com.a.basic;

public class E1_Prime {

    public static void main(String[] args) {
        // check number is prime or not
        //System.out.println(isPrime(9));

        // print prime numbers upto n
        printPrimeNumbersUpToN(8);
    }

    private static void printPrimeNumbersUpToN(int m) {
        for(int i=2; i<=m; i++) {
            if(isPrime(i)) {
                System.out.print(i+", ");
            }
        }
    }


    private static boolean isPrime(int n) {
        boolean f = true;
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                f = false; break;
            }
        }
        return f;
    }
}