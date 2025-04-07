package com.itheima.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    // 姓名 年龄 身高 性别
    private String name;
    private int age;
    private double height;
    private String sex;


    public static int compareByAge(Student s1, Student s2){
        return s1.getAge() - s2.getAge();// 升序
    }

    public int compareByHeight(Student o1,Student o2){
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
