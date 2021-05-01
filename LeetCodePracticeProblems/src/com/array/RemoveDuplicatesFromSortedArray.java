package com.array;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		System.out.println("Array with new length is " + removeDuplicates(arr));

	}

	private static int removeDuplicates(int[] nums) {
		int j = 0;
		if (nums.length > 0) {
			nums[j] = nums[0];
			for (int i = 1; i <= nums.length - 1; i++) {
				if (nums[j] == nums[i])
					continue;
				else {
					j++;
					nums[j] = nums[i];
				}
			}
			return j + 1;
		}
		return 0;
	}

}
