package com.krutika.practise.slidingwindow;

public class MinSwapsII {

	public static void main(String[] args) {
		
	}
	
	public int minSwaps(int[] nums) {
        // take count of total 1s
        int oneCount =0;
        for(int num : nums){
            oneCount+=num;
        }
        int n = nums.length;
        int currZero = 0;
        int minZero = n;
        // first window zero count
        for(int i=0;i<oneCount;i++){
           if(nums[i]==0){
            currZero++;
           }
        }
        int start = 0;
        int end = oneCount-1;
        // slide the window
        while(start<n){
            if(nums[start]==0){
                currZero--;
            }
            start++;
            end++;
            if(nums[end%n]==0){
                currZero++;
            }
            minZero = Math.min(minZero, currZero);
        }
        return minZero;
    }
}
