package com.gdut.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:序列化二叉树
 * @Date: Created in 20:35 2018/3/1
 * @
 */
public class SerializeBinaryTrees_37 {


	String Serialize(TreeNode root) {
		if(root == null){
			return "#,";
		}
		StringBuilder builder = new StringBuilder();
		builder.append(root.val+",");
		builder.append(Serialize(root.left));
		builder.append(Serialize(root.right));
		return builder.toString();
	}

	TreeNode PreOrder(Queue<String> q) {
		String str = q.poll();
		if(str.equals("#")){
			return null;
		}
		TreeNode node = new TreeNode(Integer.parseInt(str));
		node.left = PreOrder(q);
		node.right = PreOrder(q);
		return node;
	}

	TreeNode Deserialize(String str) {
		String[] string = str.split(",");
		Queue<String> q = new LinkedBlockingQueue<String>();
		for (int i = 0; i < string.length; ++i) {
			q.add(string[i]);
		}
		return PreOrder(q);
	}
	class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public static void main(String[] args) {

	}

}
