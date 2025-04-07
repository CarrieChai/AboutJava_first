package com.itheima.loop;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        // for循环几个案例
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please imput a number:");
//        int n = sc.nextInt();
//        System.out.println("sum 1~"+n+" is "+sum1(n));
//        System.out.println("==================");
//        System.out.println("please imput a number:");
//        int m = sc.nextInt();
//        System.out.printf(m+"之前的素数求和结果为："+sum2(m));
        System.out.println("==================");
        sxhs();

    }

    //计算1~n的和
    public static int sum1(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum  += i;
        }
        return sum;
    }

    // 求1~n之间的所有素数的和
    public static int sum2(int n){
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i ;
        }
        return sum;
    }

    public static void sxhs(){
        for (int i = 100; i < 1000; i++) {
            int ji = i%100%10; //个位
            int j2 = i%100/10; //十位
            int j3 = i/100; //百位
            if (i == ji*ji*ji+j2*j2*j2+j3*j3*j3){
                System.out.println(i);
            }

        }
    }
}
