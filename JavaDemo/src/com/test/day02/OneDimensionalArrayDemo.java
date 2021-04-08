package com.test.day02;
/**
* @author Jazlyn
* @version 创建时间：2021年4月1日 上午8:47:40
* 创建数组的格式：
* 一、不知数组里的元素
* 数据类型 [] 数组名 = new 数据类型[size]
* 二、已知数组里的元素
* 数据类型 [] 数组名 = {...};
* int类型的默认值为0
*/
public class OneDimensionalArrayDemo {
	public static void main(String[] args) {
//		不知数组里的元素
		int [] arr1 = new int [4];
//		已知数组里的元素
		int [] arr2 = {1,5,10};
//		数组赋值
		arr1[0] = 8;
//		数组取值
		int value1 = arr1[0];
		int value2 = arr1[1];
		System.out.println("value1:"+value1);
//		int类型的默认值为0
		System.out.println("value2:"+value2);
	}

}
