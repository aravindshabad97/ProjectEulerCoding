package com.basic_mathematics;

public class SumOfEvenFibonacciNumbers {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int sum = 0;
		getSum(num1, num2, sum);
	}

	private static void getSum(int num1, int num2, int sum) {
		int num3;
		for (int i = 0; i < 32; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 % 2 == 0) {
				System.out.print(num3 + " ");
				sum = sum + num3;
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
