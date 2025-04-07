package com.itheima.innerClass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        // 目标：完成给数组排序，理解其中匿名内部类的用法
        // 准备一个学生类型的数组，存放6个学生对象。
        Student[] students = new Student[6];
        students[0] = new Student("小明", 18, 1.75, "男");
        students[1] = new Student("小红", 19, 1.70, "女");
        students[2] = new Student("小刚", 20, 1.77, "男");
        students[3] = new Student("小花", 21, 1.60, "女");
        students[4] = new Student("小黑", 21, 1.88, "男");
        students[5] = new Student("小黄", 22, 1.55, "女");

        // 需求：安年龄升序排序，可以调用Sun公司写好的API直接对数组进行排序
        // public static <T> void sort(T[] a, Comparator<? super T> c)
        //                          参数1 待排序的数组
        //                          参数2 通过声明一个Comparator比较器对象指定排序规则
        // sort方法会调用匿名内部类对线的compare方法,对数组中的学生对象进行两两比较，从而实现排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定排序规则：先按照年龄升序排序
                // 如果左边大于右边 返回正整数
                // 如果左边小于右边 返回负整数
                // 如果左边等于右边 返回0
//                if (o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else if (o1.getAge() < o2.getAge()) {
//                    return -1;
//                } else {
//                        return 0;
//                }
                // 一个更简化的做法
//                return o1.getAge() - o2.getAge(); // 按照年龄升序
                return o2.getAge() - o1.getAge(); // 按照年龄降序

            }

        });


        // 遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
