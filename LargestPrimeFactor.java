package com.basic_mathematics;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		double num = 600851475143.0;
		largestPrimeFactor(num);

	}

	private static void largestPrimeFactor(double num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				num = num/i;
			}
		}
		System.out.println(num);
	}

}
