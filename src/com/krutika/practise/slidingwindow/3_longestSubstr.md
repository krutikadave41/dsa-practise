Intuition:
We intend to find longest substring with no repeating characters. So we can make use of two pointers to maintain a window of substring & use a set to check if its a repeated character or not.

Approach:
Take a left pointer l and initialize it with 0. Take a right pointer r and initialize it also with 0. Initialize a maxLength=0.
As we move forward iterate the r pointer & for each iteration, check if s.charAt(r) is not in set.
If it's not present in set, simply we can add it into set & update our maxLength by checking what is maximum of maxLength or current window (r-l+1)
If it's present in set, simply we have to remove it & also move l pointer ahead. After removing all characters from l till r, just again add element at r pointer.
Return the maxLength.

Complexity:
Time complexity:
O(n)

Space complexity:
O(n)