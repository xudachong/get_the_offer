package com.gdut.queue;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:从上到下打印二叉树
 * @Date: Created in 15:43 2018/2/27
 * @
 */
public class PrintTreeFromTopToBottom_32_01 {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode T) {
		ArrayList<Integer> list = new ArrayList();
		if(T==null) {
			return list;
		}
		BlockingQueue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
		queue.offer(T);
		while(!queue.isEmpty())
		{
			T=queue.poll();
			list.add(T.val);
			if(T.left!=null) {
				queue.offer(T.left);
			}
			if(T.right!=null) {
				queue.offer(T.right);
			}
		}
		return list;
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
