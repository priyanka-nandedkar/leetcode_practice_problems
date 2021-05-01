package com.contests.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerfulIntegers {

	public static void main(String[] args) {
		System.out.println(powerfulIntegers(2, 3, 10).toString());
	}

	private static List<Integer> powerfulIntegers(int x, int y, int bound) {
		List<Integer> resultList = new ArrayList<>();
		int x1 = 0, y1, temp, range = 100;
		first: for (int i = 0; i <= range; i++) {
			x1 = (int) Math.pow(x, i);
			if (x1 > bound)
				break first;
			second: for (int j = 0; j <= range; j++) {
				y1 = (int) Math.pow(y, j);
				if (y1 > bound)
					break second;
				temp = x1 + y1;
				if ((temp <= bound) && !resultList.contains(temp))
					resultList.add(temp);
			}
		}
		Collections.sort(resultList);
		return resultList;
	}

}
