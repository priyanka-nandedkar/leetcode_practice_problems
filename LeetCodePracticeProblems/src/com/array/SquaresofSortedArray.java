package com.array;

import java.util.Arrays;

public class SquaresofSortedArray {

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquares(nums)));

	}

	private static int[] sortedSquares(int[] nums) {
		int squares[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			squares[i] = nums[i] * nums[i];
		}
		Arrays.sort(squares);
		return squares;
	}

}
