package com.contests.solutions;

import java.util.Arrays;

public class RunningSumOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		runningSum(arr);

	}

	private static int[] runningSum(int[] nums) {
		if (nums.length > 0) {
			for (int j = 1; j < nums.length; j++) {
				nums[j] = nums[j - 1] + nums[j];
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
