package com.gdut.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:判断树的子结构
 * @Date: Created in 21:51 2018/2/26
 * @
 */
public class SubstructureInTree_26 {

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.val==root2.val){
				result = DoesTree1HasTree2(root1,root2);
			}
			if(!result){
				result = HasSubtree(root1.left,root2);
			}
			if(!result){
				result = HasSubtree(root1.right,root2);
			}
		}
		return result;
	}
	public boolean DoesTree1HasTree2(TreeNode root1,TreeNode root2){
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		if(root1.val!=root2.val){
			return false;
		}
		return DoesTree1HasTree2(root1.left,root2.left) && DoesTree1HasTree2(root1.right,root2.right);
	}
	//如果是double类型或float类型
	public boolean Equal(int number1,int number2){
		if(number1-number2 > -0.00000001 && number1-number2 < 0.00000001){
			return true;
		}else{
			return false;
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
