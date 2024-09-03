# Leetcode Problem
https://leetcode.com/problems/valid-parenthesis-string/description/

# Intuition
We intend to check if the string contains valid parenthesis pairs.

# Approach
We can maintain one stack for all *openBrackets* & one stack for all *aestricks*.
1. Iterate through the input string, character by character.
2. Check if the character is '(', then push it to stack *openBrackets*
3. Check if the character is '*', then push it to stack *aestricks*
4. If its a closing bracket, adjust it by popping openBrackets else adjust it by popping an aestrick. If none of openBrackets or aestricks are there, return false.
5. Again iterate if *openBrackets* are still there, We need to process further. Check if *aestricks* is empty, return false. Else adjust it with *aestricks* if *aestricks* index comes after *openBrackets* index.
6. Return true if openBrackets stack is now empty.

# Complexity
- Time complexity:
$O(n)

- Space complexity:
$O(2n)