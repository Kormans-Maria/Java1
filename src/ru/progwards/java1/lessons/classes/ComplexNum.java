package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    double a;
    double b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        String s = this.a + "+" + this.b + "i";
        return s;
    }

    public ComplexNum add(ComplexNum num){
        return num;
    }

    public ComplexNum mul(ComplexNum num){
        return num;
    }

    public ComplexNum div(ComplexNum num){
        return num;
    }

    public ComplexNum sub(ComplexNum num){
        return num;
    }

}
