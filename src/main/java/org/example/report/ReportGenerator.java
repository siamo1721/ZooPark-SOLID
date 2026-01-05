package org.example.report;

import org.example.animals.Animal;

import java.util.List;

public interface ReportGenerator {
    void generate(List<Animal> animals);
}
