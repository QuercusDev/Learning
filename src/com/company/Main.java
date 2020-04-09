package com.company;

public class Main {
	public static void main(String[] args) {
		double[] a = {6.1, 10.0, 6.0, 7.3, 8.4, 7.2};
		int i = 0;
		int j = i + 1;

		for (i = 0, j = i+1; j <= a.length-1; j++) {
			if (a[i] > a[j]) {
				i = j;
			}
		}
		System.out.println(a[i]);
	}
}
