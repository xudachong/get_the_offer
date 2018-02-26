package com.gdut.link;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:求环的连接点
 * @Date: Created in 19:43 2018/2/26
 * @
 */
public class EntryNodeInListLoop_23 {

	public ListNode EntryNodeOfLoop(ListNode pHead)
	{
		if(pHead == null || pHead.next == null){
			return null;
		}
		//快指针每次走两步
		ListNode fast = pHead;
		//每次走一步
		ListNode slow = pHead;
		//因为fast每次要走两步，所有需要判断fast的下一个是否为空
		while(fast!=null && fast.next !=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			//判断是否相遇 相遇后让快指针从头开始走，每次都是走一步，第二次相遇的节点就是环的入口
			if(fast.val == slow.val)
			{
				//要是判断是否有环则可以直接在这里返回
				fast = pHead;
				while(fast.val != slow.val)
				{
					fast = fast.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		//要是没有相遇，此链表没有环返回空
		return null;
	}

	class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val = val;
		}
	}

}
