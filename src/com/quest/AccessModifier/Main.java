package com.quest.AccessModifier;

public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog("Buddy", 5, "bark", "Canine");

            dog.displayDetails();
            dog.tryAccessPrivateMethod();
        }
    }
