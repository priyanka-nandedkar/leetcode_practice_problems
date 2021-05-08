package com.array;

// Could not establish my own logic. Took help and taken help of available solutions.
public class MoveZeroesToTheEndOfanArray {

	public static void main(String[] args) {
		int[] nums = { 0 };
		moveZeroes(nums);
	}

	private static void moveZeroes(int[] nums) {
		int pointer = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[pointer++] = nums[i];
			}
		}
		for (int j = pointer; j < nums.length; j++) {
			nums[j] = 0;
		}

		// Alternate Solution
		/*
		 * for (int i = 0, j = 0; i < nums.length; i++) { if (nums[i] != 0) { if (i !=
		 * j) { nums[j] = nums[i]; nums[i] = 0; } j++; } }
		 */
	}

}
