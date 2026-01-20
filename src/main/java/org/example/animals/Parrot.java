package org.example.animals;

public class Parrot extends Animal{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        IO.println("Я могу повторять за тобой слова");
    }
}
