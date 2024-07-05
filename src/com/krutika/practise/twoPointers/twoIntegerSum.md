Intuition:
Using two pointers
Approach:
1. Initialize two pointers: l=0, r=numbers.length-1
2. Loop until pointers meet
3. Calculate sum & check against target
4. Adjust pointer r if sum is too large, adjust pointer l if sum is too small
5. If target sum is found, return. Else return default [-1,-1]


Time Complexity: O(n)
Space Complexity: O(1)
