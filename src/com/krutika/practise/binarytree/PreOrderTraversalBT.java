package com.krutika.practise.binarytree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalBT {
	List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rightNode = new TreeNode(2);
		TreeNode node = new TreeNode(3);
		rightNode.left = node;
		root.left = null;
		root.right = rightNode;
		PreOrderTraversalBT obj = new PreOrderTraversalBT();
		List<Integer> list = obj.preorderTraversal(root);
		System.out.println(list.toString());

	}

	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {
			return list;
		}
		list.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		return list;
	}

}
