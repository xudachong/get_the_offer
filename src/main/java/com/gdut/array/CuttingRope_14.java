package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:剪绳子，动态规划
 * @Date: Created in 18:28 2018/3/7
 * @
 */
public class CuttingRope_14 {

	public int maxProductAfterCutting_solution1(int length){
		if(length < 2){
			return 0;
		}
		if(length == 2){
			return 1;
		}
		if(length == 3){
			return 2;
		}
		int[] numbers = new int[length+1];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 2;
		numbers[3] = 3;
		int max = 0;
		for(int i = 4; i <= length; ++i){
			max = 0;
			for (int j = 1;j <= i/2;++j){
				int number = numbers[j] * numbers[i-j];
				if(max < number) {
					max = number;
				}
				numbers[i] = max;
			}
		}
		max = numbers[length];
		return max;
	}

}
