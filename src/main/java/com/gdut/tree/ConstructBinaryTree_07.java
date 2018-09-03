package com.gdut.tree;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:给出前序遍历序列和中序序列来构造二叉树
 * @Date: Created in 20:53 2018/2/24
 * @
 */
public class ConstructBinaryTree_07 {

	public static BinaryTreeNode Construct(int[] preorder,int[] inorder){
		if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0){
			return null;
		}
		return ConstructCore(0,preorder.length-1,0,inorder.length-1,preorder,inorder);
	}

	public static BinaryTreeNode ConstructCore(int startPreorder,int endPreorder,int startInorder,int endInorder,int[] preorder,int[] inorder){
		//前序遍历序列的第一个数字是根结点
		int rootValue = preorder[startPreorder];
		BinaryTreeNode root = new BinaryTreeNode();
		root.m_nValue = rootValue;
		root.m_pLeft = root.m_pRight = null;
		if(startPreorder == endPreorder){
			if(startInorder == endInorder && preorder[startPreorder] == inorder[startInorder]){
				return root;
			}else{
				throw  new IllegalArgumentException("错误输入");
			}
		}
		int rootInorder = startInorder;
		while (rootInorder <= endInorder && inorder[rootInorder] != rootValue){
			++rootInorder;
		}
		if(rootInorder == endInorder && inorder[rootInorder] != rootValue){
			throw  new IllegalArgumentException("错误输入");
		}
		int leftLength = rootInorder-startInorder;
		int leftPreorderEnd = startPreorder + leftLength;
		if(leftLength > 0){
			root.m_pLeft = ConstructCore(startPreorder+1,leftPreorderEnd,startInorder,rootInorder-1,preorder,inorder);
		}
		if(leftLength < endPreorder-startPreorder){
			root.m_pRight = ConstructCore(leftPreorderEnd+1,endPreorder,rootInorder+1,endInorder,preorder,inorder);
		}
		return root;
	}

	static class BinaryTreeNode{
		int m_nValue;
		BinaryTreeNode m_pLeft;
		BinaryTreeNode m_pRight;
	}

	public static void main(String[] args) {
		int[] preorder = {1,2,4,7,3,5,6,8};
		int[] inorder = {4,7,2,1,5,3,8,6};
		BinaryTreeNode node= Construct(preorder,inorder);
		System.out.println(node.m_pRight.m_pRight.m_nValue);
	}
}
