package com.gdut.string;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:字符串的排列
 * @Date: Created in 21:25 2018/3/1
 * @
 */
public class StringPermutation_38 {

	public static void permutation(char[] s,int from,int to) {
		if(to < 0 || from <0 || s == null || s.length==0){
			return;
		}
		if(from == to) {
			System.out.println(s);
		} else {
			for(int i=from; i<=to; i++) {
				//交换前缀，使其产生下一个前缀
				swap(s,i,from);
				permutation(s, from+1, to);
				//将前缀换回，继续做上一个前缀的排列
				swap(s,from,i);
			}
		}
	}

	public static void swap(char[] s,int i,int j) {
		char tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}

	public static void main(String[] args) {
		char[] s = {'a','b','c'};
		permutation(s, 0, 2);
	}

}
