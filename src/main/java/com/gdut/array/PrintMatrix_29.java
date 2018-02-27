package com.gdut.array;

import java.util.ArrayList;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:顺时针打印矩阵
 * @Date: Created in 14:04 2018/2/27
 * @
 */
public class PrintMatrix_29 {

	public ArrayList<Integer> printMatrix(int [][] matrix) {
		if(matrix == null){
			return null;
		}
		ArrayList<Integer> list = new ArrayList();
		int start = 0;
		while(matrix.length > 2*start && matrix[0].length > 2*start){
			printMatrixInCircle(matrix,list,start);
			++start;
		}
		return list;
	}
	public void printMatrixInCircle(int [][] matrix,ArrayList<Integer> list,int start){
		int endX = matrix[0].length-1-start;
		int endY = matrix.length-1-start;
		for(int i = start;i <= endX;++i){
			list.add(matrix[start][i]);
		}
		if(start < endY){
			for(int i = start+1;i <= endY;++i){
				list.add(matrix[i][endX]);
			}
		}
		if(start < endY && start < endX){
			for(int i = endX-1;i >= start;--i){
				list.add(matrix[endY][i]);
			}
		}
		if(start < endY-1 && start < endX){
			for(int i = endY-1;i >= start+1;--i){
				list.add(matrix[i][start]);
			}
		}
	}

}
