package com.itheima.lambda;

import com.itheima.innerClass3.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目标：用Lambda表达式简化Comparator接口的使用

    }

    public static void sort1(){
        Student[] students = new Student[3];
        students[0] = new Student("小明", 25,181.5, "男");
        students[1] = new Student("小红", 18, 165.5, "女");
        students[2] = new Student("小花", 22, 170.5, "女");

        // （形参列表）->{方法体}
//        Arrays.sort(students,(Student o1, Student o2)->{
//            return o1.getAge() - o2.getAge(); // 按照年龄升序
//        });

//        Arrays.sort(students,( o1,  o2)->{
//            return o1.getAge() - o2.getAge(); // 按照年龄升序
//        });

        Arrays.sort(students,( o1,  o2)-> o1.getAge() - o2.getAge()); // 按照年龄升序

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void method2(){
        JFrame jf = new JFrame("登录窗口"); // 窗口
        jf.setSize(300,200); // 宽高
        jf.setLocationRelativeTo(null); // 居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 点击关闭按钮，程序退出

        JPanel jp = new JPanel();
        jf.add(jp); // 添加面板

        JButton btn = new JButton("登录");
        jp.add(btn);

        // java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，从而做出反应
//        btn.addActionListener(new ClickListener());
        // 开发中不是我们要主动去写匿名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类，我们才会写
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点击了登录按钮");
//            }
//        });
        // 简化代码
//        btn.addActionListener((ActionEvent e) -> {
//            System.out.println("点击了登录按钮");
//        });

//        btn.addActionListener( e -> {
//            System.out.println("点击了登录按钮");
//        });

        btn.addActionListener( e -> System.out.println("点击了登录按钮"));


        jf.setVisible(true); // 显示窗口

    }
}
