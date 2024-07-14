#Leetcode Problem
https://leetcode.com/problems/binary-tree-preorder-traversal/description/

#Intuition
Inorder means VAL->LEFT->RIGHT
First we need to look at root value then left subtree then right subtree.

#Approach
We can use Recursive Function with a terminating condition:
If the current node is null, it means we have reached the end of a subtree and there are no further nodes to explore.
Steps:
1. Process Current Node(root)
2. Traverse Left Subtree: Recursively traverse the left subtree by invoking the preorder function on the left child of the current node. This step continues the exploration of nodes in a depth first manner.
3. Traverse Right Subtree: After traversing the entire left subtree & root, we traverse the right subtree recursively. We once again invoke the preorder function, but this time on the right child of the current node.

#Time Complexity
O(n)

#Space Complexity 
O(n)