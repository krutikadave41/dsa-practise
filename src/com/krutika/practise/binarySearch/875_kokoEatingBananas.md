Intuition:
Using binary search
Approach:
1. Initialize two pointers: minSpeed=1, maxSpeed=max(piles)
2. Loop until pointers meet
3. Calculate a mid 
4.  We are applying Binary search for the range [1, max(piles[])], and for every value of ‘mid’, we are traversing the entire array inside the function named canEatItAll().
5. If yes, override maxSpeed = mid
   If not possible, override minSpeed = mid+1
6. Return minSpeed


Time Complexity: O(N * log(max(piles[]))
Space Complexity: O(1)
