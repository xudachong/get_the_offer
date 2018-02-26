package com.gdut.link;

import java.util.List;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:
 * @Date: Created in 12:12 2018/2/26
 * @
 */
public class DeleteDuplicatedNode_18_02 {

	public static ListNode Duplication(ListNode pHead){
		if(pHead == null){
			throw new IllegalArgumentException("错误输入");
		}
		ListNode preNode = new ListNode();
		ListNode pNode = pHead;
		while(pNode != null){
			ListNode pNext = pNode.next;
			boolean needDelete = false;
			if(pNext != null && pNext.value == pNode.value){
				needDelete = true;
			}
			if(!needDelete){
				preNode = pNode;
				pNode = pNode.next;
			}else {
				int value = pNode.value;
				ListNode toBeDelete = pNode;
				while (toBeDelete != null && toBeDelete.value == value){
					pNext = toBeDelete.next;
					toBeDelete = pNext;
				}
				if(preNode == null){
					return pNext;
				}else {
					preNode.next = pNext;
					pNode = pNext;
				}
			}
		}
		return pHead;
	}

	static class ListNode{
		int value;
		ListNode next;
		ListNode(){
		}
		ListNode(int value){
			this.value = value;
		}
	}

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode secondThree = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode secondFour = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = secondThree;
		secondThree.next = four;
		four.next = secondFour;
		secondFour.next = five;
		System.out.println(Duplication(one).next.next.value);
	}

}
