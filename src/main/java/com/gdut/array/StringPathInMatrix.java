package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:矩阵中的路径
 * @Date: Created in 0:16 2018/9/4
 * @
 */
public class StringPathInMatrix {

	private static boolean checkPath(String[][] matrix, String path){
		boolean[][] gone = new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(checkEachOne(matrix, gone, i, j, path, 0)){
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkEachOne(String[][] matrix, boolean[][] gone,int x, int y, String path, int location){

		if(location == path.length()){
			return true;
		}
		boolean hasPath = false;
		String expectWay = path.substring(location, location + 1);
		if(x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length && !gone[x][y] && matrix[x][y].equals(expectWay)){
			gone[x][y] = true;
			location++;
			hasPath = checkEachOne(matrix, gone, x, y-1, path, location) ||
					checkEachOne(matrix, gone, x, y+1, path, location) ||
					checkEachOne(matrix, gone, x-1, y, path, location) ||
					checkEachOne(matrix, gone, x+1, y, path, location);
			if(!hasPath){
				gone[x][y] = false;
				location -= 1;
			}
		}
		return hasPath;
	}

	public static void main(String[] args) {

		String[][] matrix = {
				{"a","b","t","g"},
				{"c","f","c","s"},
				{"j","d","e","h"}
		};
		String path = "bfce";
		System.out.println(checkPath(matrix, path));
	}

}
