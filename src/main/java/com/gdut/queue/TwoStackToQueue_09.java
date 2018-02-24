package com.gdut.queue;

import java.util.Stack;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:	两个栈实现队列，插入元素放在stack1，pop时，若stack2非空，则直接弹出Stack2的栈顶，若stack2为空，则把stack1元素全部push进
 * stack2，再pop出stack2的
 * @Date: Created in 0:28 2018/1/23
 * @
 */
public class TwoStackToQueue_09 {

	public static Stack stackFirst = new Stack();
	public static Stack stackSecond = new Stack();

	public static void push(Object obj){
		stackFirst.push(obj);
	}

	public static Object pop(){

		if (!stackSecond.empty()){
			return stackSecond.pop();
		}else {
			while (!stackFirst.empty()){
				stackSecond.push(stackFirst.pop());
			}
			return stackSecond.pop();
		}
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		push(4);
		System.out.println(pop());
		System.out.println(pop());
	}

}
