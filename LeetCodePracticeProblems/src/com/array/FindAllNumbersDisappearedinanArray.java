package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums).toString());
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> resultList = new ArrayList<Integer>();
		// Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			
			if (nums[index] > 0) {
				System.out.println(nums[index]);
				nums[index] = -1 * nums[index];
			}
		}
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				resultList.add(i + 1);
		}

		return resultList;
	}

}
