# LeetCode Problem:
https://leetcode.com/problems/longest-common-prefix/description/

# Intuition
The intuition is to find the longest common prefix from an array of strings.

# Approach
1. Take the first(index=0) string in the array as prefix.
2. Iterate from second(index=1) string till the end of the array.
3. Use the indexOf() function to check if the prefix is there in the strs[i] or not.
If the prefix is there the function returns 0 else -1.
4. Each time the function return -1, use the substring() to chop the last letter from prefix.

# Time Complexity
O(n+m) where m is length of string array and m is the length of prefix.

# Space Complexity
O(1) 
