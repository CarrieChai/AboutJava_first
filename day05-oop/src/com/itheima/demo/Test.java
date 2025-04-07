package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标 完成面向对象案例的练习
        //展示系统中的全部电影信息（每部电影展示名称、价格）
        //允许用户根据电音编号（ID）查询出某个电影的详细信息

        System.out.println("----------电影信息展示系统----------");
        Movie m1 = new Movie(1,"《速度与激情8》",88.8,"范·迪塞尔");
        //生成一些Movie对象 中文电影
        Movie m2 = new Movie(2,"《白日梦想家》",88.8,"不认识");
        Movie m3 = new Movie(3,"《热辣滚烫》",88.8,"贾玲");
        Movie m4 = new Movie(4,"《飞驰人生》",88.8,"沈腾");
        Movie m5 = new Movie(5,"《喜洋洋与灰太狼》",88.8,"喜洋洋");
        Movie m6 = new Movie(6,"《流浪地球》",88.8,"吴京");

        Movie [] movies = {m1,m2,m3,m4,m5,m6};
        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.printMovieInfo();
        System.out.println("-----------------------------------");
        System.out.println("请输入电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        movieOperator.findMovieById(id);
    }
}
