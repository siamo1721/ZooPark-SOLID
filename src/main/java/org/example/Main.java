package org.example;

import org.example.animals.Animal;
import org.example.animals.Lion;
import org.example.animals.Parrot;
import org.example.animals.Snake;
import org.example.employees.Keeper;
import org.example.employees.Veterinarian;
import org.example.report.ReportGenerator;
import org.example.report.ZooReportService;

import java.util.List;

public class Main {
    static void main() {
        Animal lion = new Lion("Симба");
        lion.makeSound();
        Animal parrot = new Parrot("Кеша");
        parrot.makeSound();
        Animal snake = new Snake("Каа");
        snake.makeSound();

        List<Animal> animals = List.of(lion, parrot, snake);

        Keeper keeper = new Keeper("Иван");
        Veterinarian vet = new Veterinarian("Анна");

        keeper.startWork();
        keeper.feed(lion);
        keeper.clean(lion);

        vet.startWork();
        vet.heal(snake);

        ReportGenerator report = new ZooReportService();
        report.generate(animals);
    }
}
