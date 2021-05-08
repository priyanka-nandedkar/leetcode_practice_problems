package com.array;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 4 };
		System.out.println(Arrays.toString(sortArrayByParity(A)));

	}

	private static int[] sortArrayByParity(int[] A) {
		int temp = 0, index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				System.out.println(returnLastEvenIndex(i, A));
				index = returnLastEvenIndex(i, A);
				if (i != index && index != 0) {
					temp = A[i];
					A[i] = A[index];
					A[index] = temp;
				}
			}
		}
		return A;
	}

	private static int returnLastEvenIndex(int i, int[] A) {
		for (int j = i; j < A.length; j++) {
			if (A[j] % 2 == 0)
				return j;
		}
		return 0;
	}

}
