# Intuition:
This problem statement can be solved by 2 ways. 🚀🚀
1. Using Stack but that will take O(n) space complexity.
2. Finding the mid node of the linked list & reversing this half part of list
   Then start comparing (from head till mid) to (mid till end)

# Approach:
1. Take a fast pointer & a slow pointer to arrive at a middle node.
2. The slow pointer now has the middle node. Reverse the list from mid till end of the list.
3. Now update fast pointer to head node.
4. Iterate till slow is not null, start comparing (from head till mid) to (mid till end).
5. If any of the node values not match up, return false.

# Time Complexity:
   O(n)

# Space Complexity:
   O(1)

