package com.krutika.practise.twoPointers;

import java.util.stream.IntStream;

public class TwoIntegerSumII {
	public int[] twoSum(int[] numbers, int target) {
		int l = 0;
		int len = numbers.length - 1;
		int r = len;
		while (l < r) {
			int currentSum = numbers[l] + numbers[r];
			if (currentSum > target) {
				r--;
			} else if (currentSum < target) {
				l++;
			} else {
				int[] ans = { l + 1, r + 1 };
				return ans;
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		TwoIntegerSumII object = new TwoIntegerSumII();
		int[] indexes = object.twoSum(numbers, target);
		IntStream.rangeClosed(indexes[0], indexes.length).forEach(x-> System.out.print(x+" "));

	}
}
