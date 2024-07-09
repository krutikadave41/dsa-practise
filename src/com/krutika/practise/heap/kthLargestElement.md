1. Initialize a min heap (priority queue) pq.
2. Push k elements from the array onto the min heap.
3. Again iterate array from j=k to N, If the top element of pq > nums[j], pop (remove) the smallest element from the min heap & add the nums[j]. This step ensures that the min heap maintains the K largest elements encountered so far.
After processing all elements, return the smallest element from pq with pq.peek().