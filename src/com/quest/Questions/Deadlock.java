package com.quest.Questions;

public class Deadlock {

    public static void main(String[] args) {

        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        
        resourceA.setResourceB(resourceB);
        resourceB.setResourceA(resourceA);

        // Start the "deadlock" scenario by invoking the method on resource A
        resourceA.performActionA();  // This will start the circular dependency
    }
}

class ResourceA {
    private ResourceB resourceB;

    public void setResourceB(ResourceB resourceB) {
        this.resourceB = resourceB;
    }

    public void performActionA() {
        System.out.println("Resource A: Trying to access Resource B.");
        resourceB.performActionB();  // This will cause a circular dependency
    }
}

class ResourceB {
    private ResourceA resourceA;

    public void setResourceA(ResourceA resourceA) {
        this.resourceA = resourceA;
    }

    public void performActionB() {
        System.out.println("Resource B: Trying to access Resource A.");
        resourceA.performActionA();  // This causes a circular dependency
    }
}


