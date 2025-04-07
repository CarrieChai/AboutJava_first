package com.itheima.brach;

public class IfTest1 {
    public static void main(String[] args) {
        // 目标 设计一个自动驾驶系统 通过识别到的交通信号灯的情况控制汽车是否继续行驶
        test();
    }

    public static void test() {
        boolean red = false;
        boolean green = false;
        boolean yellow = false;

        if (red){
            System.out.println("stop");
        } else if (green) {
            System.out.println("go");
        } else if(yellow){
            System.out.println("slow down");
        } else{
            System.out.println("error");
        }
    }
}
