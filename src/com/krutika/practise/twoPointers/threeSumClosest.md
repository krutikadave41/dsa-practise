# LeetCode Problem: 
https://leetcode.com/problems/3sum-closest/

#Approach:
1. Sort the input array
2. Initialize a minimumDiff & resultSum. 
3. Then using 2 loops, using Two Pointers approach in the inner loop.
4. Check if minimumDiff>currentDiff. If so, update minimumDiff & resultSum.
5. Return resultSum.

#Time Complexity:
O(N²)

#Space Complexity:
O(N)