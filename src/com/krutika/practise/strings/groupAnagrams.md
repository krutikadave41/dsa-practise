# LeetCode Problem:
https://leetcode.com/problems/group-anagrams/description/

# Intuition
The intuition is to group words that are anagrams of each other together. Anagrams are words that have the same characters but in a different order.

# Approach
1. We will take a map for grouping the anagram strings. 
2. Start iterating each string from the input string array.
3. Sort the string to put it as a key into the map.
4. Check if this key exists in map? If not, we will add this key with value of current iterating string. If it exists, we will append this iterating string to the existing key in map.
5. Return all values from map.

# Time Complexity
O(n*k*logk) where k is length of longest string.

# Space Complexity
O(n) 

We can reduce the time complexity by eliminating sorting here, by taking a count integer[] that helps us to generate a hash key to be used in map.