package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:在一个行和列都有序的二维数组中查找某个元素
 * @Date: Created in 16:16 2018/2/24
 * @
 */
public class FindInPartiallySortedMatrix_04 {

	public static boolean Find(int[][] array,int number){
		boolean found = false;

		if(array != null && array.length > 0 && array[0].length >0) {
			int row =0;
			int column = array[0].length - 1;
			while (row < array.length && column > 0){
				if(array[row][column] == number){
					found = true;
					break;
				}else if(array[row][column] > number){
					--column;
				}else {
					++row;
				}
			}
		}
		return found;
	}

	public static void main(String[] args) {
		int[][] array = {
				{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15}
		};
		System.out.println(Find(array,7));
	}

}
