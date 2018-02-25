package com.gdut.Recursive;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:求第n个斐波那契数
 * @Date: Created in 11:27 2018/2/25
 * @
 */
public class Fibonacci_10 {

	public static long Fibonacci(int n){
		int result[] = {0,1};
		if(n<2){
			return result[n];
		}
		long one = 0;
		long two = 1;
		long fib = 0;
		for (int i = 2;i<=n;i++){
			fib = one + two;
			one = two;
			two = fib;
		}
		return fib;
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci(5));
	}

}
