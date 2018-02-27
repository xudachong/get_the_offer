package com.gdut.tree;

import java.util.Stack;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:二叉树中和为某一值的路径
 * @Date: Created in 21:54 2018/2/27
 * @
 */
public class PathInTree_34 {

	public void findPath(BinaryTreeNode root,int k){
		if(root == null){
			return;
		}
		Stack<Integer> stack = new Stack<Integer>();
		findPath(root,k,stack);
	}
	public void findPath(BinaryTreeNode root,int k,Stack<Integer> path){
		if(root == null) {
			return;
		}
		if(root.leftNode == null && root.rightNode == null){
			if(root.value == k){
				System.out.println("路径开始");
				for(int i :path) {
					System.out.print(i + ",");
				}
				System.out.print(root.value);
			}
		}
		else{
			path.push(root.value);
			findPath(root.leftNode,k-root.value,path);
			findPath(root.rightNode,k-root.value,path);
			path.pop();
		}
	}
	public static void main(String[] args){
		BinaryTreeNode root1 = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		root1.leftNode = node1;
		root1.rightNode = node2;
		node1.leftNode = node3;
		node1.rightNode = node4;
		node4.leftNode = node5;
		node4.rightNode = node6;
		root1.value = 8;
		node1.value = 8;
		node2.value = 7;
		node3.value = 9;
		node4.value = 2;
		node5.value = 4;
		node6.value = 7;
		PathInTree_34 test = new PathInTree_34();
		test.findPath(root1, 25);
	}
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode leftNode;
		BinaryTreeNode rightNode;
	}
}
