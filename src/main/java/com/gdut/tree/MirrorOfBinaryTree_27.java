package com.gdut.tree;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:二叉树的镜像
 * @Date: Created in 10:51 2018/2/27
 * @
 */
public class MirrorOfBinaryTree_27 {

	public void Mirror(TreeNode root) {
		if(root == null){
			return ;
		}
		if(root.left == null && root.right == null){
			return ;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(root.left != null){
			Mirror(root.left);
		}
		if(root.right !=null){
			Mirror(root.right);
		}
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
