package com.itheima.Array;

import java.util.Random;

public class ArrayTest6 {
    public static void main(String[] args) {
        // 华容道
        // hrd();
        test();
    }
    //华容道 n行n列的二维数组随机打乱
    public static void hrd(){
        int n = 5;
        int arr[][] = new int[n][n];
        int num = 1;
        // 赋值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num++;
            }
        }

        printArray(arr);
        System.out.println("=======================");

        //打乱
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int row_index = r.nextInt(n);
                int col_index = r.nextInt(n);
                int temp = arr[row_index][col_index];
                arr[row_index][col_index] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        printArray(arr);
    }

    //如果一个二维数组每一行的数组元素个数不同，应该怎么打乱
    // 可以把二维数组拉平成一维数组，然后问题就变成了如何打乱一维数组
    public static void test(){
        //原二维数组
        String classroom[][] = {
                {"张三","李四","朱标","朱文正"},
                {"周兴德","汤和","徐达"},
                {"沐英","李文忠","朱元璋","马秀英"},
                {"邓愈","燕乾"}
        };
        printStringArray(classroom);

        // 获取原二维数组的总元素个数
        int len = 0;
        for (int i = 0; i < classroom.length; i++) {
            len += classroom[i].length;
        }

        // 创建一个临时的一维数组 将原本的二维数组拉长放到一维数组中
        String temp[] = new String[len];
        int index = 0;
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                temp[index++] = classroom[i][j];
            }
        }

        //打乱一维数组
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            int swap_index = r.nextInt(len);
            String tem = temp[i];
            temp[i] = temp[swap_index];
            temp[swap_index] = tem;
        }
        //将打乱后的信息放回原二维数组中
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                classroom[i][j] = temp[--index];

            }
        }
        printStringArray(classroom);


    }

    public static void printStringArray(String arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }



}
