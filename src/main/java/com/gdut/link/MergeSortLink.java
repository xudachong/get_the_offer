package com.gdut.link;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:
 * @Date: Created in 20:09 2018/2/24
 * @
 */
public class MergeSortLink {

	public LinkNode MergeLinkList(LinkNode head1,LinkNode head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		LinkNode mergeHead = head1;
		if(mergeHead.value < head2.value){
			mergeHead.next = MergeLinkList(head1.next,head2);
		}else {
			mergeHead = head2;
			mergeHead.next = MergeLinkList(head1,head2.next);
		}
		return mergeHead;
	}
	public static class LinkNode{
		int value;
		LinkNode next;
	}
}
