package org.example.animals;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        IO.println("Рррррр");
    }
}
