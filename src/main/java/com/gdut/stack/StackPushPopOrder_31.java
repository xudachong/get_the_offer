package com.gdut.stack;

import java.util.Stack;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:栈的压入，弹出序列
 * @Date: Created in 15:31 2018/2/27
 * @
 */
public class StackPushPopOrder_31 {

	public boolean IsPopOrder(int [] pushA,int [] popA) {
		boolean bPossible = false;
		if(pushA != null && popA != null && pushA.length != 0 && popA.length !=0){
			int nextPush = 0;
			int nextPop = 0;
			Stack stack = new Stack();
			while(nextPop < popA.length){
				while(stack.isEmpty() || Integer.parseInt((String)stack.peek()) != popA[nextPop]){
					if(nextPush == pushA.length){
						break;
					}
					stack.push(pushA[nextPush]);
					++nextPush;
				}
				if(Integer.parseInt((String)stack.peek()) != popA[nextPop]){
					break;
				}
				stack.pop();
				++nextPop;
			}
			if(stack.isEmpty() && nextPop == popA.length){
				bPossible = true;
			}
		}
		return bPossible;
	}

}
