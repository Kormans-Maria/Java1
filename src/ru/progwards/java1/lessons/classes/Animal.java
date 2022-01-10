package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }

    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }

    public Animal(double weight) {
        this.weight = weight;
    }


    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    public String toString() {
        return "I am " + this.getKind() + ", eat " + this.getFoodKind();
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        double x = 0.02;
        return x;
    }
}
