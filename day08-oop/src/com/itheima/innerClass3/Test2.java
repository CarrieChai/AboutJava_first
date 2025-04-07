package com.itheima.innerClass3;

public class Test2 {
    public static void main(String[] args) {
        // 目标：搞清楚匿名内部类的使用形式（语法）：通常可以作为一个对象参数传输给方法使用
        // 需求：学生、老师都要参加游泳比赛。
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳呼呼呼呼~~~");
            }
        };
        start(s1);
        System.out.println("==============");
        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师游泳哗啦啦啦~~~");
            }
        });


    }
    // 设计一个方法，可以接受老师和学生开始比赛
    public static void start(Swim s){
        System.out.println("比赛开始");
        s.swimming();
        System.out.println("比赛结束");
    }
}


interface Swim{
    public void swimming();
}
