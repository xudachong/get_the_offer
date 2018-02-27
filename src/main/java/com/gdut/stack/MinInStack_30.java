package com.gdut.stack;

import java.util.Stack;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:包含最小函数的栈
 * @Date: Created in 14:49 2018/2/27
 * @
 */
public class MinInStack_30 {

	Stack stack = new Stack();
	Stack min_stack = new Stack();
	public void push(int node) {
		stack.push(node);
		if(min_stack.size() == 0 || node < Integer.parseInt((String)min_stack.peek())){
			min_stack.push(node);
		}else{
			min_stack.push(min_stack.peek());
		}
	}

	public void pop() {
		if(min_stack.size() == 0 || stack.size() == 0){
			return;
		}
		stack.pop();
		min_stack.pop();
	}

	public int top() {
		if(min_stack.size() == 0 || stack.size() == 0){
			return 0;
		}
		return Integer.parseInt((String)min_stack.peek());
	}

	public int min() {
		if(min_stack.size() == 0){
			return 0;
		}
		return Integer.parseInt((String)min_stack.peek());
	}

}
