package com.itheima.interfacedemo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    // 学生的数据有：姓名、性别、成绩
    private String name;
    private String sex;
    private int score;


}
