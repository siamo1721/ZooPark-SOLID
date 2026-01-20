package org.example.employees;

import org.example.animals.Animal;
import org.example.interfaces.Cleanable;
import org.example.interfaces.Feedable;

public class Keeper extends Employee implements Feedable, Cleanable {
    public Keeper(String name) {
        super(name);
    }

    @Override
    public void feed(Animal animal) {
        IO.println(name +" кормлю " + animal.getName());
    }

    @Override
    public void clean(Animal animal) {
        IO.println(name +" убираю вольер у " + animal.getName());
    }
}
