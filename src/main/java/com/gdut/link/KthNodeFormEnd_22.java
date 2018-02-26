package com.gdut.link;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:链表中倒数第K个结点
 * @Date: Created in 19:13 2018/2/26
 * @
 */
public class KthNodeFormEnd_22 {

	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<=0){
			return null;
		}

		ListNode last=head;
		for(int i=1;i<k;i++){
			if(head.next!=null){
				head=head.next;
			}else{
				return null;
			}
		}
		while(head.next!=null){
			head = head.next;
			last=last.next;
		}
		return last;

	}

	class ListNode{
		int value;
		ListNode next;
	}

}
