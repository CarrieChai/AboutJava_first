package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标：面向对象编程实现智能家居控制系统
        // 角色：设备（吊灯、电视机、洗衣机、落地窗
        //      设备状态（开、关）
        // 谁来控制？智能控制系统（单例对象
        // 1. 定义设备类：创建设备对象代表家里的设备
        // 2. 准备这些设备对象，放到数组中，代表整个家庭的设备
        HouseholdAppliance[] HAs = new HouseholdAppliance[4];
        HAs[0] = new Lamp("吊灯", false);
        HAs[1] = new TV("电视机", false);
        HAs[2] = new WashingMachine("洗衣机", false);
        HAs[3] = new AirConditioner("空调", false);
        // 3. 所有家电的共有功能：开关  创建一个接口,让家电抽象类实现这个功能
        // 4. 创建一个控制类，控制这些家电的开关
        Control c = Control.getInstance();
        // 5. 控制开关
//        c.control(HAs[0]);

        // 6. 提示用户操作，循环操作，展示全部设备当前的情况并让用户选择操作
        while (true) {
            c.printAll(HAs);
            System.out.println("请选择您要操作的设备,输入0退出。");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= HAs.length) {
                c.control(HAs[choice - 1]);
            } else if (choice == 0){
                System.out.println("欢迎下次使用！");
                break;
            } else {
                System.out.println("您输入的设备编号有误，请重新输入！");
            }
        }


    }
}
