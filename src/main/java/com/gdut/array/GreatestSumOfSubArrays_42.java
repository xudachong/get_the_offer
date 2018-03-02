package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:连续子数组的最大和
 * @Date: Created in 11:00 2018/3/2
 * @
 */
public class GreatestSumOfSubArrays_42 {

	public int FindGreatestSum(int[] array){
		int max = array[0];
		int sum = array[0];
		if(array == null || array.length == 0){
			throw new IllegalArgumentException("输入有误");
		}
		for(int i = 0;i < array.length;++i){
			if(sum < 0){
				sum = array[i];
			}else {
				sum += array[i];
			}
			if(sum > max){
				max = sum;
			}
		}
		return max;
	}

	public int FindRecursive(int[] array){
		int sum = array[0];
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			sum = (sum+array[i]) > array[i] ? (sum+array[i]) : array[i];
			if(sum >= max) {
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		GreatestSumOfSubArrays_42 sum = new GreatestSumOfSubArrays_42();
		int[] array = {1,-2,3,10,-4,7,2,-5};
		System.out.println(sum.FindRecursive(array));
	}

}
