package com.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(arr));

	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0, result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count = 0;
			else {
				count += 1; // or count++
				result = Math.max(result, count);
			}
		}
		return result;
	}

}
