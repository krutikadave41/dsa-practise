package com.krutika.practise.kadanes.algorithm;

public class MaxSubArraySum {

	public int maxSubArray(int[] nums) {
		int max_sum = Integer.MIN_VALUE;
		int size = nums.length;
		int current_sum = 0;
		if (size == 1) {
			return nums[0];
		}
		for (int i = 0; i < size; i++) {
			current_sum += nums[i];
			if (current_sum > max_sum) {
				max_sum = current_sum;
			}
			if (current_sum < 0) {
				current_sum = 0;
			}

		}
		return max_sum;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MaxSubArraySum obj = new MaxSubArraySum();
		System.out.println(obj.maxSubArray(nums));

	}
}
