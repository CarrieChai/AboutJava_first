package com.itheima.interfacedemo3;

public class ClassDateInterImpl1 implements ClassDataInter{
    private Student[] students;

    public ClassDateInterImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentsInfos() {
        System.out.println("全班学生信息如下");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName()+"\t"+s.getSex()+"\t"+s.getScore());
        }
    }

    @Override
    public void printAverageScores() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum = sum + s.getScore();
        }
        System.out.println("全班平均成绩为："+(sum/students.length));

    }
}
