package com.basic_mathematics;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		int num1 = 0;
		num1 = getPalindrome(num1);

		System.out.println("Largest Palindrome for 3-digit number is : " + num1);
	}

	private static int getPalindrome(int num1) {
		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int num2 = i * j;
				StringBuilder sb1 = new StringBuilder("" + num2);
				String sb2 = "" + num2;
				sb1.reverse();
				if (sb2.equals(sb1.toString()) && num1 < num2)
					num1 = num2;

			}
		}

		return num1;
	}

}
