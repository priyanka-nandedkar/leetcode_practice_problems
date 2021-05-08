package com.array;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 3, 4 };
		System.out.println(heightChecker(arr));
	}

	private static int heightChecker(int[] heights) {
		int[] expected = Arrays.copyOf(heights, heights.length);
		int count = 0;
		Arrays.sort(expected);
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expected[i])
				count++;
		}
		return count;
	}
}
