package com.quest.Collections.List;

public class Person {
    String name;
    int age;
    String location;
    String gender;

    public Person(String name, int age, String location, String gender) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printPerson() {
        System.out.println("Name: " + name + "\tAge: " + age + "\tLocation: " + location + "\t Gender: " + gender);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Location: " + location + ", Gender: " + gender;
    }
}
