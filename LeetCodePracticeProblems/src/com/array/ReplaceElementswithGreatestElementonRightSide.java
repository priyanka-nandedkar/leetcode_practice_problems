package com.array;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {

	public static void main(String[] args) {
		int[] arr = { 17, 18, 5, 4, 6, 1 };
		System.out.println(Arrays.toString(replaceElements(arr)));

	}

	private static int[] replaceElements(int[] arr) {

		int tempGreat = 0;
		if (arr.length > 0) {
			if (arr.length == 1) {
				arr[0] = -1;
				return arr;
			}
			for (int i = 0; i < arr.length - 2; i++) {
				tempGreat = arr[i];
				for (int j = i; j < arr.length; j++) {
					if (tempGreat < arr[j])
						tempGreat = arr[j];
				}
				arr[i] = tempGreat;
				arr[i + 1] = arr[i + 2];
			}
			arr[arr.length - 1] = -1;
		}

		return arr;
	}

}
