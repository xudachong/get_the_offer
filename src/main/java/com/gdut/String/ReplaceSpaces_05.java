package com.gdut.string;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:替换空格
 * @Date: Created in 17:03 2018/2/24
 * @
 */
public class ReplaceSpaces_05 {

	public static int count(String string){
		int count = 0;
		for (int i = 0; i < string.length(); ++i) {
			if(string.charAt(i) == ' '){
				++count;
			}
		}
		return count;
	}

	public static void printChar(char[] charTemp){
		for (char i : charTemp) {
			System.out.print(i);
		}
	}
	public static void replace(String string){
		if(string == null || string.length() <= 0){
			return;
		}
		int length = string.length();
		int newLength = length + count(string)*2;
		char[] newTemp = new char [newLength];
		System.arraycopy(string.toCharArray(),0,newTemp,0,string.length());
		System.out.print("原字符：");
		printChar(newTemp);
		int indexOfOriginal = length-1;
		int indexOfNew = newLength-1;
		while(indexOfOriginal >=0 && indexOfOriginal != indexOfNew) {
			if (newTemp[indexOfOriginal] == ' ') {
				newTemp[indexOfNew--] = '0';
				newTemp[indexOfNew--] = '2';
				newTemp[indexOfNew--] = '%';
				--indexOfOriginal;
			}else {
				newTemp[indexOfNew--] = newTemp[indexOfOriginal--];
			}
		}
		System.out.print("替换空格后的字符串：");
		printChar(newTemp);
	}


//	public static void replace(String oldString){
//		String newString = oldString.replace(" ","%20");
//		System.out.println(newString);
//	}
	public static void main(String[] args) {
		replace("We are happy.");
	}

}
