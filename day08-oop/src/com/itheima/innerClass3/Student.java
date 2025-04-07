package com.itheima.innerClass3;

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
}
