package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static int fiboNumber(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;

        }
        return sum;
    }
}
