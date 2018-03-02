package com.gdut.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:第一个只出现一次的字符
 * @Date: Created in 21:54 2018/3/2
 * @
 */
public class FirstNotRepeatingChar_50_01 {

	public static char firstNotRepeating(String s){
		Character c = '\0';
		if(s == null || s.length() == 0){
			return c;
		}
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length();i++) {
			c = s.charAt(i);
			if(map.containsKey(c)){
				map.put(c,-1);
			}else{
				map.put(c,1);
			}
		}
		c = '\0';
		Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
		for (Map.Entry<Character,Integer> entry: entrySet) {
			if(entry.getValue() > 0){
				return c = entry.getKey();
			}
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.println(firstNotRepeating("abaccdeff"));
	}

}
