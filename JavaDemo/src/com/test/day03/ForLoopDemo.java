package com.test.day03;

import java.util.concurrent.CountDownLatch;

/**
* @author Jazlyn
* @version 创建时间：2021年4月9日 下午9:15:47
* for循环语句
* for(int i=1; i<=10;i++){
* 		System.out.println(i)
* }
* 
*/
public class ForLoopDemo {
	public static void main(String[] args) {
//		求1到10的和
//		int sum = 0;
//		String begin = "0";
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			begin += ("+"+i);
//		}
//		System.out.println(sum);
//		System.out.println(begin);
		
//		多层循环
//		int num = 0;
//		
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("外层循环"+i);
//			for (int j = 0; j <= 2; j++) {
//				System.out.println("内层循环"+j);
//				num += 1;
//			}
//		}
//		System.out.println("共循环了"+num+"次");
		
//		int [] arr = {10,20,30};
//		普通for循环语法
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		增强式for循环语法（针对取出全部数据）
//		for (int a:arr) {
//			System.out.println(a);
//		}
		
		int [][] datas = {{1,2},{3,4},{5,6}};
//		普通for循环语法
//		for (int i = 0; i < datas.length; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.println(datas[i][j]);
//			}
//		}
//		增强for循环语法
//		for (int abc : datas) {
//			System.out.println(abc);
//		}
//		快捷键：fore+回车
		for (int [] arr1:datas) {
			for (int i :arr1) {
				System.out.println(i);
			}
		}
	}
}
