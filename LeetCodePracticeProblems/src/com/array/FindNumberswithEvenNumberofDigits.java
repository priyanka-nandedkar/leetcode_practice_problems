package com.array;

public class FindNumberswithEvenNumberofDigits {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(arr));

	}

	private static int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			char[] c = Integer.valueOf(nums[i]).toString().toCharArray();
			if (c.length % 2 == 0)
				count++;
		}
		return count;
	}

}
