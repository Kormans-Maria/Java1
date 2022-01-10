package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {


    public Duck(double weight) {
        super(weight);
    }

    @Override
    public double getFoodCoeff() {
        double d = 0.04;
        return d;
    }

}