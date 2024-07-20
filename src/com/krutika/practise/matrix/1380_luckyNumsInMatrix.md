#LeetCode Problem:
https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

# Intuition

Given a matrix, we have to find an element that is minimum in its row and maximum for its column.

# Approach
1. Take a minRows set & iterate through the matrix & find the minimum of each row and add it to the minRows set.
2. Iterate again for each column & find the max of each column & if its present in the minRows set, its our answer.

# Time Complexity
O(2 MxN) as we iterate through the matrix twice.

# Space Complexity
O(N) as we take a set 

# Optimizations
We can further optimize it by eliminating the minRows Set. 
Instead of using a set, we can just maintain an integer maxOfMinRows to maintain max of minimum values of rows. 
And next time we iterate, we can check if max of column is present in maxOfMinRows. If so, that's our answer.