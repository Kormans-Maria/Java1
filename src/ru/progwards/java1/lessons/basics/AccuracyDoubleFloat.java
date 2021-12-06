package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {

    }
    public static double volumeBallDouble(double radius) {
        double result = (4 * 3.14 * radius * radius * radius) /3;
        return result;
    }

    public static float volumeBallFloat(float radius){
        float result = (float) (4f/3f * 3.14f * radius * radius * radius);
        return result;
    }

    public static double calculateAccuracy(double radius){
        double result = volumeBallDouble(radius) - volumeBallFloat((float) radius);
        return result;
    }
}
