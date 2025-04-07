package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        // 目标 搞清楚实体类是什么 搞清楚其基本作用和应用场景
        // 实体类的基本作用 封装数据

        Student s1 = new Student("张三", 18, 100, 100);
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        s2.setChinese_score(100);
        s2.setMath_score(95);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getChinese_score());
        System.out.println(s1.getMath_score());
        System.out.println("============");
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getChinese_score());
        System.out.println(s2.getMath_score());

        System.out.println("==========");

        // 对数据的操作 需要相应的类
        StudentOperator so = new StudentOperator(s1);
        so.printStudentInfo();
        so.printAverageScore();
        so.printTotalScore();
    }
}
