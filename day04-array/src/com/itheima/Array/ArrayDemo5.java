package com.itheima.Array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目标 学习二维数组的定义和基本用法
        print2DArray();

    }

    public static void print2DArray(){
        String classroom[][] = {
                {"张三","李四","朱标","朱文正"},
                {"周兴德","汤和","徐达"},
                {"沐英","李文忠","朱元璋","马秀英"},
                {"邓愈","燕乾","邵荣"}
        };

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("================");

        int arr[][] = new int[3][5];  // 内部存储的数据默认值是0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
