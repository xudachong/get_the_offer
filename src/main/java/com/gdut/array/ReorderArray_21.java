package com.gdut.array;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:调整数组顺序使奇数位于偶数前面
 * @Date: Created in 18:35 2018/2/26
 * @
 */
public class ReorderArray_21 {

	public void order(int[] arr){
		if(arr == null){
			return;
		}
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			if(isEven(arr[i]) && !isEven(arr[j])){
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
			else if(!isEven(arr[i]) && isEven(arr[j])){
				i++;
			}
			else if(isEven(arr[i]) && isEven(arr[j])){
				j--;
			}else{
				i++;
				j--;
			}
		}
	}
	public boolean isEven(int n){
		return (n & 1) == 0;
	}
	public static void main(String[] args){
		ReorderArray_21 test = new ReorderArray_21();
		int[] arr= {1,2,3,4,5,6,12,7,8,9,10};
		test.order(arr);
		for(int i = 0;i<arr.length ;i++){
			System.out.print(arr[i]+",");
		}
	}

}
