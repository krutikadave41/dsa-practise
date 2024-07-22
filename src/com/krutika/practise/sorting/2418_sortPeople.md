#Leetcode Problem
https://leetcode.com/problems/sort-the-people/description/

#Intuition
This is a classic example of custom sorting. We can maintain an indices array and sort it according to the heights of the people in desc order

#Approach
1. Take an indices array as same length as names array.
2. Sort it by providing sorting logic according to descending order of heights.
3. Form the result array from the names at sorted indices of indices array.

#Time Complexity
O(nlogn)

#Space Complexity 
O(n)