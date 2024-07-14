#Leetcode Problem
https://leetcode.com/problems/binary-tree-inorder-traversal/

#Intuition
Inorder means LEFT->VAL->RIGHT
First we need to look at left subtree then root value then right subtree.

#Approach
We can use Recursive Function:
If the current node is null, it means we have reached the end of a subtree and there are no further nodes to explore.
Steps:

1. Traverse Left Subtree: Recursively traverse the left subtree by invoking the preorder function on the left child of the current node. This step continues the exploration of nodes in a depth first manner.
2. Process Current Node(root)
3. Traverse Right Subtree: After traversing the entire left subtree & root, we traverse the right subtree recursively. We once again invoke the preorder function, but this time on the right child of the current node.

#Time Complexity
O(n)

#Space Complexity 
O(n)