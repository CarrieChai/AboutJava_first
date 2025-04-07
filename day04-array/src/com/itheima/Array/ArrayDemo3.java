package com.itheima.Array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 目标 使用数组求最大最小值
        double arr[] = {77,85,98,66,97,92,59,93,60};
        calc(arr);

    }

    public static void calc(double arr[]){
        int n = arr.length;
        double sum = arr[0];
        double max = arr[0];
        double min = arr[0];
        for (int i = 1; i < n; i++) {
            double data = arr[i];
            sum += data;
            if(data > max){
                max = data;
            }else if(data <min){
                min = data;
            }
        }
        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);
        System.out.println("总和是："+sum);
        System.out.println("平均值是："+sum/n);
    }

}
