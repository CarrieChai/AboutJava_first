package com.itheima.interfacedemo3;
/*
* 需求
请设计一个班级学生的信息管理模块；
学生的数据有：姓名、性别、成绩
功能1：要求打印出全班学生的信息；
功能2：要求打印出全班学生的平均成绩
注意!以上功能的业务实现是有多套方案的，比如：
第1套方案：能打印出班级全部学生的信息；能打印班级全部学生的平均分。
第2套方案：能打印出班级全部学生的信息（包含男女人数）；能打印班级全部学生的平均分(要求是去掉最高分、最低分)
要求：系统可以支持灵活的切换这些实现方案
*
* */
public class Test {
    public static void main(String[] args) {
        // 目标：完成接口的小案例。
        // 1. 定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据。
        // 2. 准备学生数据，

        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("小明", "男", 100);
        allStudents[1] = new Student("小红", "女", 90);
        allStudents[2] = new Student("小花", "女", 80);
        allStudents[3] = new Student("小黄", "男", 70);
        allStudents[4] = new Student("小绿", "男", 60);
        allStudents[5] = new Student("小蓝", "女", 50);
        allStudents[6] = new Student("小紫", "女", 40);
        allStudents[7] = new Student("小黑", "男", 30);
        allStudents[8] = new Student("小灰", "男", 20);
        allStudents[9] = new Student("小黄", "男", 10);

        // 3. 提供两套业务实现方法，支持灵活切换（解耦合）：面向对象编程
        //      ---定义一个接口（规范思想）：要求打印出全班学生的信息；要求打印出全班学生的平均成绩
        //      ---定义第一套实现类，实现接口，完成打印学生信息和打印平均成绩的功能。
        //      ---定义第二套实现类，实现接口，完成打印学生信息（包含男女人数）和打印平均成绩（去掉最高最低分）的功能。
        ClassDataInter cdi = new ClassDateInterImpl2(allStudents);
        cdi.printAverageScores();
        cdi.printAllStudentsInfos();

    }
}
