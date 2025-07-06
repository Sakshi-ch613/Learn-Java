package com.b.array;

public class A1_Arr {
    public static void main(String[] args) {
        int[] ar = {2,3,4,11,45};
       //System.out.println(ar[2]);

        //modifying array
        for(int i = 0; i<ar.length; i++) {
            if(ar[i]%3==0) ar[i] = 0;
        }

        for(int i = 0; i<ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
