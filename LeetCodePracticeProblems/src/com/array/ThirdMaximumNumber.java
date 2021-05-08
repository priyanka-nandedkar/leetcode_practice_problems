package com.array;

import java.util.Arrays;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 2, 2 };
		System.out.println(thirdMax(nums));
	}

	private static int thirdMax(int[] nums) {
		int max = 0, n = nums.length - 1, distPosition = -1;
		Arrays.sort(nums);

		if (nums.length == 1 || nums.length == 2)
			return nums[n];

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] != nums[i - 1])
				max += 1;
			if (max == 2)
				distPosition = i;
		}
		return distPosition != -1 ? nums[distPosition - 1] : nums[n];
	}

}
