#LeetCode
https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/


#Intuition: 
We intend to find the distinct substrings of size 3 with Sliding Window approach.

#Approach:
1. Check edge case if input string s is less than 3, then return 0.
2. Take a count variable to maintain count of distinct substrings. 
3. Check for initial window by considering first 3 characters, taking a, b & c and checking if they are distinct then increase count.
4. Start iterating from i=3 till length of the input string & check for each subsequent window updating a=b, b=c, & c=s.charAt(i). Then check if these 3 characters are distinct. If yes, increase count.
5. Return final count.


#Time Complexity
O(n)

#Space Complexity 
O(1)