**Intuition**
We intend to solve this using Kadane's Algorithm.

**Approach**
We can take two variables. max_sum=Integer.MIN_VALUE & current_sum=0;
We loop from i=0 till size of input array.
We keep updating current_sum = current_sum + arr[i].
If current_sum > max_sum, we update max_sum.
If current_sum < 0, we should make current_sum = 0.

**Complexity**
- Time complexity:
 O(n)

- Space complexity:
 O(1)