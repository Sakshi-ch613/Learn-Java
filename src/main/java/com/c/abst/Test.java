package com.c.abst;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Calculator cal;

        Collection<String> al = new ArrayList<>();


        List<String> s = new ArrayList<>();
        s.add("vikas");
        s.add("rajaura");
        printCollection(s);
        Set<String> hs = new HashSet<>();
        printCollection(hs);

        al = new HashSet<>();


        // some condition
        cal = new MyAdvanceCalculator();

        // some other condition
        //cal = new YourCalculator()


        //System.out.println(cal.calculateCircleAre(7));

        //AdvanceCalculator cal = new MyAdvanceCalculator();

        //AdvanceCalculator ob = new AdvanceCalculator();

        //System.out.println(ob.add(2,5));
    }

    private static void printCollection(Collection<String> coll) {
        for(String s: coll) {
            System.out.println(s);
        }

        //coll.stream().forEach(System.out::println);
    }
}
