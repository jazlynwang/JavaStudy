package com.test.day01;
/**
* @author Jazlyn
* @version 创建时间：2021年3月31日 下午11:28:48
* 类说明
*/
public class VariableDemo {
	/**
	 * Java中的两种数据类型：基本数据类型；引用数据类型
	 * 基本数据类型包括四类八种：
	 * 一、逻辑类型：布尔类型boolean:true/false
	 * 二、整数类型:byte(1个字节)、short(2个字节)、int(4个字节)、long(8个字节)
	 * 三、浮点型:float(单精度)、double(双精度)
	 * 四、字符型:char() 只能有一个字符，且需要用''
	 * @param args
	 */
	public static void main(String[] args) {
		//布尔型
		boolean a = true;
		//整型
		byte b = 5;
		short d = 2;
		int c = 3;
		long e = 1;
		//浮点型
		float m = 3.14f;//向上自动升级；需强制转换
		double n = 3.14;
		//字符型
		char sex = '男';
	}
}
