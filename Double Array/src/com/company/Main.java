package com.company;

public class Main {

    public static void main(String[] args) {
	double[] array = {1.1,2.2,3.3,4.4,5.5};
        double arraySum = 0;
        double arrayMean;
	for (int a = 0; a<array.length; a++) {
        arraySum = arraySum + array[a];
    }
	    arrayMean = arraySum / (array.length);
	    System.out.println(arraySum);
	    System.out.println(arrayMean);

    }
}
