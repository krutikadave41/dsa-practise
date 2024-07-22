package com.krutika.practise.sorting;

import java.util.Arrays;

public class SortPeople {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		SortPeople obj = new SortPeople();
		String[] result = obj.sortPeople(names, heights);
		Arrays.asList(result).stream().forEach(System.out::println);	
		
	}
	
	public String[] sortPeople(String[] names, int[] heights) {
		int n = names.length;
		//take an indices array
		Integer[] indices = new Integer[n];
		for(int i=0;i<n;i++) {
			indices[i]=i;
		}
		
		//sort the indices array as per height
		Arrays.sort(indices, (a,b)->heights[b]-heights[a]);
		String[] result = new String[n];
		int i=0;
		for(Integer index: indices) {
			result[i++]=names[index];
		}
		return result;
	}
}
