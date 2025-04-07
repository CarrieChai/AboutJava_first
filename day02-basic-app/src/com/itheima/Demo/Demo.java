package com.itheima.Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 需求：生成一个健康计算器 用于计算用户的BMI和BMR两个指标
        // 1 获取用户的身高、体重、性别、年龄
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your height:");
        Double height = sc.nextDouble();
        System.out.println("please input your weight:");
        Double weight = sc.nextDouble();
        System.out.println("please input your sex:");
        String sex = sc.next();
        System.out.println("please input your age:");
        int age = sc.nextInt();

        System.out.println("your bmi is "+getBMI(height,weight));
        System.out.println("your bmr is "+getBMR(sex,age,height,weight));

        //判断用户的BMI和BMR值

    }
    // 2 通过一个方法，计算BMI，并返回BMI的值
    public static double getBMI(double height,double weight){
        double bmi = weight / (height * height);
        return bmi;
    }
    // 3 通过一个方法，计算BMR，并返回BMR的值
    public static double getBMR(String sex,int age,double height,double weight){
        double bmr = 0;
        if(sex.equals("man")){
            bmr = 88.362+(13.397 * weight) + (4.799 * height*100) - (5.677 * age);
        }else if(sex.equals("woman")){
            bmr = 447.593+(9.6*weight)+(1.8*height*100)-(4.7*age);
        }
        return bmr;
    }

}
