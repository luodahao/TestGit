package com.ldh.test;

/**
 * @author ldahao
 * @create 2018/11/20
 */
public class MyTest2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时:" + (endTime - startTime));
    }
}
