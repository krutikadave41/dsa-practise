package com.krutika.practise.graph;

public class Graph {

	int[][] adjacencyMatrix;
	
	Graph(int nodes){
		adjacencyMatrix = new int[nodes][nodes];
	}
	
	public void addEdgesInMatrix(int[][] edges, boolean isDirected) {
		for(int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			
			if(isDirected) {
				adjacencyMatrix[u][v]=1;
			}else {
				adjacencyMatrix[u][v]=1;
				adjacencyMatrix[v][u]=1;
			}
		}
	}
	
	public void findDegree(int[][] edges, int nodes) {
		int[] degree = new int[nodes];
		for(int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			
			degree[u]++;
			degree[v]++;
		}
		for(int i=0;i<nodes;i++) {
			System.out.println("Node : "+i+", degree: "+degree[i]);
		}
	}
	
	public void printMatrix() {
		for(int[] row : adjacencyMatrix) {
			for(int rowElement : row) {
			System.out.print(rowElement+",");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int[][] edges = {{0,2}, {0,1}, {1,3}};
		int nodes = 4;
		Graph graph = new Graph(nodes);
		graph.addEdgesInMatrix(edges, false);
		graph.printMatrix();
		graph.findDegree(edges, nodes);
		
		
	}
}
