package com.array;

// find an alternative solution
public class RemoveParticularElement {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 3 };
		System.out.println("Array with new length is " + removeElement(arr, 2));
	}

	private static int removeElement(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
}
