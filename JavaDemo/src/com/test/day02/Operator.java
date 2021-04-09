package com.test.day02;
/**
* @author Jazlyn
* @version 创建时间：2021年4月8日 下午9:56:41
* 运算符
* 
*/
public class Operator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
//		因为a和b都是整型，运算结果也会是整型，所以直接截取小数点后面的数
		System.out.println(a/b);
//		模余运算（求余数）
		System.out.println(a%b);
//		++自增
		a++;
		System.out.println(a);
//		++a;
//		System.out.println(a);

	}
}
