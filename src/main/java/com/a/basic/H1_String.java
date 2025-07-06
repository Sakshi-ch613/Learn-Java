package com.a.basic;

public class H1_String {
    public static void main(String[] args) {
       // basic1();
        //basic2();
        H1_String ob = new H1_String();
        ob.basic3();
    }

    private static void basic1() {
        String names = "Hellow Welcome Hi";
        names.toUpperCase();
        System.out.println(names);

        names = names.toUpperCase();
        System.out.println(names);

        String s2 = names.concat(" Vikas");
        System.out.println(s2);
    }

    private static void basic2() {
        String names = "What is your name";
        System.out.println("LowerCase: "+names.toLowerCase());
        System.out.println("UpperCase: "+names.toUpperCase());
        System.out.println("Length: "+names.length());
        System.out.println(names.endsWith("name"));

        String s3 = "ViKaS";
        System.out.println(s3.equalsIgnoreCase("viKas"));
    }

    private void basic3() {
        String s4 = " what is your name ";
        s4 = s4.trim();
        System.out.println(s4);

        String arr[] = s4.split(" ");    // {"what", "is", "your", "name"}
        System.out.println(arr[2]);

        System.out.println("Length of s4: "+s4.length());
        System.out.println("Length of arrya arr: "+arr.length);
    }


}
