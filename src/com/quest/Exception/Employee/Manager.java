package com.quest.Exception.Employee;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) throws InvalidInputException {
        super(name, age, salary);
        if (teamSize < 1) {
            throw new IllegalArgumentException("Team size must be greater than 0");
        }
        this.teamSize = teamSize;
    }

    public int getTeamSize() throws InvalidInputException {
        if (teamSize < 1) {
            throw new IllegalArgumentException("Team size must be greater than 0");
        }
            return 0;
    }


    @Override
    public String toString() {
        return super.toString() + "\tTeam Size: " + teamSize;
    }
}

