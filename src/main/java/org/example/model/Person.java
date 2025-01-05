package org.example.model;

public class Person {
    private final int id;
    private String name;
    private int age;
    private final String gender;
    private final int number;
    private final String email;


    public Person(int id, String name, int age, String gender, int number, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.number = number;
        this.email = email;
    }
}
