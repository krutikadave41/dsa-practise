#GeeksForgeeks Problem
https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

#Intuition
This is a classic example of sliding window.

#Approach
1. Take a sum & maxSum variables and initialize with 0.
2. First take first window sum & consider it as maxSum.
3. Now, start iterating from 1 to n-k+1 (because we only need to calculate window of size k).
4. Keep updating sum by deducting previous Element and add nextElement of window.
5. Check & update maxSum if found.

#Time Complexity
O(n)

#Space Complexity 
O(1)