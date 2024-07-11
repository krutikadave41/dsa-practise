package com.krutika.practise.twoPointers;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		ThreeSumClosest obj = new ThreeSumClosest();
		System.out.println(obj.threeSumClosest(nums, target));

	}

	public int threeSumClosest(int[] nums, int target) {
		int minimumDiff = Integer.MAX_VALUE;
		int resultSum = nums[0] + nums[1] + nums[2];

		// first sort the array
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			
			//using two pointers
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == target) {
					return sum;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
				// main crux
				int currentDiff = Math.abs(sum - target);
				if (minimumDiff > currentDiff) {
					minimumDiff = currentDiff;
					resultSum = sum;
				}
			}
		}
		return resultSum;
	}
}
