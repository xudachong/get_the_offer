package com.gdut.string;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:表示数值的字符串
 * @Date: Created in 16:48 2018/2/26
 * @
 */
public class NumericStrings_20 {
	/**
	 * 方法一：用正则表达式
	 * 优点：简单
	 * 缺点：本题的目的是让你用代码实现正则表达式的内部代码，该方法面试中不能用
	 * @param str
	 * @return
	 */
	public boolean isNumeric_1(char[] str) {
		String string = String.valueOf(str);
		return string.matches("[\\+-]?[0-9]+(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
	}

	/**
	 * 数组下标成员变量
	 */
	int index;

	public boolean isNumeric_2(char[] str) {
		// 输入异常
		if (str == null){
			return false;
		}
		index = 0;
		// 正负号开头
		if (str[index] == '+' || str[index] == '-'){
			index++;
		}
		if (index == str.length){
			return false;
		}
		// 设置numeric判断是否为数字
		boolean numeric = true;
		scanDigits(str);
		if (index != str.length) {
			// 小数
			if (str[index] == '.') {
				index++;
				scanDigits(str);
				if (index < str.length && (str[index] == 'e' || str[index] == 'E')){
					numeric = isExponential(str);
				}
			} else if (str[index] == 'e' || str[index] == 'E'){
				numeric = isExponential(str);
			}
			else {
				// 出现了异常字符
				numeric = false;
			}
		}

		return numeric && index == str.length;
	}

	/**
	 * 扫描数组，如果当前字符为数字，index++
	 * @param str
	 */
	private void scanDigits(char[] str) {
		while (index < str.length && str[index] >= '0' && str[index] <= '9'){
			index++;
		}
	}

	/**
	 * 判断是否为科学计数法表示的数值的结尾部分
	 * @param str
	 * @return
	 */
	private boolean isExponential(char[] str) {
		if (str[index] != 'e' && str[index] != 'E'){
			return false;
		}
		index++;
		if (index == str.length){
			return false;
		}
		if (str[index] == '+' || str[index] == '-'){
			index++;
		}
		if (index == str.length){
			return false;
		}
		scanDigits(str);
		// 如果存在特殊字符，index不会为str.length
		return index == str.length ? true : false;
	}

}
