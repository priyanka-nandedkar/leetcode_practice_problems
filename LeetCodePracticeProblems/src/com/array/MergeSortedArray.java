package com.array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1.length != m && n != 0) {
			for (int i = m; i <= nums1.length - 1; i++) {
				for (int j = 0; j < nums2.length; j++) {
					nums1[i] = nums2[j];
					i++;
				}
			}
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}
