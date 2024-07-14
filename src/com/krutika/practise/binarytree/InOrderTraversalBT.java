package com.krutika.practise.binarytree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalBT {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rightNode = new TreeNode(2);
		TreeNode node = new TreeNode(3);
		rightNode.left = node;
		root.left=null;
		root.right=rightNode;
		InOrderTraversalBT obj = new InOrderTraversalBT();
		List<Integer> list = obj.inorderTraversal(root);
		System.out.println(list.toString());
		
		
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> inOrderList = new ArrayList<>();
		dfs(root, inOrderList);
		return inOrderList;
	}

	private void dfs(TreeNode root, List<Integer> inOrderList) {
		if(root == null) {
			return;
		}
		dfs(root.left, inOrderList);
		inOrderList.add(root.val);
		dfs(root.right, inOrderList);
	}
}
