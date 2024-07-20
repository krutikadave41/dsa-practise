# LeetCode Problem:
https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/description/

# Intuition

Given rowSum & colSum, we have to find a matrix such that rowSum[i] is the sum of the elements in the ith row and colSum[j] is the sum of the elements of the jth column of a 2D matrix.

# Approach
1. We have to take two pointers, r=0 & c=0 to keep track of the current row and column being processed. Take a resultMatrix
2. We have to keep iterating till (r<rowSum.length && c<colSum.length).
3. We have to find minimum of rowSum[r] and colSum[c]. This minValue will be value for current element for resultMatrix
4. Substract the minValue from current rowSum & colSum. 
5. Increment r if rowSum becomes zero and increment c if colSum becomes zero.
6. Return resultMatrix.


# Time Complexity
The algorithm processes each element of the rowSum and colSum arrays exactly once. Thus, the time complexity is (O(m + n)), where (m) is the length of rowSum and (n) is the length of colSum

# Space Complexity
The space complexity is (O(m x n)) for the result matrix. 
