package com.krutika.practise.slidingwindow;

import java.util.ArrayList;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int n = 4, k = 2;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		System.out.println(MaxSubArraySum.maximumSumSubarray(k, arr, n));
	}
	static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        long sum=0;
        long maxSum=0;
        for(int i=0;i<k;i++){
            sum+=arr.get(i);
        }
        maxSum=sum;
        for(int i=1;i<n-k+1;i++){
            int prevElement = arr.get(i-1);
            int nextElement = arr.get(i+k-1);
            sum=sum-prevElement+nextElement;
            
            maxSum=Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
	
}
