#LeetCode Problem:
https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/

#Intuition
We intend to transform the input string by first converting into integer equivalent value & then summing each digit from the value k times.

#Approach
Step 1: loop through the string & convert each character into integer value with formula: (character - 96) i.e. character - 'a' + 1
Store the integer value in a string builder variable sb.
Step 2: while k>0, sum each character with formula: sum += character - '0' & decrement k.

#Complexity

#Time complexity:
O(n)+O(k*z) where z is length of resultant integer sb from step 1.

#Space complexity:
$O(z) for string builder variable sb