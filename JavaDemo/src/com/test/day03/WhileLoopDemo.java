package com.test.day03;
/**
* @author Jazlyn
* @version 创建时间：2021年4月9日 下午9:53:21
* do...while...：上来就执行循环体，再判断条件，如果条件成立则继续执行，直到条件不成立；
* while：上来先判断条件，如果条件成立，则执行循环，
*/
public class WhileLoopDemo {
	public static void main(String[] args) {
//		int x = -1;
//		do {
//			System.out.println(x);
//			x++;
//		} while (x>=0&&x<=5);
//		System.out.println("最后x为："+x);
		int y = -1;

		while (y>=0&&y<=5) {
			System.out.println(y);
			y++;
		}
		System.out.println("最后y为："+y);
	}
}
