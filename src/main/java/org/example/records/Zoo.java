package org.example.records;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record Zoo(String name, List<Animal> animals) {
    public Zoo(String name) {
        this(name, new ArrayList<>());
    }
    public Zoo(String name, List<Animal> animals) {
        this.name = Objects.requireNonNull(name);
        this.animals = Objects.requireNonNull(animals);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public double computeTotalFeedAmount() {
        double sum = 0.0;
        for (Animal animal : animals)
            sum += animal.species().feedAmount_gPerDay();
        return sum;
    }

    public void printZoo() {
        System.out.printf("Zoo: \"%s\"%n", name);
        for (Animal animal : animals) {
            System.out.printf("   %s%n", animal);
        }
    }
}
