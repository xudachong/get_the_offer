package com.gdut.tree;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:对称二叉树
 * @Date: Created in 11:19 2018/2/27
 * @
 */
public class SymmetricalBinaryTree_28 {

	boolean isSymmetrical(TreeNode pRoot)
	{
		return childSymmetrical(pRoot,pRoot);
	}

	boolean childSymmetrical(TreeNode root1,TreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 ==null){
			return false;
		}
		if(root1.val != root2.val){
			return false;
		}
		return childSymmetrical(root1.left,root2.right) && childSymmetrical(root1.right,root2.left);
	}

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

}
