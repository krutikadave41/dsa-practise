package com.krutika.practise.binarytree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalBT {

	public static void main(String[] args) {
		PostOrderTraversalBT obj  =new PostOrderTraversalBT();
		TreeNode root = new TreeNode(1);
		TreeNode rightNode = new TreeNode(2);
		TreeNode node = new TreeNode(3);
		rightNode.left = node;
		root.left = null;
		root.right = rightNode;
		List<Integer> list = obj.postorderTraversal(root);
		System.out.println(list.toString());

	}
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    List<Integer> dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        dfs(root.left, list);
        dfs(root.right, list);
        list.add(root.val);
        return list;
    }
}
