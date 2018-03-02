package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:礼物的最大价值
 * @Date: Created in 17:16 2018/3/2
 * @
 */
public class MaxValueOfGifts_47 {

	public static int getMaxValue(int[][] values){
		if(values == null || values.length == 0){
			throw new IllegalArgumentException("输入有误");
		}
		int[] max = new int[values[0].length];
		for(int i = 0;i < values.length; ++i){
			for(int j = 0;j < values[0].length;++j){
				int left = 0;
				int up = 0;
				if(i > 0){
					up = max[j];
				}
				if(j > 0) {
					left = max[j-1];
				}
				max[j] = (up > left ? up :left) + values[i][j];
			}
		}
		return max[values[0].length-1];
	}

	public static int getMaxValue_solution(int[][] values){
		if(values == null || values.length == 0){
			throw new IllegalArgumentException("输入有误");
		}
		int[][] max = new int[values.length][values[0].length];
		for(int i = 0;i < values.length; ++i){
			for(int j = 0;j < values[0].length;++j){
				int left = 0;
				int up = 0;
				if(i > 0){
					up = max[i-1][j];
				}
				if(j > 0) {
					left = max[i][j-1];
				}
				max[i][j] = (up > left ? up :left) + values[i][j];
			}
		}
		return max[values.length-1][values[0].length-1];
	}

	public static void main(String[] args) {
		int[][] gifts = {{1, 10, 3, 8},
						{12, 2, 9, 6},
						{5, 7, 4, 11},
						{3, 7, 16, 5}};
		System.out.println(getMaxValue_solution(gifts));
	}
}
