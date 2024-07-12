# LeetCode Problem: 
https://leetcode.com/problems/binary-search/description/

#Approach:
1. Take left & right pointers
2. Find a mid index
3. Check if nums[mid]==target, then return mid.
4. Check if nums[mid]>target, then update right=mid-1
5. Else update left = mid + 1
6. Return -1 if no such index exists.

#Time Complexity:
O(log(n))

#Space Complexity:
O(1)