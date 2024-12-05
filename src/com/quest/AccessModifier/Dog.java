package com.quest.AccessModifier;

public class Dog extends Animal {
    public Dog(String name, int age, String sound, String species) {
        super(name, age, sound, species);
    }

    public void displayDetails() {
        System.out.println("Name: " + name); // Default access
        System.out.println("Species: " + species); // Public access
        showDetails(); // Public method
        makeSound(); // Protected method
        display(); // Default method
    }
    public void tryAccessPrivateMethod() {
        // System.out.println(getAgeMessage()); // Error: Cannot access private method
        System.out.println("Private method cannot be accessed directly from the subclass.");
    }
}



