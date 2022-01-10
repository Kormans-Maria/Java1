package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{
    public Cow(double weight) {
        super(weight);
    }

    @Override
    public double getFoodCoeff(){
        double d = 0.05;
        return d;
    }
}
