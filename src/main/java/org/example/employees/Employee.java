package org.example.employees;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void startWork() {
        IO.println(name + " вышел на работу");
    }
}