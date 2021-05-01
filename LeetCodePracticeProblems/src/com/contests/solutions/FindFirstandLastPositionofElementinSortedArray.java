package com.contests.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 6, 7, 2, 1 };
	    System.out.println(Arrays.toString(searchRange(nums, 1)));
	}

	private static int[] searchRange(int[] nums, int target) {
		int[] arr = { -1, -1 };
		List<Integer> newList = IntStream.of(nums).boxed().collect(Collectors.toList());
		int first = newList.indexOf(Integer.valueOf(target));
		arr[0] = first;
		int last = newList.lastIndexOf(target);
		arr[1] = last;
		return arr;
	}
}
