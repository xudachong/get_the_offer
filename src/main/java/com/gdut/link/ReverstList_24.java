package com.gdut.link;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:反转链表
 * @Date: Created in 20:47 2018/2/26
 * @
 */
public class ReverstList_24 {

	public ListNode ReverseList(ListNode head) {
		ListNode pReverseNode = null;
		ListNode preNode = null;
		ListNode pNode = head;
		while(pNode != null){
			ListNode pNext = pNode.next;
			if(pNext == null){
				pReverseNode = pNode;
			}
			pNode.next = preNode;
			preNode = pNode;
			pNode = pNext;
		}
		return pReverseNode;
	}

	class ListNode {
		int val;
		ListNode next = null;
		ListNode(int val) {
			this.val = val;
		}
	}

}
