package com.basic_mathematics;

public class MultiplesOfThreeAndFive {

	public static void main(String[] args) {
		int sum = 0, num = 1000;

		getMultiples(sum, num);
	}

	private static void getMultiples(int sum, int num) {
		for (int i = 0; i < num; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of numbers which are divisible by 3 and 5 is : " + sum);
	}
}
