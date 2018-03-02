package com.gdut.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: XuJuLong<5 7 4 4 0 8 5 7 8 @ qq.com>
 * @Description:把数组排成最小的数
 * @Date: Created in 15:03 2018/3/2
 * @
 */
public class SortArrayForMinNumber_45 {
	public String PrintMinNumber1(int [] numbers) {
		String res = "";
		if(numbers==null || numbers.length == 0){
			return res;
		}
		MString1 m[] = new MString1[numbers.length];
		String st[] = Int2String(numbers);
		int k=0;
		for(String i:st){
			m[k] = new MString1();
			m[k++].s = i;
		}
		MString1Comparator m1c = new MString1Comparator();
		Arrays.sort(m,m1c);
		for (int i = 0; i < m.length; i++) {
			res+=m[i].s;
		}
		return res;
	}
	public String[] Int2String(int[] a) {
		String b[] = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = String.valueOf(a[i]);
		}
		return b;
	}
	class MString1{
		public String s;
	}
	//方法二：无需修改要比较的类T。只需要写一个新的比较器类x，实现Comparator<T>接口，重写compareTo(T t1，T t2)方法。
	//然后Arrays.sort(T[],x)自动会对这个T[]数组采用x比较器方法，调用这个比较器。可实现复用。以后更改比较器方法方便了。
	class MString1Comparator implements Comparator<MString1> {
		public int compare(MString1 o1, MString1 o2) {
			String s1 = o1.s+o2.s;
			String s2 = o2.s+o1.s;
			if(s1.compareTo(s2) > 0){
				return 1;
			}else if(s1.compareTo(s2) <0) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		SortArrayForMinNumber_45 sort = new SortArrayForMinNumber_45();
		int arr[] = {3,32,321};
		System.out.println(sort .PrintMinNumber1(arr));
	}
}
