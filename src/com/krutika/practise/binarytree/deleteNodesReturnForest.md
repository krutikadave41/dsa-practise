#LeetCode Problem
https://leetcode.com/problems/delete-nodes-and-return-forest/description/

#Intuition
We need to delete nodes from the input tree based on values given in to_delete[]

#Approach
1. Store all values of to_delete array into a set. Because array is costly than set.
2. Create a deleteUtility() method that takes root, set of values to delete, and a result list.
3. Recursively call same deleteUtility for left & right sub tree.
4. Keep a base condition that if root is null, return null.
5. If set contains a root val, then add the left & right into the final result list & return null to delete current root. Else return root.
6. Now after this step, we need to check if root is not in set, then add root also into final result list.

#Time Complexity

O(n)

#Space Complexity

O(h) where h is the height of the binary tree as we have used recursion.