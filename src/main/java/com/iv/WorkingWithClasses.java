package com.iv;

import java.time.LocalDate;

//COOKIE CUTTER ANALOGY//
public class WorkingWithClasses {
    public static void main(String[] args){
        Person isaiah =new Person();
        isaiah.name = "Lil Zay Dawg";
        isaiah.age = 21;
        isaiah.birthday = "08-31-2001";
        isaiah.hasTattoo = false;

        System.out.println(isaiah.name);

//        Person braynel =new Person();
//        braynel.name = "Braynel";
    }
}

class Person {
    // Properties
    String name;
    int age;
    String birthday;
    Boolean hasTattoo;


    // Constructor

    // Methods


}