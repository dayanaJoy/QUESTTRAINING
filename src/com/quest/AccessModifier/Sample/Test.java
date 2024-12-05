package com.quest.AccessModifier.Sample;

public class Test {

        // Public method - accessible everywhere
        public void publicMethod() {
            System.out.println("Public method: Accessible everywhere.");
        }

        // Protected method - accessible within the same package or subclasses
        protected void protectedMethod() {
            System.out.println("Protected method: Accessible within package and subclasses.");
        }

        // Default method - accessible within the same package
        void defaultMethod() {
            System.out.println("Default method: Accessible within the same package.");
        }

        // Private method - accessible only within the same class
        private void privateMethod() {
            System.out.println("Private method: Accessible only within this class.");
        }
        //for accessing private method it should convert to public
       public void accessprivate() {
            System.out.println("Access private method: Accessible only within this class.");
            privateMethod();
       }
    }

