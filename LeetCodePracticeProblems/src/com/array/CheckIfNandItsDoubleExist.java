package com.array;

// Need to beat the time complexity.
public class CheckIfNandItsDoubleExist {

	public static void main(String[] args) {
		int[] arr = { 0, 5 };
		System.out.println(checkIfExist(arr));
	}

	private static boolean checkIfExist(int[] arr) {
		// edge cases
		if (arr == null || arr.length == 0)
			return false;

		// rest test scenarios
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] == 2 * arr[j] && i != j)
					return true;
			}
		}
		return false;
	}
}
