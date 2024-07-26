#Leetcode Problem
https://leetcode.com/problems/maximum-total-importance-of-roads/description/

#Intuition
We can solve this problem statement by first checking degree for all nodes & then assign max Value to max Degree node so that the sum will be max amount.

#Approach
1. First find the degree of each node & store into a degree array.
2. sort the degree array
3. Iterate through the degree array, Assign label from 1 to n to each node. Combine the sum result. 

#Time Complexity
O(E + vlogv + v)

#Space Complexity 
O(v)