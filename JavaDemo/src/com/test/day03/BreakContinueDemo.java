package com.test.day03;

/**
 * Created by jazlyn-zone on 2021/4/12.
 */
public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            if (i == 3){
//                break;//通过break关键字来打破整个循环
                continue;//通过continue来忽略某次循环
            };
            System.out.println(i);
        }
    }
}
