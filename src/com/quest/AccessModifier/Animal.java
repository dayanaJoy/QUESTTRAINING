package com.quest.AccessModifier;

public class Animal {
    String name;
    private int age;
    protected String sound;
    public String species;

    public Animal(String name, int age, String sound, String species) {
        this.name = name;
        this.age = age;
        this.sound = sound;
        this.species = species;
    }

    private String getAge() {
        return "Age: " + age + " years";
    }

    // Default method
    void display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Species: " + species);
    }

    // Protected method
    protected void makeSound() {
        System.out.println(name + " makes a " + sound + " sound.");
    }

    // Public method
    public void showDetails() {
        System.out.println(getAge()); // Accessing private method within the same class
    }
}

