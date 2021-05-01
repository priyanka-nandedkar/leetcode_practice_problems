package com.array;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 2, 1 };
		System.out.println(validMountainArray(arr));
	}

	private static boolean validMountainArray(int[] arr) {
		int upperCount = 0, lowerCount = arr.length - 1;
		if (arr == null || arr.length == 0)
			return false;
		if (arr.length > 0) {
			if (arr.length == 1 || arr[0] >= arr[1])
				return false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1])
					upperCount++;
			}
			if (upperCount == 0 || upperCount == arr.length - 1)
				return false;

			if (upperCount >= 1) {
				for (int j = arr.length - 1; j > upperCount; j--) {
					if (arr[j] < arr[j - 1])
						lowerCount--;
				}
			}
			return upperCount == lowerCount;
		}
		return true;

	}
}
