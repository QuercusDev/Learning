package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array = new int[21];

	for (int filler = 1; filler <=array.length; filler++){
	    array[filler] = filler;
	    System.out.println(array[filler]);
    }

    }
}
