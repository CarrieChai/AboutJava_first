package com.itheima.Array;

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标 掌握静态初始化数组的基本使用
//        String names[] = {"张三","李四","王五","赵六"};
        String names[] = new String []{"张三","李四","王五","赵六"};

        Random r = new Random();
        System.out.println("请这位同学回答问题："+names[r.nextInt(names.length)]);

    }


}
