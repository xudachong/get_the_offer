package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:N皇后问题
 * @Date: Created in 23:03 2018/3/1
 * @
 */
public class NQueen_38 {
	int N;
	int sum=0;
	int[] columnIndex;
	public int totalQueue(int n){
		if(n <= 0){
			throw new IllegalArgumentException("皇后个数有错误");
		}
		N = n;
		columnIndex = new int[n+1];
		recursive(1);
		return sum;
	}

	public void recursive(int tier){
		if(tier > N){
			++sum;
		}else {
			for (int j = 1; j <= N; ++j) {
				columnIndex[tier] = j;
				if (canPut(tier)) {
					recursive(tier + 1);
				}
			}
		}
	}

	public boolean canPut(int row){
		for(int i = 1;i < row;++i) {
			if (Math.abs(row - i) == Math.abs(columnIndex[row]-columnIndex[i]) || columnIndex[row] == columnIndex[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		NQueen_38 nq = new NQueen_38();
		System.out.println(nq.totalQueue(8));
	}

}
