package com.contests.solutions;

public class NondecreasingArray {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 3, 2 };
		System.out.println(checkPossibility(nums));
	}

	private static boolean checkPossibility(int[] nums) {
		boolean changed = false;

		if (nums.length == 1)
			return true;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				if (changed)
					return false;
				if (i != 0 && nums[i - 1] > nums[i + 1]) {
					nums[i + 1] = nums[i];
				}
				changed = true;
			}
		}
		return true;
	}

}
