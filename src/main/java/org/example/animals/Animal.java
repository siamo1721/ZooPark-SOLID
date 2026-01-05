package org.example.animals;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void makeSound();
}
