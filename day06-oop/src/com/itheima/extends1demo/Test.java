package com.itheima.extends1demo;

public class Test {
    public static void main(String[] args) {
        // 目标 认识继承的好处
        // 1 创建对象 封装老师数据
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setAge(30);
        t1.setSex("男");
        t1.setSkill("Java");
        System.out.println(t1.getName() + " " + t1.getAge() + " " + t1.getSex() + " " + t1.getSkill());
    }
}
