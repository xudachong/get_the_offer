package com.gdut.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:
 * @Date: Created in 23:25 2018/3/13
 * @
 */
public class PrintTreeFromTopToBottom_32_02 {

	public void printTree(TreeNode node) {
		Queue queue = new LinkedBlockingQueue();
		queue.add(node);
		int nextLevel = 0;
		int toBePrinted = 1;
		while (!queue.isEmpty()){
			TreeNode treeNode = (TreeNode) queue.poll();
			System.out.print(treeNode.val);
			if(treeNode.left != null){
				queue.add(treeNode.left);
				++nextLevel;
			}
			if(treeNode.right != null){
				queue.add(treeNode.right);
				++nextLevel;
			}
			--toBePrinted;
			if(toBePrinted == 0){
				System.out.println();
				toBePrinted = nextLevel;
				nextLevel = 0;
			}
		}

	}
	static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		PrintTreeFromTopToBottom_32_02 test = new PrintTreeFromTopToBottom_32_02();
		TreeNode node1 = new TreeNode(8);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(10);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		test.printTree(node1);
	}

}
