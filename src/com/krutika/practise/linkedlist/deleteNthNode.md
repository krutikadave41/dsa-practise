#LeetCode Problem
https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

#Intuition
We have to delete the nth node from the end of a Linkedlist in one iteration.


#Approach
Take a dummy node & point to head.
Take two pointers: firstPtr and secondPtr
First, move the secondPtr till n
Now, advance both firstPtr & secondPtr till secondPtr.next !=null
Now, the next node of firstPtr is the node that we have to delete. So we simply update its next pointer to pointer to next node after it.
Return dummy.next

#Time Complexity

O(n)

#Space Complexity

O(1)