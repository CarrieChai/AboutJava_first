package com.itheima.loop;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        // forѭ����������
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please imput a number:");
//        int n = sc.nextInt();
//        System.out.println("sum 1~"+n+" is "+sum1(n));
//        System.out.println("==================");
//        System.out.println("please imput a number:");
//        int m = sc.nextInt();
//        System.out.printf(m+"֮ǰ��������ͽ��Ϊ��"+sum2(m));
        System.out.println("==================");
        sxhs();

    }

    //����1~n�ĺ�
    public static int sum1(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum  += i;
        }
        return sum;
    }

    // ��1~n֮������������ĺ�
    public static int sum2(int n){
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i ;
        }
        return sum;
    }

    public static void sxhs(){
        for (int i = 100; i < 1000; i++) {
            int ji = i%100%10; //��λ
            int j2 = i%100/10; //ʮλ
            int j3 = i/100; //��λ
            if (i == ji*ji*ji+j2*j2*j2+j3*j3*j3){
                System.out.println(i);
            }

        }
    }
}
