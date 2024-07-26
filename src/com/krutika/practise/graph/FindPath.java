package com.krutika.practise.graph;

import java.util.ArrayList;

public class FindPath {
	
	public static void main(String[] args) {
		int n = 3, source = 0, destination = 2;
		int[][] edges = {{0,1},{1,2},{2,0}};
		FindPath obj = new FindPath();
		System.out.println(obj.validPath(n, edges, source, destination));
	}

	 public boolean validPath(int n, int[][] edges, int source, int destination) {
	        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

	        // initialize the adjList
	        for(int i=0;i<n;i++){
	            adjList.add(new ArrayList());
	        }
	        // update adjList as per edges
	        for(int i=0;i<edges.length;i++){
	            int u = edges[i][0];
	            int v = edges[i][1];
	            adjList.get(u).add(v);
	            adjList.get(v).add(u);
	        }

	        boolean[] visited = new boolean[n];
	        //traverse with dfs to check if path exists
	        boolean found = dfs(adjList, source, destination, visited);
	        return found;
	    }

	    public boolean dfs( ArrayList<ArrayList<Integer>> adjList, int source, int destination, boolean[] visited){
	        visited[source]=true;

	        if(source==destination){
	            return true;
	        }

	        for(int neighbour: adjList.get(source)){
	            if(!visited[neighbour]){
	                boolean found = dfs(adjList, neighbour, destination, visited);
	                if(found){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
}
