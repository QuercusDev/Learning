package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        while (a <= 40) {
            a++;
            if (a % 3 != 0) {
                System.out.println(a);
            } else if (a % 3 ==0) {
                System.out.println(a + " Quack");
            }


        }
    }




    }
