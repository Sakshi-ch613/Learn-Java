package com.proj.test.service;


import lombok.Data;

@Data
public class Person {
    private long aadhar;
    private String firstName;
    private int age;
    static String houseColor;

    public Person(long aadhar, String firstName, int age) {
        this.aadhar = aadhar;
        this.firstName = firstName;
        this.age = age;
    }

    public Person(){}

}



