package com.gdut.math;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:
 * @Date: Created in 21:15 2018/2/25
 * @
 */
public class Print1ToMaxOfNDigits {

	public static void prinf1ToMaxNDigits(int n){
		if(n < 0){
			throw new IllegalArgumentException("不能输负数");
		}
		StringBuffer number = new StringBuffer();
		for (int i = 0; i < n; ++i) {
			number.append('0');
		}
		for (int i = 0;i < 10;++i){
			number.setCharAt(0, (char) (i+'0'));
			prinf1ToMaxNDigitsRecursively(number,n,0);
		}
	}
	public static void prinf1ToMaxNDigitsRecursively(StringBuffer number,int length,int index){
		if(index == length-1){
			prinfNumber(number);
			return;
		}
		for(int i = 0;i < 10;++i){
			number.setCharAt(index+1, (char) (i+'0'));
			prinf1ToMaxNDigitsRecursively(number,length,index+1);
		}
	}

	public static void prinfNumber(StringBuffer number){
		boolean isBegging0 = true;
		int nLength = number.length();
		for (int i = 0;i < nLength;++i){
			if(isBegging0 && number.charAt(i) != '0'){
				isBegging0 = false;
			}
			if(!isBegging0){
				System.out.print(number.charAt(i));
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		prinf1ToMaxNDigits(2);
	}

}
