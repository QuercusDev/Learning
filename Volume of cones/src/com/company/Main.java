package com.company;

public class Main {

    public static void main(String[] args) {
        double r = 1;
        double h = 1;
        for (; r < 100; r++, h++) {
            System.out.println(vol(r, h));
        }
    }

    public static double vol(double r, double h) {
        return Math.PI * r * r * h / 3;
    }
}