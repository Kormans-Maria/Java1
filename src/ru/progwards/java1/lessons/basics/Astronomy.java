package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args) {

    }
    public static Double sphereSquare(Double r){
        double s = 4 * 3.14 * r *r;
        return s;
    }

    public static Double earthSquare(){
        double s = sphereSquare(6371.2);
        return s;
    }

    public static Double mercurySquare(){
        double s = sphereSquare(2439.7);
        return s;
    }

    public static Double jupiterSquare(){
        double s = sphereSquare(71492.0);
        return s;
    }

    public static Double earthVsMercury(){
        double v = earthSquare()/mercurySquare();
        return v;
    }

    public static Double earthVsJupiter(){
        double v = earthSquare()/jupiterSquare();
        return v;
    }




}
