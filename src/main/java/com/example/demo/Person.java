package com.example.demo;


import org.springframework.stereotype.Component;
@Component
public class Person {

    private String name;
    private String lasName;
    private int age;

    public Person() {
    }

    public Person(String name, String lasName, int age) {
        this.name = name;
        this.lasName = lasName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
