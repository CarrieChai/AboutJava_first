package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        // 目标：认识String类的创建方式和常用方法
        String s1 = "hello";    //推荐做法 此时存储在方法区的常量池中
        System.out.println(s1);

        String s2 = new String();   // 不推荐 此时s2存储在堆内存中
        System.out.println(s2);     // 空字符串  内部是一个""

        String s3 = new String("hello");    // 不推荐，此时s3存储在堆内存中
        System.out.println(s3);

        byte[] bytes = {97,98,99,100};
        String s4 = new String(bytes);  // 不推荐，此时s4存储在堆内存中
        System.out.println(s4);         // abcd

        System.out.println("===================================");
        // 通过双引号直接创建的字符串存储在常量池中，相同内容只放一个
        String s5 = "hello";
        String s6 = "hello";
        // 注意 == 比较的是地址
        System.out.println(s5 == s6);   // true

        // 通过new创建的字符串存储在堆内存中，每创建一个对象都会产生一个新的地址
        String s7 = new String("hello");
        String s8 = new String("hello");
        System.out.println(s7 == s8);   // false

        System.out.println("===================================");
        // 常见的String方法使用：字符串的比较和拼接
        // 假设需要输入正确的名称才能登录
        String realName = "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String inputName = sc.next();
        if(realName.equals(inputName)){     // equals比较的是内容，==比较地址，所以这里使用equals
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        System.out.println("===================================");
        // 使用String的拼接方法，使得手机号的中间四位是****
        System.out.println("请输入手机号：");
        String phone = sc.next();
        String newPhone = phone.substring(0,3) + "****" + phone.substring(7);
        System.out.println("您输入的手机号码是：");
        System.out.println(newPhone);

    }
}
