package com.krutika.practise.graph;

public class CenterOfStarGraph {

	public static void main(String[] args) {
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
		CenterOfStarGraph obj = new CenterOfStarGraph();
		int centerNode = obj.findCenter(edges);
		System.out.println(centerNode);
	}

	private int findCenter(int[][] edges) {
		int[] pair1 = edges[0];
		int[] pair2 = edges[1];
		if (pair1[0] == pair2[1] || pair1[0] == pair2[0]) {
			return pair1[0];
		}
		return pair1[1];

	}
}
