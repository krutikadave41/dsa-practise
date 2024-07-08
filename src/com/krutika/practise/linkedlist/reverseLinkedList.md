Intuition:
Using Iterative Approach

Approach:
1. Take two Nodes : prevNode = null, currNode = head
2. Iterate till currNode ! = null,
   take a nextNode = currNode.next;
   then make next of currNode to point to prevNode
   prevNode then becomes currNode & currNode points to nextNode;
3. fix the head pointer to point prevNode
4. return head of the reversed list

Time Complexity: O(n)
Space Complexity: O(1)