package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static void main(String[] args){
        System.out.println(fiboNumber(10));

    }

    public static int fiboNumber(int n){
        int sum = 0;
        int k1 = 1;
        int k2 = 0;
         for (int i = 1; i <= n; i++){
            k2 = k2 + k1;
            k1 = k2 - k1;

        }
        return k2;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){
        return true;
    }

    public static boolean containsDigit(int number, int digit){
        return true;
    }

}
