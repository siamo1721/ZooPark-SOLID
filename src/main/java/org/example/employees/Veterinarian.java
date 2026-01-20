package org.example.employees;

import org.example.animals.Animal;
import org.example.interfaces.Healable;

public class Veterinarian extends Employee implements Healable {

    public Veterinarian(String name) {
        super(name);
    }

    @Override
    public void heal(Animal animal) {
        IO.println(name + " лечит животное " + animal.getName());
    }
}
