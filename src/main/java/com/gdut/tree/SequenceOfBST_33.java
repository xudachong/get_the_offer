package com.gdut.tree;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:二叉搜索树的后序遍历序列
 * @Date: Created in 20:56 2018/2/27
 * @
 */
public class SequenceOfBST_33 {

	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length == 0){
			return false;
		}
		return seacher(sequence,0,sequence.length);
	}

	public boolean seacher(int [] sequence,int low,int length){
		int root = sequence[length-1];
		int i = 0;
		for(;i<length-1;++i){
			if(sequence[i] > root){
				break;
			}
		}
		for(int j = i;j<length-1;++j){
			if(sequence[j] < root){
				return false;
			}
		}
		boolean left = true;
		if(i > 0){
			left = seacher(sequence,low,i);
		}
		boolean right = true;
		if(i < length-1){
			right = seacher(sequence,i,length-i-1);
		}
		return left && right;
	}

}
