package com.itheima.loop;

public class EndlessLoopDemo5 {
    public static void main(String[] args) {
        // 目标：死循环的写法
        test();
    }

    public static void test() {
        // while死循环 经典写法
//        while(true) {
//            System.out.println("死循环");
//        }

        // for死循环
//        for ( ;   ;  ) {
//            System.out.println("死循环");
//        }

        // do...while死循环
        do {
            System.out.println("死循环");
        }while (true);
    }
}
