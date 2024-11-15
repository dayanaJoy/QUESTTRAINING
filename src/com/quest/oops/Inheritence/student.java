package com.quest.oops.Inheritence;

public class student extends Person {
    private String schoolname;

    public student(String name,int age,String schoolname)   {
        super(name,age);
        this.schoolname=schoolname;
    }
    public void study() {
        System.out.println("student study" + this.name);
    }
    public void nameDisplay()   {
        super.nameDisplay();
        System.out.println("I study at "+this.schoolname);
    }
}
