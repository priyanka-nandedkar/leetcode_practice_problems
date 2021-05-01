package com.contests.solutions;

public class SignoftheProductofanArray {

	public static void main(String[] args) {
		int[] arr = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
		System.out.println("Array sign is " + arraySign(arr));
	}

	private static int arraySign(int[] nums) {
		int product = 1;
		for (int num : nums) {
			if (num == 0)
				return 0;
			else if (num < 0)
				product *= -1;
		}
		return product;
	}
}
