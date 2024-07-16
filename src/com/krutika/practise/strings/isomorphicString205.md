#LeetCode Problem:
https://leetcode.com/problems/isomorphic-strings/description/

# Intuition

Given two strings s and t, we need to determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.

# Approach
1. Create a HashMap of (char, char) to store the mapping of s and t.
2. Now traverse on the string s and check whether the current character is present in the HashMap.
3. If it is present then the check if its mapped value is same as the t character at the current index or not. If not, return false
4. Else check if it is not present in the key then add the new mapping.
5. Return true if all characters can be replaced to get t.

# Time Complexity
O(n)

# Space Complexity
O(1) 
