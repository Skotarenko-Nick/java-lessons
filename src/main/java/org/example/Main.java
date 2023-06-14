package org.example;

import java.lang.reflect.ReflectPermission;

public class Main {
    public static void main(String[] args) {

        Pool pool = new Pool(21);
        System.out.println("Pool capacity: " + pool.capacity());
        EarthPerson gena = new EarthPerson();
        System.out.println("Pool capacity: " + pool.capacity(gena));
        PoolInstructor matushka = new PoolInstructor();
        System.out.println("Pool capacity: " + pool.capacity(matushka));

// Enum ....
//        System.out.println("Max age: " + AgeManagment.MAX_AGE.getAge());
//        System.out.println("Min age: " + AgeManagment.MIN_AGE.getAge());




// Polymorphysm ...
//        Sweamble gena = new EarthPerson();
//        gena.dive();
//
//        PoolInstructor instructor = new PoolInstructor();
//        instructor.setPerson(gena);
//        instructor.teach();





// Incapsulation ....
//        System.out.println("Gena's age: " + gena.getAge());
//        gena.setAge(36); //*
//        System.out.println("Gena's age: " + gena.getAge());
//        gena.setAge(20); //*
//        System.out.println("Gena's age: " + gena.getAge());
//        gena.dive();
//        System.out.println("Gena's age: " + gena.getAge());
    }
}