package com.krutika.practise.heap;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		KthLargestElement obj = new KthLargestElement();
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(obj.findKthLargest(nums, k));
		
	}
	
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }

        for(int j=k;j<nums.length;j++){
            if(nums[j]>pq.peek()){
                pq.poll();
                pq.add(nums[j]);
            }
        }
        return pq.peek();
    }
}
