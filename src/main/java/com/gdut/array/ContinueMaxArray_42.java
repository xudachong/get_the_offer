package com.gdut.array;

import java.util.Stack;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:
 * @Date: Created in 17:09 2018/1/22
 * @
 */
public class ContinueMaxArray_42 {

	private static boolean g_InvalidInput = false;

	//动态规划，找出第i个数字结尾的子数组的最大和f(i)，f(i-1)<0,则不需要加前面的，f(i-1)>0则f(i-1)+data[i]
	public static int FindGreatestSumOfSubArray(int[] pData){
		if(pData == null || pData.length <= 0){
			g_InvalidInput = true;
			return -1;
		}
		g_InvalidInput = false;
		int sum = 0;
		int maxsum = 0;
		for(int i = 0;i < pData.length;i++){
			if(sum >= 0){
				sum += pData[i];
			}else {
				sum = pData[i];
			}
			if(sum > maxsum){
				maxsum = sum;
			}
		}
		return maxsum;
	}

	public static void main(String[] args) {

		int[] array = {1,-2,3,10,-4,7,2,-5};
		System.out.println(FindGreatestSumOfSubArray(array));
	}
}
