package com.itheima.interfacedemo3;

//完成打印学生信息（包含男女人数）和打印平均成绩（去掉最高最低分）的功能。

public class ClassDateInterImpl2 implements ClassDataInter{
    private Student[] students;

    public ClassDateInterImpl2(Student[] students) {
        this.students = students;
    }

    // 打印学生信息（包含男女人数）
    @Override
    public void printAllStudentsInfos() {
        System.out.println("全班学生信息如下");
        int maleCount = 0;
        int femaleCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName()+"\t"+s.getSex()+"\t"+s.getScore());
            if (s.getSex().equals("男")) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        System.out.println("男学生人数为："+maleCount);
        System.out.println("女学生人数为："+femaleCount);

    }

    // 打印平均成绩（去掉最高最低分）
    @Override
    public void printAverageScores() {
        double sum = 0;
        double max = students[0].getScore();
        double min = students[0].getScore();
        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("平均成绩为：");
        System.out.println((sum - max - min)/(students.length-2));
        System.out.println("最高成绩为："+max);
        System.out.println("最低成绩为："+min);


    }
}
