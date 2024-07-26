#Leetcode Problem
https://leetcode.com/problems/find-if-path-exists-in-graph/description/

#Intuition
We can solve this problem statement applying DFS.

#Approach
1. First create an adjacency list adjList & initialize it.
2. Fill the adjList with edges data.
3. Create a boolean[] visited to check if a node is visited
4. Apply DFS to traverse from source to destination
5. If destination is visited, return true. Else false.

#Time Complexity
O(M+N)

#Space Complexity 
O(M+N) which is consumed by adjList + O(N) consumed by boolean[] + O(N) consumed by DFS
O(M+N) + 2O(n)