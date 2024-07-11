package com.krutika.practise.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeIntegerSumIII {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		ThreeIntegerSumIII obj = new ThreeIntegerSumIII();

		List<List<Integer>> listOfTriplets = obj.threeSum(nums);
		for(List triplets : listOfTriplets) {
			System.out.println(triplets);
		}
	}

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) {
			return new ArrayList<>();
		}
		// first things first, sort the array
		Arrays.sort(nums);

		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < nums.length - 2; i++) {
			// now solving with 2-pointer approach
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					// if sum=0, add triplets to final answer
					set.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return new ArrayList<>(set);
	}
}
