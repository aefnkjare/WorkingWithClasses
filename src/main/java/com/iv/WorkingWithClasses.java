package com.iv;

import java.time.LocalDate;

//COOKIE CUTTER ANALOGY//
public class WorkingWithClasses {
    public static void main(String[] args){
        Person isaiah =new Person("Lil Zay Dawg", 21, "08-31-2001", false, "123-45-6789");

        isaiah.setName("Big Zay Dawg");
//        isaiah.name = "Lil Zay Dawg";
//        isaiah.age = 21;
//        isaiah.birthday = "08-31-2001";
//        isaiah.hasTattoo = false;

        System.out.println(isaiah.getName());

//        Person braynel =new Person();
//        braynel.name = "Braynel";
    }
}

class Person {
    // Properties
    private String name;
    private int age;
    private String birthday;
    private boolean hasTattoo;
    private String ssn;


    // Constructor mathod
    public Person(String name, int age, String birthday, boolean hasTattoo, String ssn){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.hasTattoo = hasTattoo;
        this.ssn = ssn;
    }

    // Methods- Getters and Setter
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}