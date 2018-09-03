package com.gdut.string;

import java.util.LinkedList;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:
 * @Date: Created in 20:46 2018/3/14
 * @
 */
public class ReverseWordsInSentence_58_01 {

	public String reverseSentence(String pData){
		if(pData == null){
			return "error!!!";
		}
		char[] newData = pData.toCharArray();
		reverse(newData,0,pData.length()-1);
		int begin = 0;
		for (int i = 1; i < newData.length; i++) {
			if(newData[i] == ' '){
				reverse(newData,begin,i-1);
				begin = i + 1;
			}
		}
		reverse(newData,begin,newData.length-1);
		return new String(newData);
	}

	private void reverse(char[] newWord,int pBegin,int pEnd){
		if(newWord == null){
			return;
		}
		while (pBegin < pEnd){
			char temp = newWord[pBegin];
			newWord[pBegin] = newWord[pEnd];
			newWord[pEnd] = temp;
			pBegin++;
			pEnd--;
		}
	}

	public static void main(String[] args) {
		ReverseWordsInSentence_58_01 test = new ReverseWordsInSentence_58_01();
		System.out.println(test.reverseSentence("Let's do Java"));
	}

}
