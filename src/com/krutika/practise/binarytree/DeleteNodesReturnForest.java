package com.krutika.practise.binarytree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesReturnForest {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rightNode = new TreeNode(3);
		TreeNode leftNode = new TreeNode(2);
		root.left = leftNode;
		root.right = rightNode;
		leftNode.left = new TreeNode(4);
		leftNode.right = new TreeNode(5);
		rightNode.left = new TreeNode(6);
		rightNode.right = new TreeNode(7);
		DeleteNodesReturnForest obj = new DeleteNodesReturnForest();
		int[] to_delete = {3,5};
		obj.delNodes(root, to_delete);
		
	}

	List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		List<TreeNode> result = new ArrayList<>();
		// store values to delete in a set
		Set<Integer> set = new HashSet<Integer>();
		for (int toDel : to_delete) {
			set.add(toDel);
		}

		deleteUtility(root, set, result);

		if (!set.contains(root.val)) {
			result.add(root);
		}
		return result;
	}

	TreeNode deleteUtility(TreeNode root, Set<Integer> set, List<TreeNode> result) {
		if (root == null) {
			return null;
		}
		// to same thing for left tree
		root.left = deleteUtility(root.left, set, result);
		// to same thing for right tree
		root.right = deleteUtility(root.right, set, result);
		// if root.val is to be deleted, then add left & right to final result
		if (set.contains(root.val)) {
			if (root.left != null) {
				result.add(root.left);
			}

			if (root.right != null) {
				result.add(root.right);
			}
			// return null because current root is deleted
			return null;
		}
		return root;

	}
}
