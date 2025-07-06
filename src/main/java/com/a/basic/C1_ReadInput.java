package com.a.basic;

import java.util.Scanner;

public class C1_ReadInput {
    public static void main(String[] args) {
        // Scanner object used to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and a string:");
        int n = sc.nextInt();
        String s = sc.nextLine();
        double d = sc.nextDouble();

        System.out.println("Entered input is:");
        System.out.println(n);
        System.out.println(s);
        System.out.println(d);

    }
}
