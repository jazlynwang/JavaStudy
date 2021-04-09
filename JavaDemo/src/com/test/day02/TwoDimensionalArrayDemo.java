package com.test.day02;
/**
* @author Jazlyn
* @version 创建时间：2021年4月7日 上午8:36:37
* 类说明
* 二维数组
* 内部元素仍然是一维数组的数组
* 
* 创建：
* 一、未初始化数组的元素
* 数据类型 [] [] 数组名 = new 数据类型 [] []
* 赋值技巧：
* 第一个索引确定行
* 第二个索引确定列
*/
public class TwoDimensionalArrayDemo {
	public static void main(String[] args) {
//		创建一个二维数组，但是未初始化数组的元素
		int [][] arr1 = new int [3][2];
//		创建一个二维数组，并已知数组内部每个数组的所有元素
		int [][] arr2 = {{1,2},{3,4},{5,6}};
//		取值
		System.out.println(arr1[1][0]);
		System.out.println(arr2[2][0]);
//		赋值
		arr2[0][1] = 10;
		System.out.println(arr2[0][1]);
//		
		int [][] arr3 = {{1,2},{3,4,5},{6,7,8,9}};
//		
		int [][] arr4 = new int [3][2];
		arr4[0] = new int [] {1,2};
		arr4[1] = new int [] {3,4,5};
		arr4[2] = new int [] {6,7,8,9};
		System.out.println(arr4[2][3]);
		
		

		}
	}
