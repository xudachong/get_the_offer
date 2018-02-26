package com.gdut.link;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:合并有序链表
 * @Date: Created in 21:01 2018/2/26
 * @
 */
public class MergeSortLists_25 {

	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		ListNode mergeHead = list1;
		if(mergeHead.val <= list2.val){
			mergeHead.next = Merge(list1.next,list2);
		}else{
			mergeHead = list2;
			mergeHead.next = Merge(list1,list2.next);
		}
		return mergeHead;
	}
	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
