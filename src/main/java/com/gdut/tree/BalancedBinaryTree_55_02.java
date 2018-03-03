package com.gdut.tree;

/**
 * @Author: XuJuLong<5   7   4   4   0   8   5   7   8   @   qq.com>
 * @Description:平衡二叉树
 * @Date: Created in 10:35 2018/3/3
 * @
 */
public class BalancedBinaryTree_55_02 {

	public boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root) != -1;
	}

	private int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = getDepth(root.left);
		if (leftHeight == -1) {
			return -1;
		}
		int rightHeight = getDepth(root.right);
		if (rightHeight == -1) {
			return -1;
		}
		return Math.abs(leftHeight - rightHeight) > 1 ? -1 : 1 + Math.max(leftHeight, rightHeight);
	}

	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
	}

}
