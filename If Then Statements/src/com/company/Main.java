package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 550;
        int y = 600;
        int diff = x-y;

        if (x > y) {
            System.out.format("x is %d bigger than y",diff);
        } else if (y > x) {
            System.out.format("y is %d bigger than x",diff*-1);
        } else {
            System.out.println("x and y are the same");
        }

    }
}