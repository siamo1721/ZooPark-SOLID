package org.example.animals;

public class Snake extends Animal{
    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        IO.println("Шшшшшш");
    }
}
