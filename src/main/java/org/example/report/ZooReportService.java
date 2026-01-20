package org.example.report;

import org.example.animals.Animal;

import java.util.List;

public class ZooReportService implements ReportGenerator {

    @Override
    public void generate(List<Animal> animals){
        IO.println("Отчет по зоопарку: ");

        IO.println("Общее количество животных: " + animals.size());

        for (Animal animal : animals) {
            IO.println("- " + animal.getName() + " (" + animal.getClass().getSimpleName() + ")");
        }
    }
}
