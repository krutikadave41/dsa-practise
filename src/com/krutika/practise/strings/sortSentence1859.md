# LeetCode Problem:
https://leetcode.com/problems/sorting-the-sentence/

# Intuition
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
We intend to find the correct original order of the sentence based on the index at last of each word of this sentence.

# Approach
1. We will take a map for storing index & value of each word.
2. Convert string input into string array & Start iterating each string from the string array.
3. Put last character as a key into the map & rest of the word as value into the map.
4. Iterate the map values.
5. Store all values from map into result string.

# Time Complexity
O(n)

# Space Complexity
O(n) 
