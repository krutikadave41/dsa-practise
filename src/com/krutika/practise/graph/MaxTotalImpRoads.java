package com.krutika.practise.graph;

import java.util.Arrays;

public class MaxTotalImpRoads {

	public static void main(String[] args) {
		MaxTotalImpRoads obj = new MaxTotalImpRoads();
		int n = 5;
		int[][] roads = {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
		System.out.println(obj.maximumImportance(n, roads));
	}
	public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];

        // find degree
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            degree[u]++;
            degree[v]++;

        }
        // sort the degree array in asc
        Arrays.sort(degree);
        long maxImportance = 0;
        // assign lower label to lower degree, higher label to higher degree
        long label = 1;
        for (int i = 0; i < n; i++) {
            maxImportance += (degree[i] * label);
            label++;
        }
        return maxImportance;
    }
}
