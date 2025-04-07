package com.itheima.javabean;

public class StudentOperator {
    private Student student;

    public StudentOperator(){}
    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printStudentInfo(){
        System.out.println("姓名：" + student.getName() + "\t年龄：" + student.getAge() + "\t语文成绩：" + student.getChinese_score() + "\t数学成绩：" + student.getMath_score());
    }

    //打印平均成绩
    public void printAverageScore(){
        double averageScore = (student.getChinese_score() + student.getMath_score()) / 2;
        System.out.println("平均成绩：" + averageScore);
    }

    //打印总成绩
    public void printTotalScore(){
        double totalScore = student.getChinese_score() + student.getMath_score();
        System.out.println("总成绩：" + totalScore);
    }

}
