package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        int x = reverseDigits(229);
        System.out.println(x);

    }

    public static int reverseDigits(int number){
       int first;
       int second;
       int third;
       first = number  % 10;
       third = number / 100;
       second = number - first - (third * 100);
       int inverseNumber = third + second + (first * 100);
       return inverseNumber;

    }

}
